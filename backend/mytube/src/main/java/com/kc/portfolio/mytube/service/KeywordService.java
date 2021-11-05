package com.kc.portfolio.mytube.service;

import com.kc.portfolio.mytube.config.auth.dto.SessionUser;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
public class KeywordService {
    private final RedisTemplate redisTemplate;
    static final String[] CHO = {"ㄱ","ㄲ","ㄴ","ㄷ","ㄸ","ㄹ","ㅁ","ㅂ","ㅃ", "ㅅ","ㅆ","ㅇ","ㅈ","ㅉ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ"};
    static final String[] JOONG = {"ㅏ","ㅐ","ㅑ","ㅒ","ㅓ","ㅔ","ㅕ","ㅖ","ㅗ","ㅘ", "ㅙ","ㅚ","ㅛ","ㅜ","ㅝ","ㅞ","ㅟ","ㅠ","ㅡ","ㅢ","ㅣ"};
    static final String[] JONG = {"","ㄱ","ㄲ","ㄳ","ㄴ","ㄵ","ㄶ","ㄷ","ㄹ","ㄺ","ㄻ","ㄼ", "ㄽ","ㄾ","ㄿ","ㅀ","ㅁ","ㅂ","ㅄ","ㅅ","ㅆ","ㅇ","ㅈ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ"};
    static final Map<String, Integer> choMap = new HashMap<>();
    static final Map<String, Integer> joongMap = new HashMap<>();
    static final Map<String, Integer> jongMap = new HashMap<>();



    private static final String HASH_KEY = "hash_key";
    private static final String HASH_KEY_TO_KEYWORD = "keyToKeyword";
    private static final String HASH_KEYWORD_TO_KEY = "keywordToKey";
    private static final String ZSET_KEY_PREFIX = "keywords:";


    public List<String> getRecommendedKeyword(String prefix, SessionUser sessionUser){
        return getKeywords(prefix);
    }



    public void insertKeyword(String keyword){
        keyword = keyword.toLowerCase(Locale.ROOT);

        final HashOperations<String, String, String> hashOperations = redisTemplate.opsForHash();
        String hashKey = hashOperations.get(HASH_KEYWORD_TO_KEY, keyword);
        if(hashKey == null){
            BoundValueOperations<String, String> boundValueOperations = redisTemplate.boundValueOps(HASH_KEY);
            hashKey = boundValueOperations.increment().toString();
        }


        hashOperations.put(HASH_KEY_TO_KEYWORD, hashKey, keyword);
        hashOperations.put(HASH_KEYWORD_TO_KEY, keyword, hashKey);


        keyword = divideHangul(keyword);
        final ZSetOperations<String, String> zSetOperations = redisTemplate.opsForZSet();
        for(int i = 0; i <= keyword.length(); i++){
            zSetOperations.incrementScore(ZSET_KEY_PREFIX+keyword.substring(0, i), hashKey, 1);
        }
    }
    public List<String> getKeywords(String prefix){
        prefix = divideHangul(prefix.toLowerCase(Locale.ROOT));
        Set<String> recommended_set = redisTemplate.opsForZSet().reverseRange(ZSET_KEY_PREFIX+prefix, 0, 10);
        return recommended_set.stream().map(p->(String)redisTemplate.opsForHash().get(HASH_KEY_TO_KEYWORD, p)).collect(Collectors.toList());
    }



    public static void intializeHashMap(){
        for(int i = 0; i < CHO.length; i++)
            choMap.put(CHO[i], i);
        for(int i = 0; i < JOONG.length; i++)
            joongMap.put(JOONG[i], i);
        for(int i = 0; i < JONG.length; i++)
            jongMap.put(JONG[i], i);
    }
    public static String divideHangul(String text){
        StringBuilder ret = new StringBuilder();

        for(int i = 0; i < text.length(); i++) {
            char uniVal = text.charAt(i);
            // 한글일 경우만 시작해야 하기 때문에 0xAC00부터 아래의 로직을 실행한다
            if (uniVal >= 0xAC00) {
                uniVal = (char) (uniVal - 0xAC00);
                char cho = (char) (uniVal / 28 / 21);
                char joong = (char) ((uniVal) / 28 % 21);
                char jong = (char) (uniVal % 28);
                // 종성의 첫번째는 채움이기 때문
                ret.append(CHO[cho]);
                ret.append(JOONG[joong]);
                ret.append(JONG[jong]);
            } else {
                ret.append(uniVal);
            }
        }
        return ret.toString();
    }
    public static String combineHangul(String text){
        if(choMap.size() <= 0)
            intializeHashMap();
        StringBuilder ret = new StringBuilder();
        int cho = -1;
        int joong = -1;
        int jong = 0;
        for(int i = 0; i < text.length(); i++) {
            char uniVal = text.charAt(i);
            // 한글일 경우만 시작해야 하기 때문에 0xAC00부터 아래의 로직을 실행한다
            if (uniVal >= 'ㄱ' && uniVal <= 'ㅣ') {
                if(uniVal <= 'ㅎ'){
                    if(cho == -1){
                        cho = choMap.get(String.valueOf(uniVal));
                    }else if(joong != -1){
                        if(jong == 0){
                            jong = jongMap.get(String.valueOf(uniVal));
                        }else{
                            ret.append(convertToHangul(cho, joong, jong));
                            cho = choMap.get(String.valueOf(uniVal));
                            joong = -1; jong = 0;
                        }
                    }else{
                        ret.append(convertToHangul(cho, joong, jong));
                        cho = choMap.get(String.valueOf(uniVal));
                        joong = -1; jong = 0;
                    }
                }else{
                    if(cho == -1){
                        joong = joongMap.get(String.valueOf(uniVal));
                        ret.append(convertToHangul(cho, joong, jong));
                        cho = -1; joong = -1; jong = 0;
                    }else if(joong == -1){
                        joong = joongMap.get(String.valueOf(uniVal));
                    }else if(jong != 0){
                        ret.append(convertToHangul(cho, joong, 0));
                        System.out.println("asdfasdf");
                        cho = choMap.get(JONG[jong]);
                        joong = joongMap.get(String.valueOf(uniVal));
                        jong = 0;
                    }else{
                        ret.append(convertToHangul(cho, joong, 0));
                        ret.append(convertToHangul(-1, joongMap.get(String.valueOf(uniVal)), 0));
                        cho = -1; joong = -1; jong = 0;
                    }
                }
            }else{
                ret.append(convertToHangul(cho, joong, jong));
                cho = -1; joong = -1; jong = 0;
                ret.append(uniVal);
            }
        }
        ret.append(convertToHangul(cho, joong, jong));
        return ret.toString();
    }
    private static String convertToHangul(int cho, int joong, int jong){
        if(cho == -1 && joong == -1) {
            return "";
        }if(cho!= -1 && joong == -1) {
            return CHO[cho];
        }if(cho== -1 && joong != -1){
            return JOONG[joong];
        }else{
            return String.valueOf((char)((cho*21 + joong)*28+jong+0xAC00));
        }
    }


}
