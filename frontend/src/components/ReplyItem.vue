<template>
    <ytd-comment-renderer
        class="style-scope ytd-comment-replies-renderer"
        is-reply=""
        comment-style="unknown"
        style="--ytd-comment-paid-background-color: initial;">
        <!--css-build:shady-->
        <div id="paid-comment-images" class="style-scope ytd-comment-renderer">
            <dom-if class="style-scope ytd-comment-renderer">
                <template is="dom-if"></template>
            </dom-if>
            <dom-if class="style-scope ytd-comment-renderer">
                <template is="dom-if"></template>
            </dom-if>
        </div>
        <div
            id="linked-comment-badge"
            class="style-scope ytd-comment-renderer"
            hidden=""></div>
        <div id="body" class="style-scope ytd-comment-renderer">
            <div id="author-thumbnail" class="style-scope ytd-comment-renderer">
                <a
                    class="yt-simple-endpoint style-scope ytd-comment-renderer"
                    href="/channel/UCz5peaCYU7f0gn_upvAWuUw">
                    <yt-img-shadow
                        fit=""
                        height="40"
                        width="40"
                        class="style-scope ytd-comment-renderer no-transition"
                        loaded=""
                        style="background-color: transparent;">
                        <!--css-build:shady-->
                        <img
                            id="img"
                            class="style-scope yt-img-shadow"
                            alt="드라브펭"
                            height="40"
                            width="40"
                            :src="replyInfo.userInfoDto.profileUrl"/></yt-img-shadow>
                </a>
            </div>
            <div id="main" class="style-scope ytd-comment-renderer">
                <div id="header" class="style-scope ytd-comment-renderer">
                    <div
                        id="pinned-comment-badge"
                        class="style-scope ytd-comment-renderer"
                        hidden=""></div>
                    <div id="header-author" class="style-scope ytd-comment-renderer">
                        <h3 class="style-scope ytd-comment-renderer">
                            <a
                                id="author-text"
                                class="yt-simple-endpoint style-scope ytd-comment-renderer"
                                href="/channel/UCz5peaCYU7f0gn_upvAWuUw">
                                <span class="style-scope ytd-comment-renderer">
                                    {{replyInfo.userInfoDto.userName}}
                                </span>
                            </a>
                        </h3>
                        <span
                            id="author-comment-badge"
                            class="style-scope ytd-comment-renderer"
                            hidden=""></span>
                        <span
                            id="sponsor-comment-badge"
                            class="style-scope ytd-comment-renderer"
                            hidden=""></span>

                        <yt-formatted-string
                            class="published-time-text above-comment style-scope ytd-comment-renderer"
                            has-link-only_="">
                            <a
                                class="yt-simple-endpoint style-scope yt-formatted-string"
                                spellcheck="false"
                                href="/watch?v=sqH0u8wN4Rs&amp;lc=UgyDiJP56U_WQ2WYUNh4AaABAg.9Gzwb4FUlSV9QNG5VTQbJQ"
                                dir="auto">{{replyInfo.createdDate}} 전</a>
                        </yt-formatted-string>
                        <span id="author-reputation" class="style-scope ytd-comment-renderer"></span>
                        <span
                            id="sponsors-only-badge"
                            class="style-scope ytd-comment-renderer"
                            hidden=""></span>

                        <span
                            id="moderation-reason-divider"
                            class="style-scope ytd-comment-renderer"
                            hidden="">
                            •
                        </span>
                        <span
                            id="moderation-reason-text"
                            class="style-scope ytd-comment-renderer"
                            hidden=""></span>
                    </div>
                </div>

                <ytd-expander
                    id="expander"
                    max-number-of-lines="4"
                    class="style-scope ytd-comment-renderer"
                    collapsed=""
                    should-use-number-of-lines=""
                    style="--ytd-expander-max-lines:4;">
                    <!--css-build:shady-->
                    <div id="content" class="style-scope ytd-expander">

                        <yt-formatted-string
                            id="voted-option"
                            slot="content"
                            class="style-scope ytd-comment-renderer"
                            disable-upgrade=""
                            hidden=""></yt-formatted-string>
                        <yt-pdg-comment-chip-renderer
                            id="paid-comment-chip"
                            slot="content"
                            class="style-scope ytd-comment-renderer"
                            hidden="">
                            <!--css-build:shady-->
                            <div
                                id="comment-chip-container"
                                class="style-scope yt-pdg-comment-chip-renderer">
                                <yt-icon class="style-scope yt-pdg-comment-chip-renderer">
                                    <!--css-build:shady-->
                                </yt-icon>
                                <span id="comment-chip-price" class="style-scope yt-pdg-comment-chip-renderer"></span>
                            </div>
                        </yt-pdg-comment-chip-renderer>
                        <yt-formatted-string
                            id="content-text"
                            slot="content"
                            split-lines=""
                            class="style-scope ytd-comment-renderer">
                            <span dir="auto" class="style-scope yt-formatted-string">{{replyInfo.content}}
                            </span>
                        </yt-formatted-string>
                    </div>

                    <tp-yt-paper-button
                        id="less"
                        aria-expanded="true"
                        noink=""
                        class="style-scope ytd-expander"
                        hidden=""
                        role="button"
                        tabindex="0"
                        animated=""
                        elevation="0"
                        aria-disabled="false">
                        <!--css-build:shady-->
                        <span class="less-button style-scope ytd-comment-renderer" slot="less-button">간략히</span>
                    </tp-yt-paper-button>
                    <tp-yt-paper-button
                        id="more"
                        aria-expanded="false"
                        noink=""
                        class="style-scope ytd-expander"
                        hidden=""
                        role="button"
                        tabindex="0"
                        animated=""
                        elevation="0"
                        aria-disabled="false">
                        <!--css-build:shady-->
                        <span class="more-button style-scope ytd-comment-renderer" slot="more-button">자세히 보기</span>
                    </tp-yt-paper-button>

                </ytd-expander>

                <yt-formatted-string
                    class="published-time-text below-comment style-scope ytd-comment-renderer"
                    hidden=""
                    has-link-only_="">
                    <a
                        class="yt-simple-endpoint style-scope yt-formatted-string"
                        spellcheck="false"
                        href="/watch?v=sqH0u8wN4Rs&amp;lc=UgyDiJP56U_WQ2WYUNh4AaABAg.9Gzwb4FUlSV9QNG5VTQbJQ"
                        dir="auto">2개월 전</a>
                </yt-formatted-string>
                <ytd-comment-action-buttons-renderer
                    id="action-buttons"
                    class="style-scope ytd-comment-renderer"
                    system-icons=""
                    action-buttons-style="desktop-toolbar">
                    <!--css-build:shady-->
                    <div id="toolbar" class="style-scope ytd-comment-action-buttons-renderer">
                        <div id="reply-button" class="style-scope ytd-comment-action-buttons-renderer"></div>
                        <span
                            id="vote-count-left"
                            class="style-scope ytd-comment-action-buttons-renderer"
                            hidden="">
                            0
                        </span>
                        <ytd-toggle-button-renderer
                            @click="clickLike"
                            id="like-button"
                            icon-size="16"
                            class="style-scope ytd-comment-action-buttons-renderer style-text size-default"
                            use-keyboard-focused=""
                            system-icons=""
                            button-renderer="true"
                            is-icon-button=""
                            has-no-text="">
                            <a
                                class="yt-simple-endpoint style-scope ytd-toggle-button-renderer"
                                tabindex="-1">
                                <yt-icon-button
                                    id="button"
                                    class="style-scope ytd-toggle-button-renderer style-text size-default"
                                    touch-feedback="">
                                    <!--css-build:shady-->
                                    <button
                                        id="button"
                                        class="style-scope yt-icon-button"
                                        aria-label="나와 사용자 0명이 이 답글을 좋아함"
                                        aria-pressed="false">
                                        <yt-icon class="style-scope ytd-toggle-button-renderer">
                                            <svg
                                                    v-if="!replyInfo.isLiked"
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
                                                    v-if="replyInfo.isLiked"
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
                                            <!--css-build:shady-->
                                        </yt-icon>
                                    </button>
                                    <yt-interaction id="interaction" class="circular style-scope yt-icon-button">
                                        <!--css-build:shady-->
                                        <div class="stroke style-scope yt-interaction"></div>
                                        <div class="fill style-scope yt-interaction"></div>
                                    </yt-interaction>
                                </yt-icon-button>
                            </a>
                        </ytd-toggle-button-renderer>
                        <span
                            id="vote-count-middle"
                            class="style-scope ytd-comment-action-buttons-renderer"
                            >
                            {{replyInfo.likes}}
                        </span>
                        <div id="creator-heart" class="style-scope ytd-comment-action-buttons-renderer"></div>
                        <div
                            id="share-button"
                            class="style-scope ytd-comment-action-buttons-renderer"
                            hidden=""></div>
                    </div>
                    <div id="reply-dialog" class="style-scope ytd-comment-action-buttons-renderer"></div>
                </ytd-comment-action-buttons-renderer>
                <div id="moderation-buttons" class="style-scope ytd-comment-renderer" hidden=""></div>
                <ytd-button-renderer
                    id="view-threaded-replies"
                    aria-expanded="false"
                    noink=""
                    class="style-scope ytd-comment-renderer"
                    use-keyboard-focused=""
                    button-renderer="true"></ytd-button-renderer>
                <ytd-button-renderer
                    id="hide-threaded-replies"
                    aria-expanded="true"
                    noink=""
                    class="style-scope ytd-comment-renderer"
                    use-keyboard-focused=""
                    button-renderer="true"></ytd-button-renderer>
            </div>
            
        </div>
        <div id="edit-dialog" class="style-scope ytd-comment-renderer" hidden=""></div>

    </ytd-comment-renderer>
</template>

<script>
import axios from "axios";

export default{
    data(){
        return{
        }
    },
    props:['replyInfo'],
    methods:{
        clickLike() {
                var urlMethod;
                if (this.replyInfo.isLiked) {
                    urlMethod = "delete";
                } else {
                    urlMethod = "post";
                }
                axios
                    .put(`/like_reply/${urlMethod}/${this.replyInfo.replyId}`)
                    .then(response => {
                        if(response.data != -1)
                            this.replyInfo.likes = response.data
                    });
                this.replyInfo.isLiked = !this.replyInfo.isLiked;
            }
    }
}
</script>
