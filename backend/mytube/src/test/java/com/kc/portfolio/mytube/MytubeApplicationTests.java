package com.kc.portfolio.mytube;

import com.kc.portfolio.mytube.service.KeywordService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;

@SpringBootTest
class MytubeApplicationTests {

	@Autowired
	RedisTemplate redisTemplate;

	@Autowired
	KeywordService keywordService;

	@Test
	void contextLoads() {
		final String key = "a";
		final String data = "sd1";

		final ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
		valueOperations.set(key, data);

		final String result = valueOperations.get(key);
		assertThat(result, is(equalTo(data)));
	}

	@Test
	void 검색어자동완성_테스트() {
		final String keyword = "이런 요것이 자동완성?!?!";
		final String data = "1";


		keywordService.insertKeyword(keyword);

		keywordService.getKeywords("이런").forEach(p->System.out.println(p));
	}

}
