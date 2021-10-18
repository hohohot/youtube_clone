<style lang="css" css-build-single="">
    @import "../../overall.css";
</style>

<template>
    <tp-yt-app-drawer
        id="guide"
        align="start"
        role="navigation"
        class="style-scope ytd-app"
        style="transition-duration: 0ms; touch-action: pan-y;"
        position="left"
        swipe-open=""
        opened=""
        persistent="">
        <!--css-build:shady-->
        <div
            id="scrim"
            class="style-scope tp-yt-app-drawer"
            style="transition-duration: 0ms;"></div>

        <div
            id="contentContainer"
            class="style-scope tp-yt-app-drawer"
            position="left"
            style="transition-duration: 0ms;"
            swipe-open=""
            opened=""
            persistent="">

            <div id="guide-wrapper" class="style-scope ytd-app">
                <div id="guide-spacer" class="style-scope ytd-app"></div>
                <div id="guide-content" class="style-scope ytd-app">
                    <div id="header" class="style-scope ytd-app" hidden="">

                        <yt-icon-button
                            id="guide-button"
                            pressed="true"
                            toggleable="true"
                            class="style-scope ytd-app"
                            aria-label="가이드"
                            touch-feedback="">
                            <!--css-build:shady-->
                            <button id="button" class="style-scope yt-icon-button" aria-pressed="true">
                                <yt-icon id="guide-icon" icon="yt-icons:menu" class="style-scope ytd-app">
                                    <svg
                                        viewBox="0 0 24 24"
                                        preserveAspectRatio="xMidYMid meet"
                                        focusable="false"
                                        class="style-scope yt-icon"
                                        style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                        <g class="style-scope yt-icon">
                                            <path
                                                d="M21,6H3V5h18V6z M21,11H3v1h18V11z M21,17H3v1h18V17z"
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
                        <ytd-topbar-logo-renderer class="style-scope ytd-app" disable-upgrade=""></ytd-topbar-logo-renderer>
                    </div>
                    <div id="guide-inner-content" class="style-scope ytd-app">

                        <ytd-guide-renderer id="guide-renderer" class="style-scope ytd-app">
                            <!--css-build:shady-->
                            <div id="sections" class="style-scope ytd-guide-renderer">
                                <ytd-guide-section-renderer
                                    class="style-scope ytd-guide-renderer"
                                    guide-persistent-and-visible="">
                                    <!--css-build:shady-->
                                    <h3 class="style-scope ytd-guide-section-renderer" hidden="">
                                        <yt-formatted-string
                                            id="guide-section-title"
                                            class="style-scope ytd-guide-section-renderer">
                                            <!--css-build:shady-->
                                        </yt-formatted-string>
                                    </h3>
                                    <div id="items" class="style-scope ytd-guide-section-renderer">
                                        <ytd-guide-entry-renderer
                                            class="style-scope ytd-guide-section-renderer"
                                            system-icons=""
                                            active=""
                                            is-primary=""
                                            line-end-style="none">
                                            <!--css-build:shady-->
                                            <a
                                                id="endpoint"
                                                class="yt-simple-endpoint style-scope ytd-guide-entry-renderer"
                                                tabindex="-1"
                                                role="tablist"
                                                title="홈"
                                                href="../YouTube_files/saved_resource">
                                                <tp-yt-paper-item
                                                    role="tab"
                                                    class="style-scope ytd-guide-entry-renderer"
                                                    tabindex="0"
                                                    aria-disabled="false"
                                                    aria-selected="true">
                                                    <!--css-build:shady-->
                                                    <yt-icon class="guide-icon style-scope ytd-guide-entry-renderer">
                                                        <svg
                                                            viewBox="0 0 24 24"
                                                            preserveAspectRatio="xMidYMid meet"
                                                            focusable="false"
                                                            class="style-scope yt-icon"
                                                            style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                            <g class="style-scope yt-icon">
                                                                <path d="M4,10V21h6V15h4v6h6V10L12,3Z" class="style-scope yt-icon"></path>
                                                            </g>
                                                        </svg>
                                                        <!--css-build:shady-->
                                                    </yt-icon>
                                                    <yt-img-shadow
                                                        height="24"
                                                        width="24"
                                                        class="style-scope ytd-guide-entry-renderer"
                                                        disable-upgrade=""
                                                        hidden=""></yt-img-shadow>
                                                    <yt-formatted-string class="title style-scope ytd-guide-entry-renderer">홈</yt-formatted-string>
                                                    <span class="guide-entry-count style-scope ytd-guide-entry-renderer"></span>
                                                    <yt-icon
                                                        class="guide-entry-badge style-scope ytd-guide-entry-renderer"
                                                        disable-upgrade=""></yt-icon>
                                                    <div id="newness-dot" class="style-scope ytd-guide-entry-renderer"></div>

                                                </tp-yt-paper-item>
                                            </a>
                                            <yt-interaction class="style-scope ytd-guide-entry-renderer">
                                                <!--css-build:shady-->
                                                <div class="stroke style-scope yt-interaction"></div>
                                                <div class="fill style-scope yt-interaction"></div>
                                            </yt-interaction>
                                        </ytd-guide-entry-renderer>
                                        <ytd-guide-entry-renderer
                                            class="style-scope ytd-guide-section-renderer"
                                            is-primary=""
                                            line-end-style="none">
                                            <!--css-build:shady-->
                                            <a
                                                id="endpoint"
                                                class="yt-simple-endpoint style-scope ytd-guide-entry-renderer"
                                                tabindex="-1"
                                                role="tablist"
                                                title="탐색"
                                                href="">
                                                <tp-yt-paper-item
                                                    role="tab"
                                                    class="style-scope ytd-guide-entry-renderer"
                                                    tabindex="0"
                                                    aria-disabled="false"
                                                    aria-selected="false">
                                                    <!--css-build:shady-->
                                                    <yt-icon class="guide-icon style-scope ytd-guide-entry-renderer">
                                                        <svg
                                                            viewBox="0 0 24 24"
                                                            preserveAspectRatio="xMidYMid meet"
                                                            focusable="false"
                                                            class="style-scope yt-icon"
                                                            style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                            <g class="style-scope yt-icon">
                                                                <path
                                                                    d="M9.8,9.8l-3.83,8.23l8.23-3.83l3.83-8.23L9.8,9.8z M13.08,12.77c-0.21,0.29-0.51,0.48-0.86,0.54 c-0.07,0.01-0.15,0.02-0.22,0.02c-0.28,0-0.54-0.08-0.77-0.25c-0.29-0.21-0.48-0.51-0.54-0.86c-0.06-0.35,0.02-0.71,0.23-0.99 c0.21-0.29,0.51-0.48,0.86-0.54c0.35-0.06,0.7,0.02,0.99,0.23c0.29,0.21,0.48,0.51,0.54,0.86C13.37,12.13,13.29,12.48,13.08,12.77z M12,3c4.96,0,9,4.04,9,9s-4.04,9-9,9s-9-4.04-9-9S7.04,3,12,3 M12,2C6.48,2,2,6.48,2,12s4.48,10,10,10s10-4.48,10-10S17.52,2,12,2 L12,2z"
                                                                    class="style-scope yt-icon"></path>
                                                            </g>
                                                        </svg>
                                                        <!--css-build:shady-->
                                                    </yt-icon>
                                                    <yt-img-shadow
                                                        height="24"
                                                        width="24"
                                                        class="style-scope ytd-guide-entry-renderer"
                                                        disable-upgrade=""
                                                        hidden=""></yt-img-shadow>
                                                    <yt-formatted-string class="title style-scope ytd-guide-entry-renderer">탐색</yt-formatted-string>
                                                    <span class="guide-entry-count style-scope ytd-guide-entry-renderer"></span>
                                                    <yt-icon
                                                        class="guide-entry-badge style-scope ytd-guide-entry-renderer"
                                                        disable-upgrade=""></yt-icon>
                                                    <div id="newness-dot" class="style-scope ytd-guide-entry-renderer"></div>

                                                </tp-yt-paper-item>
                                            </a>
                                            <yt-interaction class="style-scope ytd-guide-entry-renderer">
                                                <!--css-build:shady-->
                                                <div class="stroke style-scope yt-interaction"></div>
                                                <div class="fill style-scope yt-interaction"></div>
                                            </yt-interaction>
                                        </ytd-guide-entry-renderer>
                                        <ytd-guide-entry-renderer
                                            class="style-scope ytd-guide-section-renderer"
                                            is-primary=""
                                            line-end-style="none">
                                            <!--css-build:shady-->
                                            <a
                                                id="endpoint"
                                                class="yt-simple-endpoint style-scope ytd-guide-entry-renderer"
                                                tabindex="-1"
                                                role="tablist"
                                                title="구독"
                                                href="/">
                                                <tp-yt-paper-item
                                                    role="tab"
                                                    class="style-scope ytd-guide-entry-renderer"
                                                    tabindex="0"
                                                    aria-disabled="false"
                                                    aria-selected="false">
                                                    <!--css-build:shady-->
                                                    <yt-icon class="guide-icon style-scope ytd-guide-entry-renderer">
                                                        <svg
                                                            viewBox="0 0 24 24"
                                                            preserveAspectRatio="xMidYMid meet"
                                                            focusable="false"
                                                            class="style-scope yt-icon"
                                                            style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                            <g class="style-scope yt-icon">
                                                                <path
                                                                    d="M10,18v-6l5,3L10,18z M17,3H7v1h10V3z M20,6H4v1h16V6z M22,9H2v12h20V9z M3,10h18v10H3V10z"
                                                                    class="style-scope yt-icon"></path>
                                                            </g>
                                                        </svg>
                                                        <!--css-build:shady-->
                                                    </yt-icon>
                                                    <yt-img-shadow
                                                        height="24"
                                                        width="24"
                                                        class="style-scope ytd-guide-entry-renderer"
                                                        disable-upgrade=""
                                                        hidden=""></yt-img-shadow>
                                                    <yt-formatted-string class="title style-scope ytd-guide-entry-renderer">구독</yt-formatted-string>
                                                    <span class="guide-entry-count style-scope ytd-guide-entry-renderer"></span>
                                                    <yt-icon
                                                        class="guide-entry-badge style-scope ytd-guide-entry-renderer"
                                                        disable-upgrade=""></yt-icon>
                                                    <div id="newness-dot" class="style-scope ytd-guide-entry-renderer"></div>

                                                </tp-yt-paper-item>
                                            </a>
                                            <yt-interaction class="style-scope ytd-guide-entry-renderer">
                                                <!--css-build:shady-->
                                                <div class="stroke style-scope yt-interaction"></div>
                                                <div class="fill style-scope yt-interaction"></div>
                                            </yt-interaction>
                                        </ytd-guide-entry-renderer>
                                        <ytd-guide-collapsible-section-entry-renderer
                                            class="style-scope ytd-guide-section-renderer">
                                            <!--css-build:shady-->
                                            <div
                                                id="section-items"
                                                class="style-scope ytd-guide-collapsible-section-entry-renderer">
                                                <ytd-guide-entry-renderer
                                                    class="style-scope ytd-guide-collapsible-section-entry-renderer"
                                                    line-end-style="none">
                                                    <!--css-build:shady-->
                                                    <a
                                                        id="endpoint"
                                                        class="yt-simple-endpoint style-scope ytd-guide-entry-renderer"
                                                        tabindex="-1"
                                                        role="tablist"
                                                        title="시청 기록"
                                                        href="">
                                                        <tp-yt-paper-item
                                                            role="tab"
                                                            class="style-scope ytd-guide-entry-renderer"
                                                            tabindex="0"
                                                            aria-disabled="false"
                                                            aria-selected="false">
                                                            <!--css-build:shady-->
                                                            <yt-icon class="guide-icon style-scope ytd-guide-entry-renderer">
                                                                <svg
                                                                    viewBox="0 0 24 24"
                                                                    preserveAspectRatio="xMidYMid meet"
                                                                    focusable="false"
                                                                    class="style-scope yt-icon"
                                                                    style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                                    <g class="style-scope yt-icon">
                                                                        <path
                                                                            d="M14.97,16.95L10,13.87V7h2v5.76l4.03,2.49L14.97,16.95z M22,12c0,5.51-4.49,10-10,10S2,17.51,2,12h1c0,4.96,4.04,9,9,9 s9-4.04,9-9s-4.04-9-9-9C8.81,3,5.92,4.64,4.28,7.38C4.17,7.56,4.06,7.75,3.97,7.94C3.96,7.96,3.95,7.98,3.94,8H8v1H1.96V3h1v4.74 C3,7.65,3.03,7.57,3.07,7.49C3.18,7.27,3.3,7.07,3.42,6.86C5.22,3.86,8.51,2,12,2C17.51,2,22,6.49,22,12z"
                                                                            class="style-scope yt-icon"></path>
                                                                    </g>
                                                                </svg>
                                                                <!--css-build:shady-->
                                                            </yt-icon>
                                                            <yt-img-shadow
                                                                height="24"
                                                                width="24"
                                                                class="style-scope ytd-guide-entry-renderer"
                                                                disable-upgrade=""
                                                                hidden=""></yt-img-shadow>
                                                            <yt-formatted-string class="title style-scope ytd-guide-entry-renderer">시청 기록</yt-formatted-string>
                                                            <span class="guide-entry-count style-scope ytd-guide-entry-renderer"></span>
                                                            <yt-icon
                                                                class="guide-entry-badge style-scope ytd-guide-entry-renderer"
                                                                disable-upgrade=""></yt-icon>
                                                            <div id="newness-dot" class="style-scope ytd-guide-entry-renderer"></div>

                                                        </tp-yt-paper-item>
                                                    </a>
                                                    <yt-interaction class="style-scope ytd-guide-entry-renderer">
                                                        <!--css-build:shady-->
                                                        <div class="stroke style-scope yt-interaction"></div>
                                                        <div class="fill style-scope yt-interaction"></div>
                                                    </yt-interaction>
                                                </ytd-guide-entry-renderer>
                                                <ytd-guide-entry-renderer
                                                    class="style-scope ytd-guide-collapsible-section-entry-renderer"
                                                    line-end-style="none">
                                                    <!--css-build:shady-->
                                                    <a
                                                        id="endpoint"
                                                        class="yt-simple-endpoint style-scope ytd-guide-entry-renderer"
                                                        tabindex="-1"
                                                        role="tablist"
                                                        title="내 동영상"
                                                        href="/">
                                                        <tp-yt-paper-item
                                                            role="tab"
                                                            class="style-scope ytd-guide-entry-renderer"
                                                            tabindex="0"
                                                            aria-disabled="false"
                                                            aria-selected="false">
                                                            <!--css-build:shady-->
                                                            <yt-icon class="guide-icon style-scope ytd-guide-entry-renderer">
                                                                <svg
                                                                    viewBox="0 0 24 24"
                                                                    preserveAspectRatio="xMidYMid meet"
                                                                    focusable="false"
                                                                    class="style-scope yt-icon"
                                                                    style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                                    <g class="style-scope yt-icon">
                                                                        <path
                                                                            d="M10,8l6,4l-6,4V8L10,8z M21,3v18H3V3H21z M20,4H4v16h16V4z"
                                                                            class="style-scope yt-icon"></path>
                                                                    </g>
                                                                </svg>
                                                                <!--css-build:shady-->
                                                            </yt-icon>
                                                            <yt-img-shadow
                                                                height="24"
                                                                width="24"
                                                                class="style-scope ytd-guide-entry-renderer"
                                                                disable-upgrade=""
                                                                hidden=""></yt-img-shadow>
                                                            <yt-formatted-string class="title style-scope ytd-guide-entry-renderer">내 동영상</yt-formatted-string>
                                                            <span class="guide-entry-count style-scope ytd-guide-entry-renderer"></span>
                                                            <yt-icon
                                                                class="guide-entry-badge style-scope ytd-guide-entry-renderer"
                                                                disable-upgrade=""></yt-icon>
                                                            <div id="newness-dot" class="style-scope ytd-guide-entry-renderer"></div>

                                                        </tp-yt-paper-item>
                                                    </a>
                                                    <yt-interaction class="style-scope ytd-guide-entry-renderer">




                                                        <!--css-build:shady-->
                                                        <div class="stroke style-scope yt-interaction"></div>
                                                        <div class="fill style-scope yt-interaction"></div>
                                                    </yt-interaction>
                                                </ytd-guide-entry-renderer>
                                                <ytd-guide-entry-renderer
                                                    class="style-scope ytd-guide-collapsible-section-entry-renderer"
                                                    line-end-style="none">
                                                    <!--css-build:shady-->
                                                    <a
                                                        id="endpoint"
                                                        class="yt-simple-endpoint style-scope ytd-guide-entry-renderer"
                                                        tabindex="-1"
                                                        role="tablist"
                                                        title="좋아요 표시한 동영상"
                                                        href="">
                                                        <tp-yt-paper-item
                                                            role="tab"
                                                            class="style-scope ytd-guide-entry-renderer"
                                                            tabindex="0"
                                                            aria-disabled="false"
                                                            aria-selected="false">
                                                            <!--css-build:shady-->
                                                            <yt-icon class="guide-icon style-scope ytd-guide-entry-renderer">
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
                                                            <yt-img-shadow
                                                                height="24"
                                                                width="24"
                                                                class="style-scope ytd-guide-entry-renderer"
                                                                disable-upgrade=""
                                                                hidden=""></yt-img-shadow>
                                                            <yt-formatted-string class="title style-scope ytd-guide-entry-renderer">좋아요 표시한 동영상</yt-formatted-string>
                                                            <span class="guide-entry-count style-scope ytd-guide-entry-renderer"></span>
                                                            <yt-icon
                                                                class="guide-entry-badge style-scope ytd-guide-entry-renderer"
                                                                disable-upgrade=""></yt-icon>
                                                            <div id="newness-dot" class="style-scope ytd-guide-entry-renderer"></div>

                                                        </tp-yt-paper-item>
                                                    </a>
                                                    <yt-interaction class="style-scope ytd-guide-entry-renderer">
                                                        <!--css-build:shady-->
                                                        <div class="stroke style-scope yt-interaction"></div>
                                                        <div class="fill style-scope yt-interaction"></div>
                                                    </yt-interaction>
                                                </ytd-guide-entry-renderer>
                                            </div>
                                        </ytd-guide-collapsible-section-entry-renderer>
                                    </div>
                                </ytd-guide-section-renderer>
                                <ytd-guide-section-renderer
                                    class="style-scope ytd-guide-renderer"
                                    guide-persistent-and-visible="">
                                    <!--css-build:shady-->
                                    <h3 class="style-scope ytd-guide-section-renderer">
                                        <yt-formatted-string
                                            id="guide-section-title"
                                            class="style-scope ytd-guide-section-renderer">구독</yt-formatted-string>
                                    </h3>
                                    <div id="items" class="style-scope ytd-guide-section-renderer">
                                        
                                                                </div>
                                                            </ytd-guide-section-renderer>
                                                            <ytd-guide-section-renderer
                                                                class="style-scope ytd-guide-renderer"
                                                                guide-persistent-and-visible="">
                                                                <!--css-build:shady-->
                                                                <h3 class="style-scope ytd-guide-section-renderer" hidden="">
                                                                    <yt-formatted-string
                                                                        id="guide-section-title"
                                                                        class="style-scope ytd-guide-section-renderer">
                                                                        <!--css-build:shady-->
                                                                    </yt-formatted-string>
                                                                </h3>
                                                                <div id="items" class="style-scope ytd-guide-section-renderer">
                                                                    <ytd-guide-entry-renderer
                                                                        class="style-scope ytd-guide-section-renderer"
                                                                        line-end-style="none">
                                                                        <!--css-build:shady-->
                                                                        <a
                                                                            id="endpoint"
                                                                            class="yt-simple-endpoint style-scope ytd-guide-entry-renderer"
                                                                            tabindex="-1"
                                                                            role="tablist"
                                                                            title="설정"
                                                                            href="">
                                                                            <tp-yt-paper-item
                                                                                role="tab"
                                                                                class="style-scope ytd-guide-entry-renderer"
                                                                                tabindex="0"
                                                                                aria-disabled="false"
                                                                                aria-selected="false">
                                                                                <!--css-build:shady-->
                                                                                <yt-icon class="guide-icon style-scope ytd-guide-entry-renderer">
                                                                                    <svg
                                                                                        viewBox="0 0 24 24"
                                                                                        preserveAspectRatio="xMidYMid meet"
                                                                                        focusable="false"
                                                                                        class="style-scope yt-icon"
                                                                                        style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                                                        <g class="style-scope yt-icon">
                                                                                            <path
                                                                                                d="M12,9c1.65,0,3,1.35,3,3s-1.35,3-3,3s-3-1.35-3-3S10.35,9,12,9 M12,8c-2.21,0-4,1.79-4,4s1.79,4,4,4s4-1.79,4-4 S14.21,8,12,8L12,8z M13.22,3l0.55,2.2l0.13,0.51l0.5,0.18c0.61,0.23,1.19,0.56,1.72,0.98l0.4,0.32l0.5-0.14l2.17-0.62l1.22,2.11 l-1.63,1.59l-0.37,0.36l0.08,0.51c0.05,0.32,0.08,0.64,0.08,0.98s-0.03,0.66-0.08,0.98l-0.08,0.51l0.37,0.36l1.63,1.59l-1.22,2.11 l-2.17-0.62l-0.5-0.14l-0.4,0.32c-0.53,0.43-1.11,0.76-1.72,0.98l-0.5,0.18l-0.13,0.51L13.22,21h-2.44l-0.55-2.2l-0.13-0.51 l-0.5-0.18C9,17.88,8.42,17.55,7.88,17.12l-0.4-0.32l-0.5,0.14l-2.17,0.62L3.6,15.44l1.63-1.59l0.37-0.36l-0.08-0.51 C5.47,12.66,5.44,12.33,5.44,12s0.03-0.66,0.08-0.98l0.08-0.51l-0.37-0.36L3.6,8.56l1.22-2.11l2.17,0.62l0.5,0.14l0.4-0.32 C8.42,6.45,9,6.12,9.61,5.9l0.5-0.18l0.13-0.51L10.78,3H13.22 M14,2h-4L9.26,4.96c-0.73,0.27-1.4,0.66-2,1.14L4.34,5.27l-2,3.46 l2.19,2.13C4.47,11.23,4.44,11.61,4.44,12s0.03,0.77,0.09,1.14l-2.19,2.13l2,3.46l2.92-0.83c0.6,0.48,1.27,0.87,2,1.14L10,22h4 l0.74-2.96c0.73-0.27,1.4-0.66,2-1.14l2.92,0.83l2-3.46l-2.19-2.13c0.06-0.37,0.09-0.75,0.09-1.14s-0.03-0.77-0.09-1.14l2.19-2.13 l-2-3.46L16.74,6.1c-0.6-0.48-1.27-0.87-2-1.14L14,2L14,2z"
                                                                                                class="style-scope yt-icon"></path>
                                                                                        </g>
                                                                                    </svg>
                                                                                    <!--css-build:shady-->
                                                                                </yt-icon>
                                                                                <yt-img-shadow
                                                                                    height="24"
                                                                                    width="24"
                                                                                    class="style-scope ytd-guide-entry-renderer"
                                                                                    disable-upgrade=""
                                                                                    hidden=""></yt-img-shadow>
                                                                                <yt-formatted-string class="title style-scope ytd-guide-entry-renderer">설정</yt-formatted-string>
                                                                                <span class="guide-entry-count style-scope ytd-guide-entry-renderer"></span>
                                                                                <yt-icon
                                                                                    class="guide-entry-badge style-scope ytd-guide-entry-renderer"
                                                                                    disable-upgrade=""></yt-icon>
                                                                                <div id="newness-dot" class="style-scope ytd-guide-entry-renderer"></div>

                                                                            </tp-yt-paper-item>
                                                                        </a>
                                                                        <yt-interaction class="style-scope ytd-guide-entry-renderer">
                                                                            <!--css-build:shady-->
                                                                            <div class="stroke style-scope yt-interaction"></div>
                                                                            <div class="fill style-scope yt-interaction"></div>
                                                                        </yt-interaction>
                                                                    </ytd-guide-entry-renderer>
                                                                    <ytd-guide-entry-renderer
                                                                        class="style-scope ytd-guide-section-renderer"
                                                                        line-end-style="none">
                                                                        <!--css-build:shady-->
                                                                        <a
                                                                            id="endpoint"
                                                                            class="yt-simple-endpoint style-scope ytd-guide-entry-renderer"
                                                                            tabindex="-1"
                                                                            role="tablist"
                                                                            title="신고 기록"
                                                                            href="">
                                                                            <tp-yt-paper-item
                                                                                role="tab"
                                                                                class="style-scope ytd-guide-entry-renderer"
                                                                                tabindex="0"
                                                                                aria-disabled="false"
                                                                                aria-selected="false">
                                                                                <!--css-build:shady-->
                                                                                <yt-icon class="guide-icon style-scope ytd-guide-entry-renderer">
                                                                                    <svg
                                                                                        viewBox="0 0 24 24"
                                                                                        preserveAspectRatio="xMidYMid meet"
                                                                                        focusable="false"
                                                                                        class="style-scope yt-icon"
                                                                                        style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                                                        <g class="style-scope yt-icon">
                                                                                            <path
                                                                                                d="M13.18,4l0.24,1.2L13.58,6h0.82H19v7h-5.18l-0.24-1.2L13.42,11H12.6H6V4H13.18 M14,3H5v18h1v-9h6.6l0.4,2h7V5h-5.6L14,3 L14,3z"
                                                                                                class="style-scope yt-icon"></path>
                                                                                        </g>
                                                                                    </svg>
                                                                                    <!--css-build:shady-->
                                                                                </yt-icon>
                                                                                <yt-img-shadow
                                                                                    height="24"
                                                                                    width="24"
                                                                                    class="style-scope ytd-guide-entry-renderer"
                                                                                    disable-upgrade=""
                                                                                    hidden=""></yt-img-shadow>
                                                                                <yt-formatted-string class="title style-scope ytd-guide-entry-renderer">신고 기록</yt-formatted-string>
                                                                                <span class="guide-entry-count style-scope ytd-guide-entry-renderer"></span>
                                                                                <yt-icon
                                                                                    class="guide-entry-badge style-scope ytd-guide-entry-renderer"
                                                                                    disable-upgrade=""></yt-icon>
                                                                                <div id="newness-dot" class="style-scope ytd-guide-entry-renderer"></div>

                                                                            </tp-yt-paper-item>
                                                                        </a>
                                                                        <yt-interaction class="style-scope ytd-guide-entry-renderer">
                                                                            <!--css-build:shady-->
                                                                            <div class="stroke style-scope yt-interaction"></div>
                                                                            <div class="fill style-scope yt-interaction"></div>
                                                                        </yt-interaction>
                                                                    </ytd-guide-entry-renderer>
                                                                    <ytd-guide-entry-renderer
                                                                        class="style-scope ytd-guide-section-renderer"
                                                                        line-end-style="none">
                                                                        <!--css-build:shady-->
                                                                        <a
                                                                            id="endpoint"
                                                                            class="yt-simple-endpoint style-scope ytd-guide-entry-renderer"
                                                                            tabindex="-1"
                                                                            role="tablist"
                                                                            title="고객센터">
                                                                            <tp-yt-paper-item
                                                                                role="tab"
                                                                                class="style-scope ytd-guide-entry-renderer"
                                                                                tabindex="0"
                                                                                aria-disabled="false"
                                                                                aria-selected="false">
                                                                                <!--css-build:shady-->
                                                                                <yt-icon class="guide-icon style-scope ytd-guide-entry-renderer">
                                                                                    <svg
                                                                                        viewBox="0 0 24 24"
                                                                                        preserveAspectRatio="xMidYMid meet"
                                                                                        focusable="false"
                                                                                        class="style-scope yt-icon"
                                                                                        style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                                                        <g class="style-scope yt-icon">
                                                                                            <path
                                                                                                d="M15.36,9.96c0,1.09-0.67,1.67-1.31,2.24c-0.53,0.47-1.03,0.9-1.16,1.6L12.85,14h-1.75l0.03-0.28 c0.14-1.17,0.8-1.76,1.47-2.27c0.52-0.4,1.01-0.77,1.01-1.49c0-0.51-0.23-0.97-0.63-1.29c-0.4-0.31-0.92-0.42-1.42-0.29 c-0.59,0.15-1.05,0.67-1.19,1.34L10.32,10H8.57l0.06-0.42c0.2-1.4,1.15-2.53,2.42-2.87c1.05-0.29,2.14-0.08,2.98,0.57 C14.88,7.92,15.36,8.9,15.36,9.96z M12,18c0.55,0,1-0.45,1-1s-0.45-1-1-1s-1,0.45-1,1S11.45,18,12,18z M12,3c-4.96,0-9,4.04-9,9 s4.04,9,9,9s9-4.04,9-9S16.96,3,12,3 M12,2c5.52,0,10,4.48,10,10s-4.48,10-10,10S2,17.52,2,12S6.48,2,12,2L12,2z"
                                                                                                class="style-scope yt-icon"></path>
                                                                                        </g>
                                                                                    </svg>
                                                                                    <!--css-build:shady-->
                                                                                </yt-icon>
                                                                                <yt-img-shadow
                                                                                    height="24"
                                                                                    width="24"
                                                                                    class="style-scope ytd-guide-entry-renderer"
                                                                                    disable-upgrade=""
                                                                                    hidden=""></yt-img-shadow>
                                                                                <yt-formatted-string class="title style-scope ytd-guide-entry-renderer">고객센터</yt-formatted-string>
                                                                                <span class="guide-entry-count style-scope ytd-guide-entry-renderer"></span>
                                                                                <yt-icon
                                                                                    class="guide-entry-badge style-scope ytd-guide-entry-renderer"
                                                                                    disable-upgrade=""></yt-icon>
                                                                                <div id="newness-dot" class="style-scope ytd-guide-entry-renderer"></div>

                                                                            </tp-yt-paper-item>
                                                                        </a>
                                                                        <yt-interaction class="style-scope ytd-guide-entry-renderer">
                                                                            <!--css-build:shady-->
                                                                            <div class="stroke style-scope yt-interaction"></div>
                                                                            <div class="fill style-scope yt-interaction"></div>
                                                                        </yt-interaction>
                                                                    </ytd-guide-entry-renderer>
                                                                    <ytd-guide-entry-renderer
                                                                        class="style-scope ytd-guide-section-renderer"
                                                                        line-end-style="none">
                                                                        <!--css-build:shady-->
                                                                        <a
                                                                            id="endpoint"
                                                                            class="yt-simple-endpoint style-scope ytd-guide-entry-renderer"
                                                                            tabindex="-1"
                                                                            role="tablist"
                                                                            title="의견 보내기">
                                                                            <tp-yt-paper-item
                                                                                role="tab"
                                                                                class="style-scope ytd-guide-entry-renderer"
                                                                                tabindex="0"
                                                                                aria-disabled="false"
                                                                                aria-selected="false">
                                                                                <!--css-build:shady-->
                                                                                <yt-icon class="guide-icon style-scope ytd-guide-entry-renderer">
                                                                                    <svg
                                                                                        viewBox="0 0 24 24"
                                                                                        preserveAspectRatio="xMidYMid meet"
                                                                                        focusable="false"
                                                                                        class="style-scope yt-icon"
                                                                                        style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                                                        <g class="style-scope yt-icon">
                                                                                            <path
                                                                                                d="M13,14h-2v-2h2V14z M13,5h-2v6h2V5z M19,3H5v16.59l3.29-3.29L8.59,16H9h10V3 M20,2v15H9l-5,5V2H20L20,2z"
                                                                                                class="style-scope yt-icon"></path>
                                                                                        </g>
                                                                                    </svg>
                                                                                    <!--css-build:shady-->
                                                                                </yt-icon>
                                                                                <yt-img-shadow
                                                                                    height="24"
                                                                                    width="24"
                                                                                    class="style-scope ytd-guide-entry-renderer"
                                                                                    disable-upgrade=""
                                                                                    hidden=""></yt-img-shadow>
                                                                                <yt-formatted-string class="title style-scope ytd-guide-entry-renderer">의견 보내기</yt-formatted-string>
                                                                                <span class="guide-entry-count style-scope ytd-guide-entry-renderer"></span>
                                                                                <yt-icon
                                                                                    class="guide-entry-badge style-scope ytd-guide-entry-renderer"
                                                                                    disable-upgrade=""></yt-icon>
                                                                                <div id="newness-dot" class="style-scope ytd-guide-entry-renderer"></div>

                                                                            </tp-yt-paper-item>
                                                                        </a>
                                                                        <yt-interaction class="style-scope ytd-guide-entry-renderer">
                                                                            <!--css-build:shady-->
                                                                            <div class="stroke style-scope yt-interaction"></div>
                                                                            <div class="fill style-scope yt-interaction"></div>
                                                                        </yt-interaction>
                                                                    </ytd-guide-entry-renderer>
                                                                </div>
                                                            </ytd-guide-section-renderer>
                                                        </div>
                                                        
                                                            </ytd-guide-renderer>
                                                            <dom-if class="style-scope ytd-app">
                                                                <template></template>
                                                            </dom-if>
                                                        </div>
                                                    </div>
                                                </div>

                                            </div>
                                        </tp-yt-app-drawer>
                                    </template>