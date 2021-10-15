<style lang="css" css-build-single="">
    @import "../../overall.css";
</style>

<template>
    <div id="info" class="style-scope ytd-watch-flexy">
        <div id="info-skeleton" class="watch-skeleton style-scope ytd-watch-flexy">
            <div id="primary-info" class="skeleton-light-border-bottom">
                <div id="title" class="text-shell skeleton-bg-color"></div>
                <div id="info">
                    <div id="count" class="text-shell skeleton-bg-color"></div>
                    <div class="flex-1"></div>
                    <div id="menu">
                        <div class="menu-button skeleton-bg-color"></div>
                        <div class="menu-button skeleton-bg-color"></div>
                        <div class="menu-button skeleton-bg-color"></div>
                        <div class="menu-button skeleton-bg-color"></div>
                        <div class="menu-button skeleton-bg-color"></div>
                    </div>
                </div>
            </div>
        </div>
        <div id="info-contents" class="style-scope ytd-watch-flexy">
            <ytd-video-primary-info-renderer
                class="style-scope ytd-watch-flexy"
                has-date-text="">
                <!--css-build:shady-->
                <div id="container" class="style-scope ytd-video-primary-info-renderer">
                    <ytd-badge-supported-renderer
                        class="style-scope ytd-video-primary-info-renderer"
                        disable-upgrade=""
                        hidden=""></ytd-badge-supported-renderer>
                    <a
                        class="yt-simple-endpoint style-scope ytd-video-primary-info-renderer"
                        hidden="">
                        <yt-icon
                            class="super-title-icon style-scope ytd-video-primary-info-renderer"
                            icon="yt-icons:location_pin">
                            <svg
                                viewBox="0 0 24 24"
                                preserveAspectRatio="xMidYMid meet"
                                focusable="false"
                                class="style-scope yt-icon"
                                style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                <g class="style-scope yt-icon">
                                    <path
                                        d="M12,3c3.31,0,6,2.69,6,6c0,3.83-4.25,9.36-6,11.47C9.82,17.86,6,12.54,6,9C6,5.69,8.69,3,12,3 M12,2C8.13,2,5,5.13,5,9 c0,5.25,7,13,7,13s7-7.75,7-13C19,5.13,15.87,2,12,2L12,2z M12,7c1.1,0,2,0.9,2,2s-0.9,2-2,2s-2-0.9-2-2S10.9,7,12,7 M12,6 c-1.66,0-3,1.34-3,3s1.34,3,3,3s3-1.34,3-3S13.66,6,12,6L12,6z"
                                        class="style-scope yt-icon"></path>
                                </g>
                            </svg>
                            <!--css-build:shady-->
                        </yt-icon>
                    </a>
                    <yt-formatted-string
                        class="super-title style-scope ytd-video-primary-info-renderer"
                        force-default-style="">
                        <!--css-build:shady-->
                    </yt-formatted-string>
                    <h1 class="title style-scope ytd-video-primary-info-renderer">
                        <yt-formatted-string
                            force-default-style=""
                            class="style-scope ytd-video-primary-info-renderer">한시간만에 끝내는 Node.js 입문</yt-formatted-string>
                    </h1>
                    <ytd-badge-supported-renderer
                        class="style-scope ytd-video-primary-info-renderer"
                        disable-upgrade=""
                        hidden=""></ytd-badge-supported-renderer>
                    <div id="info" class="style-scope ytd-video-primary-info-renderer">
                        <div id="info-text" class="style-scope ytd-video-primary-info-renderer">
                            <div id="count" class="style-scope ytd-video-primary-info-renderer">
                                <ytd-video-view-count-renderer
                                    class="style-scope ytd-video-primary-info-renderer"
                                    small="">
                                    <!--css-build:shady-->
                                    <span class="view-count style-scope ytd-video-view-count-renderer">조회수 39,975회</span>
                                    <span class="short-view-count style-scope ytd-video-view-count-renderer">조회수 3.9만회</span>
                                </ytd-video-view-count-renderer>
                            </div>
                            <div id="info-strings" class="style-scope ytd-video-primary-info-renderer">
                                <span id="dot" class="style-scope ytd-video-primary-info-renderer"></span>
                                <yt-formatted-string class="style-scope ytd-video-primary-info-renderer">2020. 8. 6.</yt-formatted-string>
                                <dom-repeat class="style-scope ytd-video-primary-info-renderer">
                                    <template is="dom-repeat"></template>
                                </dom-repeat>
                            </div>
                        </div>
                        <div id="flex" class="style-scope ytd-video-primary-info-renderer"></div>
                        <div id="menu-container" class="style-scope ytd-video-primary-info-renderer">
                            <div id="menu" class="style-scope ytd-video-primary-info-renderer">
                                <ytd-menu-renderer class="style-scope ytd-video-primary-info-renderer">
                                    <!--css-build:shady-->
                                    <div
                                        id="top-level-buttons-computed"
                                        class="top-level-buttons style-scope ytd-menu-renderer">
                                        <ytd-toggle-button-renderer
                                            class="style-scope ytd-menu-renderer force-icon-button style-text"
                                            use-keyboard-focused=""
                                            system-icons=""
                                            button-renderer="true"
                                            style-action-button=""
                                            is-icon-button="">
                                            <a
                                                class="yt-simple-endpoint style-scope ytd-toggle-button-renderer"
                                                tabindex="-1">
                                                <yt-icon-button
                                                    id="button"
                                                    class="style-scope ytd-toggle-button-renderer style-text"
                                                    touch-feedback="">
                                                    <!--css-build:shady-->
                                                    <button
                                                        id="button"
                                                        class="style-scope yt-icon-button"
                                                        aria-label="나 외에 사용자 826명이 이 동영상을 좋아함"
                                                        aria-pressed="false">
                                                        <yt-icon class="style-scope ytd-toggle-button-renderer">
                                                            <svg
                                                                viewBox="0 0 24 24"
                                                                preserveAspectRatio="xMidYMid meet"
                                                                focusable="false"
                                                                class="style-scope yt-icon"
                                                                style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                                <g class="style-scope yt-icon">
                                                                    <path
                                                                        d="M18.77,11h-4.23l1.52-4.94C16.38,5.03,15.54,4,14.38,4c-0.58,0-1.14,0.24-1.52,0.65L7,11H3v10h4h1h9.43 c1.06,0,1.98-0.67,2.19-1.61l1.34-6C21.23,12.15,20.18,11,18.77,11z M7,20H4v-8h3V20z M19.98,13.17l-1.34,6 C18.54,19.65,18.03,20,17.43,20H8v-8.61l5.6-6.06C13.79,5.12,14.08,5,14.38,5c0.26,0,0.5,0.11,0.63,0.3 c0.07,0.1,0.15,0.26,0.09,0.47l-1.52,4.94L13.18,12h1.35h4.23c0.41,0,0.8,0.17,1.03,0.46C19.92,12.61,20.05,12.86,19.98,13.17z"
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
                                                <yt-formatted-string
                                                    id="text"
                                                    class="style-scope ytd-toggle-button-renderer style-text"
                                                    aria-label="좋아요 826개">826</yt-formatted-string>
                                                <tp-yt-paper-tooltip
                                                    class="style-scope ytd-toggle-button-renderer"
                                                    role="tooltip"
                                                    tabindex="-1"
                                                    style="inset: 44px auto auto 0px;">
                                                    <!--css-build:shady-->
                                                    <div id="tooltip" class="style-scope tp-yt-paper-tooltip hidden">
                                                        이 동영상이 마음에 듭니다.
                                                    </div>
                                                </tp-yt-paper-tooltip>
                                            </a>
                                        </ytd-toggle-button-renderer>
                                        <ytd-toggle-button-renderer
                                            class="style-scope ytd-menu-renderer force-icon-button style-text"
                                            use-keyboard-focused=""
                                            system-icons=""
                                            button-renderer="true"
                                            style-action-button=""
                                            is-icon-button="">
                                            <a
                                                class="yt-simple-endpoint style-scope ytd-toggle-button-renderer"
                                                tabindex="-1">
                                                <yt-icon-button
                                                    id="button"
                                                    class="style-scope ytd-toggle-button-renderer style-text"
                                                    touch-feedback="">
                                                    <!--css-build:shady-->
                                                    <button
                                                        id="button"
                                                        class="style-scope yt-icon-button"
                                                        aria-label="나 외에 사용자 16명이 이 동영상을 싫어함"
                                                        aria-pressed="false">
                                                        <yt-icon class="style-scope ytd-toggle-button-renderer">
                                                            <svg
                                                                viewBox="0 0 24 24"
                                                                preserveAspectRatio="xMidYMid meet"
                                                                focusable="false"
                                                                class="style-scope yt-icon"
                                                                style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                                <g class="style-scope yt-icon">
                                                                    <path
                                                                        d="M17,4h-1H6.57C5.5,4,4.59,4.67,4.38,5.61l-1.34,6C2.77,12.85,3.82,14,5.23,14h4.23l-1.52,4.94C7.62,19.97,8.46,21,9.62,21 c0.58,0,1.14-0.24,1.52-0.65L17,14h4V4H17z M10.4,19.67C10.21,19.88,9.92,20,9.62,20c-0.26,0-0.5-0.11-0.63-0.3 c-0.07-0.1-0.15-0.26-0.09-0.47l1.52-4.94l0.4-1.29H9.46H5.23c-0.41,0-0.8-0.17-1.03-0.46c-0.12-0.15-0.25-0.4-0.18-0.72l1.34-6 C5.46,5.35,5.97,5,6.57,5H16v8.61L10.4,19.67z M20,13h-3V5h3V13z"
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
                                                <yt-formatted-string
                                                    id="text"
                                                    class="style-scope ytd-toggle-button-renderer style-text"
                                                    aria-label="싫어요 16개">16</yt-formatted-string>
                                            </a>
                                        </ytd-toggle-button-renderer>
                                        <ytd-button-renderer
                                            class="style-scope ytd-menu-renderer force-icon-button style-default size-default"
                                            use-keyboard-focused=""
                                            button-renderer="true"
                                            style-action-button=""
                                            is-icon-button="">
                                            <a class="yt-simple-endpoint style-scope ytd-button-renderer" tabindex="-1">
                                                <yt-icon-button
                                                    id="button"
                                                    class="style-scope ytd-button-renderer style-default size-default"
                                                    touch-feedback="">
                                                    <!--css-build:shady-->
                                                    <button id="button" class="style-scope yt-icon-button" aria-label="공유">
                                                        <yt-icon class="style-scope ytd-button-renderer">
                                                            <svg
                                                                viewBox="0 0 24 24"
                                                                preserveAspectRatio="xMidYMid meet"
                                                                focusable="false"
                                                                class="style-scope yt-icon"
                                                                style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                                <g mirror-in-rtl="" class="style-scope yt-icon">
                                                                    <path
                                                                        d="M15,5.63L20.66,12L15,18.37V15v-1h-1c-3.96,0-7.14,1-9.75,3.09c1.84-4.07,5.11-6.4,9.89-7.1L15,9.86V9V5.63 M14,3v6 C6.22,10.13,3.11,15.33,2,21c2.78-3.97,6.44-6,12-6v6l8-9L14,3L14,3z"
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
                                                <yt-formatted-string
                                                    id="text"
                                                    class="style-scope ytd-button-renderer style-default size-default">공유</yt-formatted-string>
                                            </a>
                                        </ytd-button-renderer>
                                        <ytd-button-renderer
                                            class="style-scope ytd-menu-renderer force-icon-button style-default size-default"
                                            use-keyboard-focused=""
                                            button-renderer="true"
                                            style-action-button=""
                                            is-icon-button="">
                                            <a class="yt-simple-endpoint style-scope ytd-button-renderer" tabindex="-1">
                                                <yt-icon-button
                                                    id="button"
                                                    class="style-scope ytd-button-renderer style-default size-default"
                                                    touch-feedback="">
                                                    <!--css-build:shady-->
                                                    <button id="button" class="style-scope yt-icon-button" aria-label="재생목록에 저장">
                                                        <yt-icon class="style-scope ytd-button-renderer">
                                                            <svg
                                                                viewBox="0 0 24 24"
                                                                preserveAspectRatio="xMidYMid meet"
                                                                focusable="false"
                                                                class="style-scope yt-icon"
                                                                style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                                <g class="style-scope yt-icon">
                                                                    <path
                                                                        d="M22,13h-4v4h-2v-4h-4v-2h4V7h2v4h4V13z M14,7H2v1h12V7z M2,12h8v-1H2V12z M2,16h8v-1H2V16z"
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
                                                <yt-formatted-string
                                                    id="text"
                                                    class="style-scope ytd-button-renderer style-default size-default">저장</yt-formatted-string>
                                            </a>
                                        </ytd-button-renderer>
                                    </div>
                                    <yt-icon-button
                                        id="button"
                                        class="dropdown-trigger style-scope ytd-menu-renderer"
                                        touch-feedback="">
                                        <!--css-build:shady-->
                                        <button id="button" class="style-scope yt-icon-button" aria-label="추가 작업">
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
                            <ytd-sentiment-bar-renderer
                                id="sentiment"
                                class="style-scope ytd-video-primary-info-renderer"
                                system-icons=""
                                style="width: 134px;">
                                <!--css-build:shady-->
                                <div id="container" class="style-scope ytd-sentiment-bar-renderer">
                                    <div
                                        id="like-bar"
                                        class="style-scope ytd-sentiment-bar-renderer"
                                        style="width: 98%;"></div>
                                </div>
                                <tp-yt-paper-tooltip
                                    position="top"
                                    class="style-scope ytd-sentiment-bar-renderer"
                                    role="tooltip"
                                    tabindex="-1">
                                    <!--css-build:shady-->
                                    <div id="tooltip" class="hidden style-scope tp-yt-paper-tooltip">
                                        826 / 16
                                    </div>
                                </tp-yt-paper-tooltip>
                            </ytd-sentiment-bar-renderer>
                        </div>
                    </div>
                </div>
            </ytd-video-primary-info-renderer>
        </div>
    </div>
</template>