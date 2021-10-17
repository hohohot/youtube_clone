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
                            class="style-scope ytd-video-primary-info-renderer">{{videoInfoDatas.title}}</yt-formatted-string>
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
                                    <span class="view-count style-scope ytd-video-view-count-renderer">조회수 {{videoInfoDatas.views}}회</span>
                                    <span class="short-view-count style-scope ytd-video-view-count-renderer">조회수 3.9만회</span>
                                </ytd-video-view-count-renderer>
                            </div>
                            <div id="info-strings" class="style-scope ytd-video-primary-info-renderer">
                                <span id="dot" class="style-scope ytd-video-primary-info-renderer"></span>
                                <yt-formatted-string class="style-scope ytd-video-primary-info-renderer">{{videoInfoDatas.createdDate}}</yt-formatted-string>
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
                                                    aria-label="좋아요">{{videoInfoDatas.likes}}</yt-formatted-string>
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
                                        
                                    </div>
                                    
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

<script>
export default{
    props:['videoInfoDatas'],

};
</script>
