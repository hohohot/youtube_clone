<template>
    <ytd-comment-thread-renderer class="style-scope ytd-item-section-renderer">
        <!--css-build:shady-->
        <ytd-comment-renderer
            id="comment"
            class="style-scope ytd-comment-thread-renderer"
            comment-style="unknown"
            style="--ytd-comment-paid-background-color: initial; --ytd-decorated-comment-reply-box-height-offset:0px;">
            <!--css-build:shady-->

            <div id="body" class="style-scope ytd-comment-renderer">
                <div id="author-thumbnail" class="style-scope ytd-comment-renderer">
                    <a
                        class="yt-simple-endpoint style-scope ytd-comment-renderer"
                        href="/channel/UCCQEezMwBTnkZcJxIArQ_dQ">
                        <yt-img-shadow
                            fit=""
                            height="40"
                            width="40"
                            class="style-scope ytd-comment-renderer no-transition"
                            style="background-color: transparent;"
                            loaded="">
                            <!--css-build:shady-->
                            <img
                                id="img"
                                class="style-scope yt-img-shadow"
                                alt="Dong Hun Lee"
                                height="40"
                                width="40"
                                src="https://yt3.ggpht.com/ytc/AKedOLTyfjkMHkTuj5PicJsHqbdBu1g8YIVpkCIhLw=s88-c-k-c0x00ffffff-no-rj"/></yt-img-shadow>
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
                                    href="/channel/UCCQEezMwBTnkZcJxIArQ_dQ">
                                    <span class="style-scope ytd-comment-renderer">
                                        Dong Hun Lee
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
                                    href="/watch?v=iE29lbjbow0&amp;lc=UgzIfrCjp6ho_Y0V1f54AaABAg"
                                    dir="auto">2년 전</a>
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
                                class="style-scope ytd-comment-renderer">와
                                나중에 영상많이 모으시면, 진짜 '코딩 상식 사전' 하나 출판 하셔도 좋을 것 같아요!! 초보로서 책 찾아보면 이런 상식들 이해하기 쉽게
                                적힌것도 많이 없고, 보통 책들이 특정 범주만 깊게 다루고 있어서 아쉬운게 많았거든요 ㅠㅠ</yt-formatted-string>
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
                            href="/watch?v=iE29lbjbow0&amp;lc=UgzIfrCjp6ho_Y0V1f54AaABAg"
                            dir="auto">2년 전</a>
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
                                hidden=""
                                aria-label="좋아요 64개">
                                64
                            </span>
                            <ytd-toggle-button-renderer
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
                                            aria-label="나와 사용자 64명이 이 댓글을 좋아함"
                                            aria-pressed="false">
                                            <yt-icon class="style-scope ytd-toggle-button-renderer">
                                                <svg
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
                                                <!--css-build:shady-->
                                            </yt-icon>
                                        </button>
                                        <yt-interaction id="interaction" class="circular style-scope yt-icon-button">
                                            <!--css-build:shady-->
                                            <div class="stroke style-scope yt-interaction"></div>
                                            <div class="fill style-scope yt-interaction"></div>
                                        </yt-interaction>
                                    </yt-icon-button>
                                    <tp-yt-paper-tooltip
                                        class="style-scope ytd-toggle-button-renderer"
                                        role="tooltip"
                                        tabindex="-1"
                                        style="inset: 107.6px auto auto 29.55px;">
                                        <!--css-build:shady-->
                                        <div id="tooltip" class="style-scope tp-yt-paper-tooltip hidden">
                                            좋아요
                                        </div>
                                    </tp-yt-paper-tooltip>
                                </a>
                            </ytd-toggle-button-renderer>
                            <span
                                id="vote-count-middle"
                                class="style-scope ytd-comment-action-buttons-renderer"
                                aria-label="좋아요 64개">
                                64
                            </span>
                            <ytd-toggle-button-renderer
                                id="dislike-button"
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
                                            aria-label="댓글 싫어요 표시"
                                            aria-pressed="false">
                                            <yt-icon class="style-scope ytd-toggle-button-renderer">
                                                <svg
                                                    viewBox="0 0 16 16"
                                                    preserveAspectRatio="xMidYMid meet"
                                                    focusable="false"
                                                    class="style-scope yt-icon"
                                                    style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                    <g class="style-scope yt-icon">
                                                        <path
                                                            d="M3.54,2A1.55,1.55,0,0,0,2,3.13L1,7.37C.83,8.24,1,9,2,9H6L4.52,12.54A1.17,1.17,0,0,0,5.71,14a1.49,1.49,0,0,0,1.09-.46L11,9h4V2ZM6.07,12.86a.51.51,0,0,1-.36.14.28.28,0,0,1-.22-.09l0-.05L6.92,9.39,7.5,8H2a1.5,1.5,0,0,1,0-.41L3,3.35A.58.58,0,0,1,3.54,3H10V8.61ZM14,8H11l0-5h3Z"
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
                                    <tp-yt-paper-tooltip
                                        class="style-scope ytd-toggle-button-renderer"
                                        role="tooltip"
                                        tabindex="-1"
                                        style="inset: 127.6px auto auto 83.6375px;">
                                        <!--css-build:shady-->
                                        <div id="tooltip" class="style-scope tp-yt-paper-tooltip hidden">
                                            싫어요
                                        </div>
                                    </tp-yt-paper-tooltip>
                                </a>
                            </ytd-toggle-button-renderer>
                            <div id="creator-heart" class="style-scope ytd-comment-action-buttons-renderer">
                                <ytd-creator-heart-renderer
                                    class="style-scope ytd-comment-action-buttons-renderer">
                                    <!--css-build:shady-->
                                    <yt-icon-button
                                        id="creator-heart-button"
                                        class="style-scope ytd-creator-heart-renderer"
                                        touch-feedback=""
                                        disabled="">
                                        <!--css-build:shady-->
                                        <button
                                            id="button"
                                            class="style-scope yt-icon-button"
                                            disabled=""
                                            aria-label="얄팍한 코딩사전님의 ❤">

                                            <yt-img-shadow
                                                id="hearted-thumbnail"
                                                class="style-scope ytd-creator-heart-renderer no-transition"
                                                loaded=""
                                                style="background-color: transparent;">
                                                <!--css-build:shady-->
                                                <img
                                                    id="img"
                                                    class="style-scope yt-img-shadow"
                                                    alt="얄팍한 코딩사전"
                                                    src="https://yt3.ggpht.com/ytc/AKedOLSpZwHyIH3sbomJI7f3FqRb5p8opUzN6OuoeZ9Tvo8=s176-c-k-c0x00ffffff-no-rj"/></yt-img-shadow>
                                            <yt-icon id="hearted-border" class="style-scope ytd-creator-heart-renderer">
                                                <svg
                                                    viewBox="0 0 24 24"
                                                    preserveAspectRatio="xMidYMid meet"
                                                    focusable="false"
                                                    class="style-scope yt-icon"
                                                    style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                    <g class="style-scope yt-icon">
                                                        <path
                                                            d="M16.5,3C19.02,3,21,5.19,21,7.99c0,3.7-3.28,6.94-8.25,11.86L12,20.59l-0.74-0.73l-0.04-0.04C6.27,14.92,3,11.69,3,7.99 C3,5.19,4.98,3,7.5,3c1.4,0,2.79,0.71,3.71,1.89L12,5.9l0.79-1.01C13.71,3.71,15.1,3,16.5,3 M16.5,2c-1.74,0-3.41,0.88-4.5,2.28 C10.91,2.88,9.24,2,7.5,2C4.42,2,2,4.64,2,7.99c0,4.12,3.4,7.48,8.55,12.58L12,22l1.45-1.44C18.6,15.47,22,12.11,22,7.99 C22,4.64,19.58,2,16.5,2L16.5,2z"
                                                            class="style-scope yt-icon"></path>
                                                        <path fill="none" d="M0,0h24v24H0V0z" class="style-scope yt-icon"></path>
                                                    </g>
                                                </svg>
                                                <!--css-build:shady-->
                                            </yt-icon>
                                            <yt-icon id="hearted" class="style-scope ytd-creator-heart-renderer">
                                                <svg
                                                    viewBox="0 0 24 24"
                                                    preserveAspectRatio="xMidYMid meet"
                                                    focusable="false"
                                                    class="style-scope yt-icon"
                                                    style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                    <g class="style-scope yt-icon">
                                                        <path
                                                            d="M16.5,2c-1.74,0-3.41,0.88-4.5,2.28C10.91,2.88,9.24,2,7.5,2C4.42,2,2,4.64,2,7.99c0,4.12,3.4,7.48,8.55,12.58L12,22 l1.45-1.44C18.6,15.47,22,12.11,22,7.99C22,4.64,19.58,2,16.5,2z"
                                                            class="style-scope yt-icon"></path>
                                                    </g>
                                                </svg>
                                                <!--css-build:shady-->
                                            </yt-icon>
                                            <dom-if class="style-scope ytd-creator-heart-renderer">
                                                <template is="dom-if"></template>
                                            </dom-if>
                                            <dom-if class="style-scope ytd-creator-heart-renderer">
                                                <template is="dom-if"></template>
                                            </dom-if>
                                        </button>
                                        <yt-interaction id="interaction" class="circular style-scope yt-icon-button">
                                            <!--css-build:shady-->
                                            <div class="stroke style-scope yt-interaction"></div>
                                            <div class="fill style-scope yt-interaction"></div>
                                        </yt-interaction>
                                    </yt-icon-button>
                                    <tp-yt-paper-tooltip
                                        class="style-scope ytd-creator-heart-renderer"
                                        role="tooltip"
                                        tabindex="-1"
                                        style="left: 71.4813px; top: 135.6px;">
                                        <!--css-build:shady-->
                                        <div id="tooltip" class="style-scope tp-yt-paper-tooltip hidden">
                                            얄팍한 코딩사전님의 ❤
                                        </div>
                                    </tp-yt-paper-tooltip>
                                </ytd-creator-heart-renderer>
                            </div>
                            <div
                                id="share-button"
                                class="style-scope ytd-comment-action-buttons-renderer"
                                hidden=""></div>
                            <div
                                id="reply-button-end"
                                class="style-scope ytd-comment-action-buttons-renderer">
                                <ytd-button-renderer
                                    class="style-scope ytd-comment-action-buttons-renderer style-text size-default"
                                    use-keyboard-focused=""
                                    button-renderer="true"
                                    is-paper-button="">
                                    <a class="yt-simple-endpoint style-scope ytd-button-renderer" tabindex="-1">
                                        <tp-yt-paper-button
                                            id="button"
                                            class="style-scope ytd-button-renderer style-text size-default"
                                            role="button"
                                            tabindex="0"
                                            animated=""
                                            elevation="0"
                                            aria-disabled="false"
                                            aria-label="답글">
                                            <!--css-build:shady-->
                                            <yt-formatted-string
                                                id="text"
                                                class="style-scope ytd-button-renderer style-text size-default">답글</yt-formatted-string>
                                            <paper-ripple class="style-scope tp-yt-paper-button">
                                                <!--css-build:shady-->

                                                <div id="background" class="style-scope paper-ripple" style="opacity: 0;"></div>
                                                <div id="waves" class="style-scope paper-ripple"></div>
                                            </paper-ripple>
                                        </tp-yt-paper-button>
                                    </a>
                                </ytd-button-renderer>
                            </div>
                        </div>
                        <div
                            id="reply-dialog"
                            class="style-scope ytd-comment-action-buttons-renderer"
                            hidden="">
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
                                    hidden="">
                                    <!--css-build:shady-->
                                    <div id="identity-chip" class="style-scope ytd-commentbox"></div>
                                    <div id="thumbnail-input-row" class="style-scope ytd-commentbox">
                                        <yt-img-shadow
                                            id="author-thumbnail"
                                            class="style-scope ytd-commentbox no-transition"
                                            style="background-color: transparent;"
                                            loaded="">
                                            <!--css-build:shady-->
                                            <img
                                                id="img"
                                                class="style-scope yt-img-shadow"
                                                alt="이섭섭"
                                                width="24"
                                                height="24"
                                                src="https://yt3.ggpht.com/yti/APfAmoErw2Et1bOnYQOKuvHX3J_2JgVviPNx9n_zJA=s48-c-k-c0x00ffffff-no-rj"/></yt-img-shadow>
                                        <div id="main" class="style-scope ytd-commentbox">
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
                                                                                aria-label="공개 답글 추가..."></div>
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
                                                <span id="emoji-button" class="style-scope ytd-commentbox">
                                                    <ytd-button-renderer
                                                        class="style-scope ytd-commentbox size-small"
                                                        use-keyboard-focused=""
                                                        button-renderer="true"
                                                        is-icon-button=""
                                                        has-no-text="">
                                                        <a class="yt-simple-endpoint style-scope ytd-button-renderer" tabindex="-1">
                                                            <yt-icon-button
                                                                id="button"
                                                                class="style-scope ytd-button-renderer size-small"
                                                                touch-feedback="">
                                                                <!--css-build:shady-->
                                                                <button
                                                                    id="button"
                                                                    class="style-scope yt-icon-button"
                                                                    aria-label="그림 이모티콘 선택도구 표시">
                                                                    <yt-icon class="style-scope ytd-button-renderer">
                                                                        <svg
                                                                            viewBox="0 0 24 24"
                                                                            preserveAspectRatio="xMidYMid meet"
                                                                            focusable="false"
                                                                            class="style-scope yt-icon"
                                                                            style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                                            <g class="style-scope yt-icon">
                                                                                <path
                                                                                    d="M12,2C6.48,2,2,6.48,2,12c0,5.52,4.48,10,10,10s10-4.48,10-10C22,6.48,17.52,2,12,2z M12,21c-4.96,0-9-4.04-9-9 c0-4.96,4.04-9,9-9s9,4.04,9,9C21,16.96,16.96,21,12,21z M17,13c0,1-1,4-5,4s-5-3-5-4C8,13,16,13,17,13z M6.05,10 C6.28,8.86,7.29,8,8.5,8s2.22,0.86,2.45,2H9.91C9.7,9.42,9.15,9,8.5,9s-1.2,0.42-1.41,1H6.05z M13.05,10c0.23-1.14,1.24-2,2.45-2 s2.22,0.86,2.45,2h-1.04c-0.21-0.58-0.76-1-1.41-1s-1.2,0.42-1.41,1H13.05z"
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
                                                    </ytd-button-renderer>
                                                </span>
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
                                                                <paper-ripple class="style-scope tp-yt-paper-button">
                                                                    <!--css-build:shady-->

                                                                    <div id="background" class="style-scope paper-ripple" style="opacity: 0.0064;"></div>
                                                                    <div id="waves" class="style-scope paper-ripple"></div>
                                                                </paper-ripple>
                                                            </tp-yt-paper-button>
                                                        </a>
                                                    </ytd-button-renderer>
                                                    <ytd-button-renderer
                                                        id="submit-button"
                                                        class="style-scope ytd-commentbox style-primary size-default"
                                                        use-keyboard-focused=""
                                                        button-renderer="true"
                                                        is-paper-button=""
                                                        disabled="">
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
                                <div id="unopened-dialog" class="style-scope ytd-comment-reply-dialog-renderer">
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
                <div id="action-menu" class="style-scope ytd-comment-renderer">
                    <ytd-menu-renderer class="style-scope ytd-comment-renderer">
                        <!--css-build:shady-->
                        <div
                            id="top-level-buttons-computed"
                            class="top-level-buttons style-scope ytd-menu-renderer"></div>
                        <yt-icon-button
                            id="button"
                            class="dropdown-trigger style-scope ytd-menu-renderer"
                            touch-feedback="">
                            <!--css-build:shady-->
                            <button id="button" class="style-scope yt-icon-button" aria-label="작업 메뉴">
                                <yt-icon class="style-scope ytd-menu-renderer">
                                    <svg
                                        viewBox="0 0 24 24"
                                        preserveAspectRatio="xMidYMid meet"
                                        focusable="false"
                                        class="style-scope yt-icon"
                                        style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                        <g class="style-scope yt-icon">
                                            <path
                                                d="M12,16.5c0.83,0,1.5,0.67,1.5,1.5s-0.67,1.5-1.5,1.5s-1.5-0.67-1.5-1.5S11.17,16.5,12,16.5z M10.5,12 c0,0.83,0.67,1.5,1.5,1.5s1.5-0.67,1.5-1.5s-0.67-1.5-1.5-1.5S10.5,11.17,10.5,12z M10.5,6c0,0.83,0.67,1.5,1.5,1.5 s1.5-0.67,1.5-1.5S12.83,4.5,12,4.5S10.5,5.17,10.5,6z"
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
                    </ytd-menu-renderer>
                </div>
            </div>
        </ytd-comment-renderer>

    </ytd-comment-thread-renderer>
</template>


