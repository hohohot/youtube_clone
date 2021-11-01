<style lang="css" css-build-single="">
    @import "../../overall.css";
</style>

<template>
    <ytd-comment-thread-renderer class="style-scope ytd-item-section-renderer">
        <ytd-comment-renderer
            id="comment"
            comment-style="unknown"
            class="style-scope ytd-comment-thread-renderer"
            style="--ytd-comment-paid-background-color: initial; --ytd-decorated-comment-reply-box-height-offset:0px;">
            <div id="body" class="style-scope ytd-comment-renderer">
                <div id="author-thumbnail" class="style-scope ytd-comment-renderer">
                    <a
                        href="/channel/UCCQEezMwBTnkZcJxIArQ_dQ"
                        class="yt-simple-endpoint style-scope ytd-comment-renderer">
                        <yt-img-shadow
                            fit=""
                            height="40"
                            width="40"
                            loaded=""
                            class="style-scope ytd-comment-renderer no-transition"
                            style="background-color: transparent;">
                            <img
                                id="img"
                                alt="Dong Hun Lee"
                                height="40"
                                width="40"
                                :src="commentInfo.userInfoDto.profileUrl"
                                class="style-scope yt-img-shadow"/></yt-img-shadow>
                    </a>
                </div>
                <div id="main" class="style-scope ytd-comment-renderer">
                    <div id="header" class="style-scope ytd-comment-renderer">
                        <div
                            id="pinned-comment-badge"
                            hidden="hidden"
                            class="style-scope ytd-comment-renderer"></div>
                        <div id="header-author" class="style-scope ytd-comment-renderer">
                            <h3 class="style-scope ytd-comment-renderer">
                                <a
                                    id="author-text"
                                    href="/channel/UCCQEezMwBTnkZcJxIArQ_dQ"
                                    class="yt-simple-endpoint style-scope ytd-comment-renderer">
                                    <span class="style-scope ytd-comment-renderer">
                                        {{commentInfo.userInfoDto.userName}}
                                    </span>
                                </a>
                            </h3>
                            <span
                                id="author-comment-badge"
                                hidden="hidden"
                                class="style-scope ytd-comment-renderer"></span>
                            <span
                                id="sponsor-comment-badge"
                                hidden="hidden"
                                class="style-scope ytd-comment-renderer"></span>
                            <yt-formatted-string
                                has-link-only_=""
                                class="published-time-text above-comment style-scope ytd-comment-renderer">
                                <a
                                    spellcheck="false"
                                    href="/watch?v=iE29lbjbow0&amp;lc=UgzIfrCjp6ho_Y0V1f54AaABAg"
                                    dir="auto"
                                    class="yt-simple-endpoint style-scope yt-formatted-string">{{commentInfo.createdDate}}
                                    전</a>
                            </yt-formatted-string>
                            <span id="author-reputation" class="style-scope ytd-comment-renderer"></span>
                            <span
                                id="sponsors-only-badge"
                                hidden="hidden"
                                class="style-scope ytd-comment-renderer"></span>
                            <span
                                id="moderation-reason-divider"
                                hidden="hidden"
                                class="style-scope ytd-comment-renderer">
                                •
                            </span>
                            <span
                                id="moderation-reason-text"
                                hidden="hidden"
                                class="style-scope ytd-comment-renderer"></span>
                        </div>
                    </div>
                    <ytd-expander
                        id="expander"
                        max-number-of-lines="4"
                        collapsed=""
                        should-use-number-of-lines=""
                        class="style-scope ytd-comment-renderer"
                        style="--ytd-expander-max-lines:4;">
                        <div id="content" class="style-scope ytd-expander">
                            <yt-formatted-string
                                slot="content"
                                id="voted-option"
                                disable-upgrade=""
                                hidden=""
                                class="style-scope ytd-comment-renderer"></yt-formatted-string>
                            <yt-pdg-comment-chip-renderer
                                slot="content"
                                id="paid-comment-chip"
                                hidden=""
                                class="style-scope ytd-comment-renderer">
                                <div
                                    id="comment-chip-container"
                                    class="style-scope yt-pdg-comment-chip-renderer">
                                    <yt-icon class="style-scope yt-pdg-comment-chip-renderer"></yt-icon>
                                    <span id="comment-chip-price" class="style-scope yt-pdg-comment-chip-renderer"></span>
                                </div>
                            </yt-pdg-comment-chip-renderer>
                            <yt-formatted-string
                                slot="content"
                                id="content-text"
                                split-lines=""
                                class="style-scope ytd-comment-renderer">{{commentInfo.content}}</yt-formatted-string>
                        </div>
                        <tp-yt-paper-button
                            id="less"
                            aria-expanded="true"
                            noink=""
                            hidden=""
                            role="button"
                            tabindex="0"
                            animated=""
                            elevation="0"
                            aria-disabled="false"
                            class="style-scope ytd-expander">
                            <span slot="less-button" class="less-button style-scope ytd-comment-renderer">간략히</span>
                        </tp-yt-paper-button>
                        <tp-yt-paper-button
                            id="more"
                            aria-expanded="false"
                            noink=""
                            hidden=""
                            role="button"
                            tabindex="0"
                            animated=""
                            elevation="0"
                            aria-disabled="false"
                            class="style-scope ytd-expander">
                            <span slot="more-button" class="more-button style-scope ytd-comment-renderer">자세히 보기</span>
                        </tp-yt-paper-button>
                    </ytd-expander>
                    <yt-formatted-string
                        hidden=""
                        has-link-only_=""
                        class="published-time-text below-comment style-scope ytd-comment-renderer">
                        <a
                            spellcheck="false"
                            href="/watch?v=iE29lbjbow0&amp;lc=UgzIfrCjp6ho_Y0V1f54AaABAg"
                            dir="auto"
                            class="yt-simple-endpoint style-scope yt-formatted-string">{{commentInfo.createdDate}}</a>
                    </yt-formatted-string>
                    <ytd-comment-action-buttons-renderer
                        id="action-buttons"
                        system-icons=""
                        action-buttons-style="desktop-toolbar"
                        class="style-scope ytd-comment-renderer">
                        <div id="toolbar" class="style-scope ytd-comment-action-buttons-renderer">
                            <div id="reply-button" class="style-scope ytd-comment-action-buttons-renderer"></div>
                            <span
                                id="vote-count-left"
                                hidden="hidden"
                                aria-label="좋아요 64개"
                                class="style-scope ytd-comment-action-buttons-renderer">
                                64
                            </span>
                            <ytd-toggle-button-renderer
                                @click="clickLike"
                                id="like-button"
                                icon-size="16"
                                use-keyboard-focused=""
                                system-icons=""
                                button-renderer="true"
                                is-icon-button=""
                                has-no-text=""
                                class="style-scope ytd-comment-action-buttons-renderer style-text size-default">
                                <a
                                    tabindex="-1"
                                    class="yt-simple-endpoint style-scope ytd-toggle-button-renderer">
                                    <yt-icon-button
                                        id="button"
                                        touch-feedback=""
                                        class="style-scope ytd-toggle-button-renderer style-text size-default">
                                        <button
                                            id="button"
                                            aria-label="나와 사용자 64명이 이 댓글을 좋아함"
                                            aria-pressed="false"
                                            class="style-scope yt-icon-button">
                                            <yt-icon class="style-scope ytd-toggle-button-renderer">
                                                <svg
                                                    v-if="!commentInfo.isLiked"
                                                    viewBox="0 0 16 16"
                                                    preserveAspectRatio="xMidYMid meet"
                                                    focusable="false"
                                                    class="style-scope yt-icon"
                                                    style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                    <g class="style-scope yt-icon">
                                                        <path
                                                            d="M12.42,14A1.54,1.54,0,0,0,14,12.87l1-4.24C15.12,7.76,15,7,14,7H10l1.48-3.54A1.17,1.17,0,0,0,10.24,2a1.49,1.49,0,0,0-1.08.46L5,7H1v7ZM9.89,3.14A.48.48,0,0,1,10.24,3a.29.29,0,0,1,.23.09S9,6.61,9,6.61L8.46,8H14c0,.08-1,4.65-1,4.65a.58.58,0,0,1-.58.35H6V7.39ZM2,8H5v5H2Z"
                                                            class="style-scope yt-icon"></path>
                                                    </g>
                                                </svg>
                                                <svg
                                                    v-if="commentInfo.isLiked"
                                                    viewBox="0 0 24 24"
                                                    preserveAspectRatio="xMidYMid meet"
                                                    focusable="false"
                                                    class="style-scope yt-icon"
                                                    style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                    <g class="style-scope yt-icon">
                                                        <path
                                                            d="M3,11h3v10H3V11z M18.77,11h-4.23l1.52-4.94C16.38,5.03,15.54,4,14.38,4c-0.58,0-1.14,0.24-1.52,0.65L7,11v10h10.43 c1.06,0,1.98-0.67,2.19-1.61l1.34-6C21.23,12.15,20.18,11,18.77,11z"
                                                            class="style-scope yt-icon"></path>
                                                    </g>
                                                </svg>
                                            </yt-icon>
                                        </button>
                                        <yt-interaction id="interaction" class="circular style-scope yt-icon-button">
                                            <div class="stroke style-scope yt-interaction"></div>
                                            <div class="fill style-scope yt-interaction"></div>
                                        </yt-interaction>
                                    </yt-icon-button>
                                    <tp-yt-paper-tooltip
                                        role="tooltip"
                                        tabindex="-1"
                                        class="style-scope ytd-toggle-button-renderer"
                                        style="inset: 107.6px auto auto 29.55px;">
                                        <div id="tooltip" class="style-scope tp-yt-paper-tooltip hidden">
                                            좋아요
                                        </div>
                                    </tp-yt-paper-tooltip>
                                </a>
                            </ytd-toggle-button-renderer>
                            <span
                                id="vote-count-middle"
                                aria-label="좋아요 64개"
                                class="style-scope ytd-comment-action-buttons-renderer">
                                {{commentInfo.likes}}
                            </span>
                            <div
                                id="share-button"
                                hidden="hidden"
                                class="style-scope ytd-comment-action-buttons-renderer"></div>
                            <div
                                id="reply-button-end"
                                class="style-scope ytd-comment-action-buttons-renderer">
                                <ytd-button-renderer
                                    use-keyboard-focused=""
                                    button-renderer="true"
                                    is-paper-button=""
                                    class="style-scope ytd-comment-action-buttons-renderer style-text size-default">
                                    <a tabindex="-1" class="yt-simple-endpoint style-scope ytd-button-renderer">
                                        <tp-yt-paper-button
                                            @click="toggleDialog"
                                            id="button"
                                            role="button"
                                            tabindex="0"
                                            animated=""
                                            elevation="0"
                                            aria-disabled="false"
                                            aria-label="답글"
                                            class="style-scope ytd-button-renderer style-text size-default">
                                            <yt-formatted-string
                                                id="text"
                                                class="style-scope ytd-button-renderer style-text size-default">답글</yt-formatted-string>
                                            <paper-ripple class="style-scope tp-yt-paper-button">
                                                <div id="background" class="style-scope paper-ripple" style="opacity: 0;"></div>
                                                <div id="waves" class="style-scope paper-ripple"></div>
                                            </paper-ripple>
                                        </tp-yt-paper-button>
                                    </a>
                                </ytd-button-renderer>
                            </div>
                        </div>
                        <ReplyDialog
                            v-if="replyDialgVisible"
                            :toggleDialog="toggleDialog"
                            :userInfo="userInfo"
                            :commentId="commentInfo.commentId"
                            :updateReplys="updateReplys"/>
                    </ytd-comment-action-buttons-renderer>
                    <div
                        id="moderation-buttons"
                        hidden="hidden"
                        class="style-scope ytd-comment-renderer"></div>
                    <ytd-button-renderer
                        id="view-threaded-replies"
                        aria-expanded="false"
                        noink=""
                        use-keyboard-focused=""
                        button-renderer="true"
                        class="style-scope ytd-comment-renderer"></ytd-button-renderer>
                    <ytd-button-renderer
                        id="hide-threaded-replies"
                        aria-expanded="true"
                        noink=""
                        use-keyboard-focused=""
                        button-renderer="true"
                        class="style-scope ytd-comment-renderer"></ytd-button-renderer>
                </div>
            </div>
        </ytd-comment-renderer>
        <div id="replies" class="style-scope ytd-comment-thread-renderer">
            <ytd-comment-replies-renderer class="style-scope ytd-comment-thread-renderer">
                <!--css-build:shady-->
                <div id="expander" class="style-scope ytd-comment-replies-renderer">

                    <div id="expander-contents" class="style-scope ytd-comment-replies-renderer">
                        <div id="contents" class="style-scope ytd-comment-replies-renderer">
                            <ReplyItem v-for="(item, index) in replysList" :key="index" :replyInfo="item"/>
                        </div>

                    </div>
                </div>
                <div
                    id="teaser-replies"
                    class="style-scope ytd-comment-replies-renderer"
                    hidden=""></div>
            </ytd-comment-replies-renderer>
        </div>
    </ytd-comment-thread-renderer>
</template>
<script>
    import ReplyDialog from "./ReplyDialog.vue"
    import ReplyItem from "./ReplyItem.vue"
    import axios from "axios"

    export default {
        components: {
            ReplyItem,
            ReplyDialog
        },
        created() {
            this.updateReplys();
        },
        data() {
            return {
                replyDialgVisible: false,
                replysList: [
                    /*{
                        userInfoDto: {
                            userName: "Lee ki chan",
                            profileUrl: "https://yt3.ggpht.com/ytc/AKedOLTyfjkMHkTuj5PicJsHqbdBu1g8YIVpkCIhLw=s88-c-k-c" +
                                "0x00ffffff-no-rj"
                        },
                        replyId: 1,
                        likes: 64,
                        isLiked: false,
                        content: "와ㅇㄴㄹdd 나중에 영상많이 모으시면, 진짜 '코딩 상식 사전' 하나 출판 하셔도 좋을 것 같아요!!\n 초보로서 책 찾아보면 이런 상식들 " +
                            "이해하기 쉽게 적힌것도 많이 없고, 보통 책들이 특정 범주만 깊게 다루고 있어서 아쉬운게 많았거든요 ㅠㅠ",
                        createdDate: "2 년 전"
                    }*/

                ]
            }
        },

        methods: {
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
                    ret = (gap / 3600 / 24 / 7).toFixed(0) + "주";
                } else if (gap < 3600 * 24 * 365) {
                    ret = (gap / 3600 / 24 / 30).toFixed(0) + "개월";
                } else {
                    ret = (gap / 3600 / 24 / 365).toFixed(0) + "년";
                }
                return ret;
            },
            toggleDialog() {
                this.replyDialgVisible = !this.replyDialgVisible;
            },
            updateReplys() {
                axios
                    .get("/comments/getreplys/" + this.commentInfo.commentId)
                    .then(response => {
                        console.log(response);
                        for (var i = 0; i < response.data.length; i++) {
                            response
                                .data[i]
                                .createdDate = this.strToDate(response.data[i].createdDate);
                        }
                        this.replysList = response.data;
                    });
            },
            clickLike() {
                var urlMethod;
                if (this.commentInfo.isLiked) {
                    urlMethod = "delete";
                } else {
                    urlMethod = "post";
                }
                axios
                    .put(`/like_comment/${urlMethod}/${this.commentInfo.commentId}`)
                    .then(response => {
                        if(response.data != -1)
                            this.commentInfo.likes = response.data
                    });
                this.commentInfo.isLiked = !this.commentInfo.isLiked;
            }
        },

        props: ['commentInfo', 'userInfo']
    }
</script>