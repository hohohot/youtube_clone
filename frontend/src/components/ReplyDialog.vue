<template>
    <div id="reply-dialog" class="style-scope ytd-comment-action-buttons-renderer">
        <ytd-comment-reply-dialog-renderer
            id="replybox"
            class="style-scope ytd-comment-action-buttons-renderer">
            <!--css-build:shady-->
            <ytd-commentbox
                id="commentbox"
                is-reply=""
                class="style-scope ytd-comment-reply-dialog-renderer"
                added-attachment="none"
                prefilled-attachment_="none"
                style="width:100%"
                >
                <!--css-build:shady-->
                <div id="identity-chip" class="style-scope ytd-commentbox"></div>
                <div id="thumbnail-input-row" class="style-scope ytd-commentbox" style="display: flex; justify-content: space-between;">
                    <yt-img-shadow
                        id="author-thumbnail"
                        class="style-scope ytd-commentbox no-transition"
                        style="background-color: transparent; float:left"
                        loaded="">
                        <!--css-build:shady-->
                        <img
                            id="img"
                            class="style-scope yt-img-shadow"
                            alt="이섭섭"
                            width="24"
                            height="24"
                            :src="userInfo.profileUrl"/></yt-img-shadow>
                    <div id="main" class="style-scope ytd-commentbox" style="width:1100px; float:left; display:inline-block;">
                        <div id="divider-line" class="style-scope ytd-commentbox"></div>
                        <div id="creation-box" class="not-focused style-scope ytd-commentbox">
                            <tp-yt-paper-input-container
                                id="input-container"
                                no-label-float=""
                                use-v2-underline=""
                                class="style-scope ytd-commentbox">
                                <!--css-build:shady-->
                                <div
                                    class="floated-label-placeholder style-scope tp-yt-paper-input-container"
                                    aria-hidden="true"
                                    hidden="">
                                    &nbsp;
                                </div>

                                <div class="input-wrapper style-scope tp-yt-paper-input-container">
                                    <span class="prefix style-scope tp-yt-paper-input-container"></span>

                                    <div
                                        id="labelAndInputContainer"
                                        class="input-content style-scope tp-yt-paper-input-container">

                                        <div slot="after-input" class="paper-input-input style-scope ytd-commentbox">
                                            <ytd-emoji-input id="emoji" class="style-scope ytd-commentbox">
                                                <!--css-build:shady-->
                                                <yt-user-mention-autosuggest-input
                                                    slot="input"
                                                    class="style-scope ytd-commentbox">
                                                    <!--css-build:shady-->
                                                    <yt-formatted-string
                                                        id="contenteditable-textarea"
                                                        slot="input"
                                                        enable-content-editable="true"
                                                        maxlength="10000"
                                                        plaintext-only="true"
                                                        required="true"
                                                        split-lines=""
                                                        class="style-scope ytd-commentbox">
                                                        <!--css-build:shady-->
                                                        <div
                                                            id="contenteditable-root"
                                                            contenteditable="true"
                                                            dir="auto"
                                                            class="style-scope yt-formatted-string"
                                                            aria-label="공개 답글 추가..."
                                                            ref='commentContents'></div>
                                                    </yt-formatted-string>
                                                    <tp-yt-iron-dropdown
                                                        id="iron-dropdown"
                                                        horizontal-align="auto"
                                                        no-auto-focus=""
                                                        no-overlap="true"
                                                        class="style-scope yt-user-mention-autosuggest-input"
                                                        vertical-align="top"
                                                        aria-disabled="false"
                                                        aria-hidden="true"
                                                        style="outline: none; display: none;">
                                                        <!--css-build:shady-->
                                                        <div id="contentWrapper" class="style-scope tp-yt-iron-dropdown">
                                                            <yt-user-mention-suggestions-dropdown
                                                                id="dropdown"
                                                                class="dropdown-content style-scope yt-user-mention-autosuggest-input"
                                                                slot="dropdown-content"
                                                                role="listbox">
                                                                <!--css-build:shady-->
                                                                <dom-repeat
                                                                    index-as="index"
                                                                    notify-dom-change=""
                                                                    class="style-scope yt-user-mention-suggestions-dropdown">
                                                                    <template is="dom-repeat"></template>
                                                                </dom-repeat>
                                                            </yt-user-mention-suggestions-dropdown>
                                                        </div>
                                                    </tp-yt-iron-dropdown>
                                                </yt-user-mention-autosuggest-input>
                                                <tp-yt-iron-dropdown
                                                    id="dropdown"
                                                    allow-outside-scroll=""
                                                    no-auto-focus=""
                                                    vertical-align="bottom"
                                                    class="style-scope ytd-emoji-input"
                                                    horizontal-align="left"
                                                    aria-disabled="false"
                                                    aria-hidden="true"
                                                    style="outline: none; display: none;">
                                                    <!--css-build:shady-->
                                                    <div id="contentWrapper" class="style-scope tp-yt-iron-dropdown">
                                                        <div
                                                            id="dropdown-content"
                                                            class="dropdown-content style-scope ytd-emoji-input"
                                                            slot="dropdown-content"></div>
                                                    </div>
                                                </tp-yt-iron-dropdown>
                                            </ytd-emoji-input>
                                        </div>
                                        <ytd-backstage-dismissable-attachment
                                            id="dismissable-attachment"
                                            slot="after-input"
                                            class="style-scope ytd-commentbox"
                                            hidden="">
                                            <!--css-build:shady-->
                                            <div
                                                id="attachment-preview-container"
                                                class="style-scope ytd-backstage-dismissable-attachment">
                                                <div
                                                    id="attachment-preview"
                                                    class="style-scope ytd-backstage-dismissable-attachment"></div>
                                                <div
                                                    id="dismiss-button"
                                                    class="style-scope ytd-backstage-dismissable-attachment"></div>
                                            </div>
                                        </ytd-backstage-dismissable-attachment>
                                        <div
                                            id="attachment-preview"
                                            slot="after-input"
                                            class="style-scope ytd-commentbox"></div>
                                        <div
                                            id="image-select"
                                            class="paper-input-input style-scope ytd-commentbox"
                                            slot="after-input"
                                            hidden=""></div>
                                        <ytd-backstage-video-link-attachment
                                            id="video-link-attachment"
                                            slot="after-input"
                                            class="style-scope ytd-commentbox"
                                            hidden="">
                                            <!--css-build:shady-->
                                            <div id="video-preview" class="style-scope ytd-backstage-video-link-attachment"></div>
                                            <div id="cancel-button" class="style-scope ytd-backstage-video-link-attachment"></div>
                                        </ytd-backstage-video-link-attachment>
                                    </div>

                                    <span class="suffix style-scope tp-yt-paper-input-container"></span>
                                </div>

                                <div
                                    class="underline style-scope tp-yt-paper-input-container"
                                    style="height: 0px;">
                                    <div class="unfocused-line style-scope tp-yt-paper-input-container"></div>
                                    <div class="focused-line style-scope tp-yt-paper-input-container"></div>
                                </div>

                                <div class="add-on-content style-scope tp-yt-paper-input-container"></div>
                            </tp-yt-paper-input-container>
                        </div>
                        <ytd-poll-attachment
                            id="poll-attachment"
                            class="style-scope ytd-commentbox"
                            hidden="">
                            <!--css-build:shady-->
                            <div id="poll-options" class="style-scope ytd-poll-attachment">
                                <dom-repeat id="repeat" class="style-scope ytd-poll-attachment">
                                    <template is="dom-repeat"></template>
                                </dom-repeat>
                            </div>
                            <div id="add-option" class="style-scope ytd-poll-attachment"></div>
                        </ytd-poll-attachment>

                        <div id="poll-preview-edit-dialog" class="style-scope ytd-commentbox" hidden="">
                            <yt-formatted-string class="style-scope ytd-commentbox">
                                <!--css-build:shady-->
                            </yt-formatted-string>
                            <div id="poll-preview" class="style-scope ytd-commentbox"></div>
                        </div>
                        <div id="footer" class="style-scope ytd-commentbox">
                            
                            <div id="attachments" class="style-scope ytd-commentbox" hidden="">

                                <ytd-button-renderer
                                    class="style-scope ytd-commentbox"
                                    id="video-link-button"
                                    use-keyboard-focused=""
                                    button-renderer="true"></ytd-button-renderer>

                                <ytd-button-renderer
                                    class="style-scope ytd-commentbox"
                                    id="poll-button"
                                    use-keyboard-focused=""
                                    button-renderer="true"></ytd-button-renderer>

                                <ytd-button-renderer
                                    class="style-scope ytd-commentbox"
                                    id="image-button"
                                    use-keyboard-focused=""
                                    button-renderer="true"></ytd-button-renderer>
                                <dom-repeat as="buttonId" class="style-scope ytd-commentbox">
                                    <template is="dom-repeat"></template>
                                </dom-repeat>
                            </div>
                            <div id="inline-scheduling-panel" class="style-scope ytd-commentbox"></div>
                            <div id="footer-text" class="style-scope ytd-commentbox">
                                <yt-formatted-string
                                    id="footer-message"
                                    class="footer-alert-message style-scope ytd-commentbox"
                                    hidden=""></yt-formatted-string>
                                <yt-formatted-string
                                    id="zero-step-footer-text"
                                    class="style-scope ytd-commentbox">
                                    <!--css-build:shady-->
                                </yt-formatted-string>
                            </div>
                            <div id="access-restrictions-selector" class="style-scope ytd-commentbox"></div>
                            <span id="char-count" class="style-scope ytd-commentbox" hidden="">0/</span>
                            <div id="buttons" class="style-scope ytd-commentbox">
                                <ytd-button-renderer
                                    @click="toggleDialog"
                                    id="cancel-button"
                                    class="style-scope ytd-commentbox"
                                    use-keyboard-focused=""
                                    button-renderer="true"
                                    is-paper-button="">
                                    <a class="yt-simple-endpoint style-scope ytd-button-renderer" tabindex="-1">
                                        <tp-yt-paper-button
                                            id="button"
                                            class="style-scope ytd-button-renderer"
                                            role="button"
                                            tabindex="0"
                                            animated=""
                                            elevation="0"
                                            aria-disabled="false"
                                            aria-label="취소">
                                            <!--css-build:shady-->
                                            <yt-formatted-string id="text" class="style-scope ytd-button-renderer">취소</yt-formatted-string>
                                        </tp-yt-paper-button>
                                    </a>
                                </ytd-button-renderer>
                                <ytd-button-renderer
                                    id="submit-button"
                                    class="style-scope ytd-commentbox style-primary size-default"
                                    use-keyboard-focused=""
                                    button-renderer="true"
                                    is-paper-button=""
                                    @click="postReply"
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
                                            aria-label="답글"
                                            disabled=""
                                            style="pointer-events: none;">
                                            <!--css-build:shady-->
                                            <yt-formatted-string
                                                id="text"
                                                class="style-scope ytd-button-renderer style-primary size-default">답글</yt-formatted-string>
                                        </tp-yt-paper-button>
                                    </a>
                                </ytd-button-renderer>
                                <div id="option-menu" class="style-scope ytd-commentbox"></div>
                            </div>
                        </div>
                        <div id="scheduling-panel" class="style-scope ytd-commentbox"></div>
                        <div id="emojis" class="style-scope ytd-commentbox" hidden="">
                            <span id="emoji-picker" class="style-scope ytd-commentbox">
                                <yt-emoji-picker-renderer class="style-scope ytd-commentbox" id="emoji">
                                    <!--css-build:shady-->
                                    <div id="search-panel" class="style-scope yt-emoji-picker-renderer">
                                        <tp-yt-paper-input
                                            id="search"
                                            no-label-float=""
                                            use-v2-underline=""
                                            class="style-scope yt-emoji-picker-renderer"
                                            tabindex="0"
                                            aria-disabled="false">
                                            <!--css-build:shady-->
                                            <tp-yt-paper-input-container
                                                id="container"
                                                class="style-scope tp-yt-paper-input">
                                                <!--css-build:shady-->
                                                <div
                                                    class="floated-label-placeholder style-scope tp-yt-paper-input-container"
                                                    aria-hidden="true"
                                                    hidden="">
                                                    &nbsp;
                                                </div>

                                                <div class="input-wrapper style-scope tp-yt-paper-input-container">
                                                    <span class="prefix style-scope tp-yt-paper-input-container"></span>

                                                    <div
                                                        id="labelAndInputContainer"
                                                        class="input-content style-scope tp-yt-paper-input-container">
                                                        <label
                                                            aria-hidden="true"
                                                            slot="label"
                                                            class="style-scope tp-yt-paper-input"
                                                            for="input-1"
                                                            id="paper-input-label-1"></label>
                                                        <iron-input
                                                            slot="input"
                                                            class="input-element style-scope tp-yt-paper-input"
                                                            id="input-1">
                                                            <!--css-build:shady-->

                                                            <input
                                                                class="style-scope tp-yt-paper-input"
                                                                autocomplete="off"
                                                                placeholder=""
                                                                autocapitalize="none"
                                                                autocorrect="off"
                                                                aria-describedby=""
                                                                aria-labelledby="paper-input-label-1"/></iron-input>
                                                    </div>

                                                    <span class="suffix style-scope tp-yt-paper-input-container"></span>
                                                </div>

                                                <div class="underline style-scope tp-yt-paper-input-container">
                                                    <div class="unfocused-line style-scope tp-yt-paper-input-container"></div>
                                                    <div class="focused-line style-scope tp-yt-paper-input-container"></div>
                                                </div>

                                                <div class="add-on-content style-scope tp-yt-paper-input-container"></div>
                                            </tp-yt-paper-input-container>
                                        </tp-yt-paper-input>
                                        <yt-icon-button
                                            id="clear-search"
                                            class="style-scope yt-emoji-picker-renderer"
                                            hidden=""
                                            touch-feedback="">
                                            <!--css-build:shady-->
                                            <button id="button" class="style-scope yt-icon-button" aria-label="검색어 지우기">
                                                <yt-icon icon="close" class="style-scope yt-emoji-picker-renderer">
                                                    <svg
                                                        viewBox="0 0 24 24"
                                                        preserveAspectRatio="xMidYMid meet"
                                                        focusable="false"
                                                        class="style-scope yt-icon"
                                                        style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                        <g class="style-scope yt-icon">
                                                            <path
                                                                d="M12.7,12l6.6,6.6l-0.7,0.7L12,12.7l-6.6,6.6l-0.7-0.7l6.6-6.6L4.6,5.4l0.7-0.7l6.6,6.6l6.6-6.6l0.7,0.7L12.7,12z"
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
                                        <button
                                            id="skin-tone"
                                            selected=""
                                            class="style-scope yt-emoji-picker-renderer"
                                            tone="0"
                                            aria-label="그림 이모티콘 피부색 선택"></button>
                                        <tp-yt-iron-dropdown
                                            id="dropdown"
                                            allow-outside-scroll=""
                                            horizontal-align="right"
                                            horizontal-offset="8"
                                            no-auto-focus=""
                                            vertical-align="top"
                                            vertical-offset="8"
                                            class="style-scope yt-emoji-picker-renderer"
                                            aria-disabled="false"
                                            aria-hidden="true"
                                            style="outline: none; display: none;">
                                            <!--css-build:shady-->
                                            <div id="contentWrapper" class="style-scope tp-yt-iron-dropdown">
                                                <div
                                                    id="dropdown-content"
                                                    class="dropdown-content style-scope yt-emoji-picker-renderer"
                                                    slot="dropdown-content">
                                                    <button
                                                        tone="0"
                                                        class="style-scope yt-emoji-picker-renderer"
                                                        selected=""
                                                        aria-label="일반 피부색"></button>
                                                    <button
                                                        tone="1"
                                                        class="style-scope yt-emoji-picker-renderer"
                                                        aria-label="밝은 피부색"></button>
                                                    <button
                                                        tone="2"
                                                        class="style-scope yt-emoji-picker-renderer"
                                                        aria-label="약간 밝은 피부색"></button>
                                                    <button
                                                        tone="3"
                                                        class="style-scope yt-emoji-picker-renderer"
                                                        aria-label="중간 피부색"></button>
                                                    <button
                                                        tone="4"
                                                        class="style-scope yt-emoji-picker-renderer"
                                                        aria-label="약간 어두운 피부색"></button>
                                                    <button
                                                        tone="5"
                                                        class="style-scope yt-emoji-picker-renderer"
                                                        aria-label="어두운 피부색"></button>
                                                </div>
                                            </div>
                                        </tp-yt-iron-dropdown>
                                    </div>
                                    <div id="category-buttons" class="style-scope yt-emoji-picker-renderer"></div>
                                    <yt-emoji-picker-category-renderer
                                        id="search-category"
                                        class="style-scope yt-emoji-picker-renderer"
                                        aria-live="polite"
                                        role="listbox"
                                        tabindex="0"
                                        aria-activedescendant="">
                                        <!--css-build:shady-->
                                        <yt-formatted-string
                                            id="title"
                                            class="style-scope yt-emoji-picker-category-renderer">
                                            <!--css-build:shady-->
                                        </yt-formatted-string>
                                        <div id="emoji" class="style-scope yt-emoji-picker-category-renderer">
                                            <dom-repeat id="repeat" class="style-scope yt-emoji-picker-category-renderer">
                                                <template is="dom-repeat"></template>
                                            </dom-repeat>
                                        </div>
                                    </yt-emoji-picker-category-renderer>
                                    <yt-formatted-string
                                        id="search-empty"
                                        class="style-scope yt-emoji-picker-renderer">
                                        <!--css-build:shady-->
                                    </yt-formatted-string>
                                    <div id="categories-wrapper" class="style-scope yt-emoji-picker-renderer">
                                        <div id="categories" class="style-scope yt-emoji-picker-renderer"></div>
                                    </div>
                                </yt-emoji-picker-renderer>
                            </span>
                        </div>
                    </div>
                    <tp-yt-paper-spinner-lite class="style-scope ytd-commentbox" aria-hidden="true">
                        <!--css-build:shady-->
                        <div id="spinnerContainer" class="  style-scope tp-yt-paper-spinner-lite">
                            <div class="spinner-layer style-scope tp-yt-paper-spinner-lite">
                                <div class="circle-clipper left style-scope tp-yt-paper-spinner-lite">
                                    <div class="circle style-scope tp-yt-paper-spinner-lite"></div>
                                </div>
                                <div class="circle-clipper right style-scope tp-yt-paper-spinner-lite">
                                    <div class="circle style-scope tp-yt-paper-spinner-lite"></div>
                                </div>
                            </div>
                        </div>
                    </tp-yt-paper-spinner-lite>
                </div>
            </ytd-commentbox>
            <div
                id="unopened-dialog"
                class="style-scope ytd-comment-reply-dialog-renderer"
                hidden="">
                <yt-img-shadow
                    id="author-thumbnail"
                    height="40"
                    width="40"
                    class="style-scope ytd-comment-reply-dialog-renderer no-transition empty"
                    style="background-color: transparent;">
                    <!--css-build:shady-->
                    <img id="img" class="style-scope yt-img-shadow" alt="" height="40" width="40"/></yt-img-shadow>
                <div
                    id="placeholder-area"
                    class="style-scope ytd-comment-reply-dialog-renderer">
                    <yt-formatted-string
                        id="placeholder-text"
                        role="textbox"
                        tabindex="0"
                        class="style-scope ytd-comment-reply-dialog-renderer">공개 답글 추가...</yt-formatted-string>
                </div>
            </div>
        </ytd-comment-reply-dialog-renderer>
    </div>
</template>

<script>
import axios from "axios";
import 'url-search-params-polyfill'
export default{
    props:['toggleDialog', 'userInfo', 'commentId', 'updateReplys'],
    methods:{
        postReply(){
            var textToSend = this.$refs.commentContents.innerText;
            
            console.log(this.$refs.commentContents.innerText);
            var params = new URLSearchParams();
            params.append('replyContent', textToSend);
            params.append('videoId', parseInt(this.$route.query.id));
            params.append('commentId', parseInt(this.commentId));
            axios.post("/comments/postreplys", params).
            then(()=>{
                this.updateReplys();
            }
            );
            this.$refs.commentContents.innerText = "";
            this.toggleDialog();
        }
    }
}
</script>
