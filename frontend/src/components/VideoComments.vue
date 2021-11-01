<style lang="css" css-build-single="">
    @import "../../overall.css";
</style>

<template>
    <ytd-comments id="comments" class="style-scope ytd-watch-flexy">
        <!--css-build:shady-->
        <ytd-item-section-renderer
            id="sections"
            initial-count="2"
            class="style-scope ytd-comments">
            <!--css-build:shady-->
            <div id="header" class="style-scope ytd-item-section-renderer">
                <ytd-comments-header-renderer class="style-scope ytd-item-section-renderer">
                    <!--css-build:shady-->
                    <div id="title" class="style-scope ytd-comments-header-renderer">
                        <h2 id="count" class="style-scope ytd-comments-header-renderer">
                            <yt-formatted-string
                                class="count-text style-scope ytd-comments-header-renderer">
                                <span dir="auto" class="style-scope yt-formatted-string">댓글
                                </span>
                                <span dir="auto" class="style-scope yt-formatted-string">{{commentNum}}</span>
                                <span dir="auto" class="style-scope yt-formatted-string">개</span>
                            </yt-formatted-string>
                        </h2>
                        <span id="sort-menu" class="style-scope ytd-comments-header-renderer">
                            <yt-sort-filter-sub-menu-renderer
                                class="style-scope ytd-comments-header-renderer">
                                <!--css-build:shady-->
                                <tp-yt-paper-tooltip
                                    class="style-scope yt-sort-filter-sub-menu-renderer"
                                    role="tooltip"
                                    tabindex="-1">
                                    <!--css-build:shady-->
                                    <div id="tooltip" class="hidden style-scope tp-yt-paper-tooltip">
                                        댓글 정렬
                                    </div>
                                </tp-yt-paper-tooltip>
                                <yt-dropdown-menu
                                    class="style-scope yt-sort-filter-sub-menu-renderer has-items">
                                    <!--css-build:shady-->
                                    <tp-yt-paper-menu-button
                                        dynamic-align=""
                                        class="style-scope yt-dropdown-menu"
                                        role="group"
                                        aria-haspopup="true"
                                        horizontal-align="left"
                                        vertical-align="top"
                                        aria-disabled="false">
                                        <!--css-build:shady-->
                                        <div id="trigger" class="style-scope tp-yt-paper-menu-button">
                                            <tp-yt-paper-button
                                                id="label"
                                                class="dropdown-trigger style-scope yt-dropdown-menu"
                                                slot="dropdown-trigger"
                                                aria-expanded="false"
                                                role="button"
                                                tabindex="0"
                                                animated=""
                                                elevation="0"
                                                aria-disabled="false"
                                                aria-label="댓글 정렬">
                                                <!--css-build:shady-->

                                                <yt-icon id="label-icon" class="style-scope yt-dropdown-menu">
                                                    <svg
                                                        viewBox="0 0 24 24"
                                                        preserveAspectRatio="xMidYMid meet"
                                                        focusable="false"
                                                        class="style-scope yt-icon"
                                                        style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                        <g class="style-scope yt-icon">
                                                            <path
                                                                d="M21,6H3V5h18V6z M15,11H3v1h12V11z M9,17H3v1h6V17z"
                                                                class="style-scope yt-icon"></path>
                                                        </g>
                                                    </svg>
                                                    <!--css-build:shady-->
                                                </yt-icon>
                                                <div id="icon-label" class="style-scope yt-dropdown-menu">정렬 기준</div>
                                                <dom-if class="style-scope yt-dropdown-menu">
                                                    <template is="dom-if"></template>
                                                </dom-if>
                                                <dom-if class="style-scope yt-dropdown-menu">
                                                    <template is="dom-if"></template>
                                                </dom-if>
                                            </tp-yt-paper-button>
                                        </div>

                                        <tp-yt-iron-dropdown
                                            id="dropdown"
                                            class="style-scope tp-yt-paper-menu-button"
                                            horizontal-align="left"
                                            vertical-align="top"
                                            aria-disabled="false"
                                            aria-hidden="true"
                                            style="outline: none; display: none;">
                                            <!--css-build:shady-->
                                            <div id="contentWrapper" class="style-scope tp-yt-iron-dropdown">
                                                <div
                                                    slot="dropdown-content"
                                                    class="dropdown-content style-scope tp-yt-paper-menu-button">
                                                    <tp-yt-paper-listbox
                                                        id="menu"
                                                        class="dropdown-content style-scope yt-dropdown-menu"
                                                        slot="dropdown-content"
                                                        role="listbox"
                                                        tabindex="0">
                                                        <!--css-build:shady-->

                                                        <a
                                                            class="yt-simple-endpoint style-scope yt-dropdown-menu iron-selected"
                                                            aria-selected="true"
                                                            tabindex="0">
                                                            <tp-yt-paper-item
                                                                class="style-scope yt-dropdown-menu"
                                                                role="option"
                                                                tabindex="0"
                                                                aria-disabled="false">
                                                                <!--css-build:shady-->
                                                                <tp-yt-paper-item-body class="style-scope yt-dropdown-menu">
                                                                    <!--css-build:shady-->
                                                                    <div class="item style-scope yt-dropdown-menu">인기 댓글순</div>
                                                                    <div secondary="" id="subtitle" class="style-scope yt-dropdown-menu" hidden=""></div>

                                                                </tp-yt-paper-item-body>
                                                                <yt-reload-continuation class="style-scope yt-dropdown-menu"></yt-reload-continuation>

                                                            </tp-yt-paper-item>
                                                        </a>

                                                        <a
                                                            class="yt-simple-endpoint style-scope yt-dropdown-menu"
                                                            tabindex="-1"
                                                            aria-selected="false">
                                                            <tp-yt-paper-item
                                                                class="style-scope yt-dropdown-menu"
                                                                role="option"
                                                                tabindex="0"
                                                                aria-disabled="false">
                                                                <!--css-build:shady-->
                                                                <tp-yt-paper-item-body class="style-scope yt-dropdown-menu">
                                                                    <!--css-build:shady-->
                                                                    <div class="item style-scope yt-dropdown-menu">최근 날짜순</div>
                                                                    <div secondary="" id="subtitle" class="style-scope yt-dropdown-menu" hidden=""></div>

                                                                </tp-yt-paper-item-body>
                                                                <yt-reload-continuation class="style-scope yt-dropdown-menu"></yt-reload-continuation>

                                                            </tp-yt-paper-item>
                                                        </a>
                                                        <dom-repeat id="repeat" class="style-scope yt-dropdown-menu">
                                                            <template is="dom-repeat"></template>
                                                        </dom-repeat>

                                                    </tp-yt-paper-listbox>
                                                </div>
                                            </div>
                                        </tp-yt-iron-dropdown>
                                    </tp-yt-paper-menu-button>
                                </yt-dropdown-menu>
                            </yt-sort-filter-sub-menu-renderer>
                        </span>
                    </div>
                    <div
                        id="red-commenting-div"
                        class="style-scope ytd-comments-header-renderer"
                        hidden="">
                        <yt-formatted-string
                            id="red-commenting-text"
                            class="style-scope ytd-comments-header-renderer">
                            <!--css-build:shady-->
                        </yt-formatted-string>
                    </div>
                    <div id="alert" class="style-scope ytd-comments-header-renderer"></div>
                    <div
                        id="prefilled-dialog-header"
                        class="style-scope ytd-comments-header-renderer"></div>
                    <div id="simple-box" class="style-scope ytd-comments-header-renderer">
                        <ytd-comment-simplebox-renderer
                            class="style-scope ytd-comments-header-renderer">
                            <!--css-build:shady-->
                            <yt-img-shadow
                                id="author-thumbnail"
                                height="40"
                                width="40"
                                class="style-scope ytd-comment-simplebox-renderer no-transition"
                                style="background-color: transparent;"
                                loaded="">
                                <!--css-build:shady-->
                                <img
                                    id="img"
                                    class="style-scope yt-img-shadow"
                                    alt="이섭섭"
                                    height="40"
                                    width="40"
                                    src="https://yt3.ggpht.com/yti/APfAmoErw2Et1bOnYQOKuvHX3J_2JgVviPNx9n_zJA=s88-c-k-c0x00ffffff-no-rj"/></yt-img-shadow>
                            <div id="placeholder-area" class="style-scope ytd-comment-simplebox-renderer">
                                <yt-formatted-string
                                    id="simplebox-placeholder"
                                    role="textbox"
                                    tabindex="0"
                                    class="style-scope ytd-comment-simplebox-renderer">
                                    <div
                                        id="contenteditable-root"
                                        contenteditable="true"
                                        dir="auto"
                                        class="style-scope yt-formatted-string"
                                        aria-label="공개 댓글 추가…"
                                        ref="commentContents"
                                        >
                                    </div>
                                </yt-formatted-string>
                            </div>
                            <div id="attachments" class="style-scope ytd-comment-simplebox-renderer">
                                <div id="image-button" class="style-scope ytd-comment-simplebox-renderer"></div>
                            </div>
                            <div
                                id="comment-dialog"
                                class="style-scope ytd-comment-simplebox-renderer"
                                hidden=""></div>

                        </ytd-comment-simplebox-renderer>
                        <div id="footer" class="style-scope ytd-commentbox">
                            <div id="buttons" class="style-scope ytd-commentbox">
                                
                                <ytd-button-renderer
                                    id="submit-button"
                                    class="style-scope ytd-commentbox style-primary size-default"
                                    use-keyboard-focused=""
                                    button-renderer="true"
                                    is-paper-button=""
                                    @click="postComment"
                                    >
                                    <a class="yt-simple-endpoint style-scope ytd-button-renderer" tabindex="-1">
                                        <tp-yt-paper-button
                                            id="button"
                                            class="style-scope ytd-button-renderer style-primary size-default"
                                            role="button"
                                            tabindex="-1"
                                            animated=""
                                            elevation="0"
                                            aria-disabled="true"
                                            aria-label="댓글"
                                            style="pointer-events: none;">
                                            <!--css-build:shady-->
                                            <yt-formatted-string
                                                id="text"
                                                class="style-scope ytd-button-renderer style-primary size-default">댓글</yt-formatted-string>
                                        </tp-yt-paper-button>
                                    </a>
                                </ytd-button-renderer>
                                <div id="option-menu" class="style-scope ytd-commentbox"></div>
                            </div>
                        </div>
                    </div>

                    <div
                        id="backstage-post-dialog"
                        class="style-scope ytd-comments-header-renderer"></div>
                    <div id="post-stream-filter" class="style-scope ytd-comments-header-renderer"></div>
                    <div id="zero-state-message" class="style-scope ytd-comments-header-renderer"></div>
                    <div
                        id="scheduling-zero-state-message"
                        class="style-scope ytd-comments-header-renderer"></div>
                </ytd-comments-header-renderer>
            </div>

            <div id="contents" class="style-scope ytd-item-section-renderer">
                <CommentsRootItem v-for="(item, index) in commentsList" :key="index" :commentInfo="item" :userInfo="userInfo"/>
                <ytd-continuation-item-renderer class="style-scope ytd-item-section-renderer">
                    <!--css-build:shady-->
                    <div id="ghost-cards" class="style-scope ytd-continuation-item-renderer"></div>
                    <tp-yt-paper-spinner
                        id="spinner"
                        class="style-scope ytd-continuation-item-renderer"
                        aria-hidden="true">
                        <!--css-build:shady-->
                        <div id="spinnerContainer" class="  style-scope tp-yt-paper-spinner">
                            <div class="spinner-layer layer-1 style-scope tp-yt-paper-spinner">
                                <div class="circle-clipper left style-scope tp-yt-paper-spinner">
                                    <div class="circle style-scope tp-yt-paper-spinner"></div>
                                </div>
                                <div class="circle-clipper right style-scope tp-yt-paper-spinner">
                                    <div class="circle style-scope tp-yt-paper-spinner"></div>
                                </div>
                            </div>
                            <div class="spinner-layer layer-2 style-scope tp-yt-paper-spinner">
                                <div class="circle-clipper left style-scope tp-yt-paper-spinner">
                                    <div class="circle style-scope tp-yt-paper-spinner"></div>
                                </div>
                                <div class="circle-clipper right style-scope tp-yt-paper-spinner">
                                    <div class="circle style-scope tp-yt-paper-spinner"></div>
                                </div>
                            </div>
                            <div class="spinner-layer layer-3 style-scope tp-yt-paper-spinner">
                                <div class="circle-clipper left style-scope tp-yt-paper-spinner">
                                    <div class="circle style-scope tp-yt-paper-spinner"></div>
                                </div>
                                <div class="circle-clipper right style-scope tp-yt-paper-spinner" >
                                    <div class="circle style-scope tp-yt-paper-spinner"></div>
                                </div>
                            </div>
                            <div class="spinner-layer layer-4 style-scope tp-yt-paper-spinner">
                                <div class="circle-clipper left style-scope tp-yt-paper-spinner">
                                    <div class="circle style-scope tp-yt-paper-spinner"></div>
                                </div>
                                <div class="circle-clipper right style-scope tp-yt-paper-spinner">
                                    <div class="circle style-scope tp-yt-paper-spinner"></div>
                                </div>
                            </div>
                        </div>
                    </tp-yt-paper-spinner>
                    <div id="button" class="style-scope ytd-continuation-item-renderer" hidden=""></div>
                </ytd-continuation-item-renderer>
            </div>

        </ytd-item-section-renderer>
    </ytd-comments>
</template>

<script>
import axios from "axios"
import 'url-search-params-polyfill'
import CommentsRootItem from './CommentsRootIem.vue'

export default{
    components:{
        CommentsRootItem
    },
    created(){
        this.updateComments();
        this.updateCommentsNums();
        axios
                .get('/userInfo')
                .then(response => {
                    this.userInfo = response.data;
                    console.log(this.userInfo);
                });
    },
    data(){
        return {
            commentInput: "",
            commentNum: 0,
            userInfo :{
                userName: "Lee ki chan",
                profileUrl: "https://yt3.ggpht.com/yti/APfAmoErw2Et1bOnYQOKuvHX3J_2JgVviPNx9n_zJA=s88-c-k-c0x00ffffff-no-rj",
                email: "asdf1234@anve.rom"
            },

            commentsList: [
                /*{
                    userInfoDto: {
                        userName: "Lee ki chan",
                        profileUrl: "https://yt3.ggpht.com/ytc/AKedOLTyfjkMHkTuj5PicJsHqbdBu1g8YIVpkCIhLw=s88-c-k-c0x00ffffff-no-rj"
                    },
                    commentId: 1,
                    isLiked: false,
                    likes: 64,
                    content: "와ㅇㄴㄹdd 나중에 영상많이 모으시면, 진짜 '코딩 상식 사전' 하나 출판 하셔도 좋을 것 같아요!!\n 초보로서 책 찾아보면 이런 상식들 이해하기 쉽게 적힌것도 많이 없고, 보통 책들이 특정 범주만 깊게 다루고 있어서 아쉬운게 많았거든요 ㅠㅠ",
                    createdDate: "2 년 전"
                }*/
                
            ],
        }
    },
    methods:{
        updateComments(){
            axios.get("/comments/getcomments/" + this.$route.query.id)
            .then(response => {
                console.log(response);
                for(var i = 0; i < response.data.length; i++){
                    response.data[i].createdDate = this.strToDate(response.data[i].createdDate);
                }
                this.commentsList = response.data;
            });
        },
        updateCommentsNums(){
            axios.get("/comments/howmany/" + this.$route.query.id)
            .then(response => {
                this.commentNum = response.data;
            });
        },
        postComment(){
            var textToSend = this.$refs.commentContents.innerText;
            var videoId = this.$route.query.id;
            console.log(this.$refs.commentContents.innerText);
            var params = new URLSearchParams();
            params.append('commentContent', textToSend);
            params.append('videoId', parseInt(videoId));
            axios.post("/comments/postcomments", params).
            then(()=>{this.updateComments();}
            );
            this.$refs.commentContents.innerText = "";
        },
        strToDate(strs) {
            var ret = Date.parse(strs);
            console.log(ret);
            console.log(new Date().getTime());
            var gap = new Date().getTime() - ret;
            gap = gap / 1000;
            if (gap < 60) {
                ret = gap.toFixed(0) + "초";
            } else if (gap < 3600) {
                ret = (gap / 60).toFixed(0) + "분";
            } else if (gap < 3600 * 24) {
                ret = (gap / 3600).toFixed(0) + "시간";
            } else if (gap < 3600 * 24 * 7) {
                ret = (gap / 3600 / 24).toFixed(0) + "일";
            } else if (gap < 3600 * 24 * 30) {
                ret = (gap / 3600 / 24 / 7 ).toFixed(0)+ "주";
            } else if (gap < 3600 * 24 * 365) {
                ret = (gap / 3600 / 24 / 30).toFixed(0) + "개월";
            } else {
                ret = (gap / 3600 / 24 / 365).toFixed(0) + "년";
            }
            return ret;
        }
    }
}

</script>