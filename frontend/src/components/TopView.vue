<style lang="css" css-build-single="">
    @import "../../overall.css";
</style>

<template>
    <div id="masthead-container" class="style-scope ytd-app">
        <ytd-masthead
            slot="masthead"
            id="masthead"
            logo-type="YOUTUBE_PREMIUM_LOGO"
            desktop-sbox-icon="default"
            role="banner"
            guide-persistent-and-visible=""
            class="masthead-finish">
            <iron-media-query
                query="max-width: 656px"
                class="style-scope ytd-masthead"
                style="display: none;"></iron-media-query>
            <div id="ticker" class="style-scope ytd-masthead"></div>
            <div id="interstitial" class="style-scope ytd-masthead"></div>
            <div id="container" class="style-scope ytd-masthead">
                <div id="start" class="style-scope ytd-masthead">
                    <yt-icon-button
                        id="back-button"
                        touch-feedback=""
                        class="style-scope ytd-masthead">
                        <button id="button" aria-label="뒤로" class="style-scope yt-icon-button">
                            <yt-icon
                                icon="yt-icons:arrow-back"
                                disable-upgrade=""
                                class="style-scope ytd-masthead"></yt-icon>
                        </button>
                        <yt-interaction id="interaction" class="circular style-scope yt-icon-button">
                            <div class="stroke style-scope yt-interaction"></div>
                            <div class="fill style-scope yt-interaction"></div>
                        </yt-interaction>
                    </yt-icon-button>
                    <tp-yt-paper-tooltip
                        id="back-button-tooltip"
                        for="back-button"
                        disable-upgrade=""
                        class="style-scope ytd-masthead">
                        뒤로
                    </tp-yt-paper-tooltip>
                    <yt-icon-button
                        id="guide-button"
                        toggleable="true"
                        touch-feedback=""
                        class="style-scope ytd-masthead">
                        <button
                            id="button"
                            aria-label="가이드"
                            aria-pressed="true"
                            class="style-scope yt-icon-button">
                            <yt-icon id="guide-icon" icon="yt-icons:menu" class="style-scope ytd-masthead">
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
                            </yt-icon>
                        </button>
                        <yt-interaction id="interaction" class="circular style-scope yt-icon-button">
                            <div class="stroke style-scope yt-interaction"></div>
                            <div class="fill style-scope yt-interaction"></div>
                        </yt-interaction>
                    </yt-icon-button>
                    <ytd-topbar-logo-renderer
                        id="logo"
                        use-yoodle=""
                        is-red-logo=""
                        class="style-scope ytd-masthead">
                        <a
                            id="logo"
                            href="./YouTube_files/saved_resource"
                            title="YouTube 홈"
                            class="yt-simple-endpoint style-scope ytd-topbar-logo-renderer">
                            <div class="style-scope ytd-topbar-logo-renderer">
                                <yt-icon id="logo-icon" class="style-scope ytd-topbar-logo-renderer">
                                    <svg
                                        viewBox="0 0 97 20"
                                        preserveAspectRatio="xMidYMid meet"
                                        focusable="false"
                                        class="style-scope yt-icon"
                                        style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                        <g
                                            viewBox="0 0 97 20"
                                            preserveAspectRatio="xMidYMid meet"
                                            class="style-scope yt-icon">
                                            <g class="style-scope yt-icon">
                                                <path
                                                    d="M27.9704 3.12324C27.6411 1.89323 26.6745 0.926623 25.4445 0.597366C23.2173 2.24288e-07 14.2827 0 14.2827 0C14.2827 0 5.34807 2.24288e-07 3.12088 0.597366C1.89323 0.926623 0.924271 1.89323 0.595014 3.12324C-2.8036e-07 5.35042 0 10 0 10C0 10 -1.57002e-06 14.6496 0.597364 16.8768C0.926621 18.1068 1.89323 19.0734 3.12324 19.4026C5.35042 20 14.285 20 14.285 20C14.285 20 23.2197 20 25.4468 19.4026C26.6769 19.0734 27.6435 18.1068 27.9727 16.8768C28.5701 14.6496 28.5701 10 28.5701 10C28.5701 10 28.5677 5.35042 27.9704 3.12324Z"
                                                    fill="#FF0000"
                                                    class="style-scope yt-icon"></path>
                                                <path
                                                    d="M11.4275 14.2854L18.8475 10.0004L11.4275 5.71533V14.2854Z"
                                                    fill="white"
                                                    class="style-scope yt-icon"></path>
                                            </g>
                                            <g id="youtube-red-paths" class="style-scope yt-icon">
                                                <path
                                                    d="M40.0566 6.34524V7.03668C40.0566 10.4915 38.5255 12.5118 35.1742 12.5118H34.6638V18.5583H31.9263V1.42285H35.414C38.6078 1.42285 40.0566 2.7728 40.0566 6.34524ZM37.1779 6.59218C37.1779 4.09924 36.7287 3.50658 35.1765 3.50658H34.6662V10.4727H35.1365C36.6064 10.4727 37.1803 9.40968 37.1803 7.10253L37.1779 6.59218Z"
                                                    class="style-scope yt-icon"></path>
                                                <path
                                                    d="M46.5336 5.8345L46.3901 9.08238C45.2259 8.83779 44.264 9.02123 43.836 9.77382V18.5579H41.1196V6.0391H43.2857L43.5303 8.75312H43.6337C43.9183 6.77288 44.8379 5.771 46.0232 5.771C46.1949 5.7757 46.3666 5.79687 46.5336 5.8345Z"
                                                    class="style-scope yt-icon"></path>
                                                <path
                                                    d="M49.6567 13.2456V13.8782C49.6567 16.0842 49.779 16.8415 50.7198 16.8415C51.6182 16.8415 51.8228 16.1501 51.8439 14.7178L54.2734 14.8613C54.4568 17.5565 53.0481 18.763 50.6586 18.763C47.7588 18.763 46.9004 16.8627 46.9004 13.4126V11.223C46.9004 7.58707 47.8599 5.80908 50.7409 5.80908C53.6407 5.80908 54.3769 7.32131 54.3769 11.0984V13.2456H49.6567ZM49.6567 10.6703V11.5687H51.7193V10.675C51.7193 8.37258 51.5547 7.71172 50.6821 7.71172C49.8096 7.71172 49.6567 8.38669 49.6567 10.675V10.6703Z"
                                                    class="style-scope yt-icon"></path>
                                                <path
                                                    d="M68.4103 9.09902V18.5557H65.5928V9.30834C65.5928 8.28764 65.327 7.77729 64.7132 7.77729C64.2216 7.77729 63.7724 8.06186 63.4667 8.59338C63.4832 8.76271 63.4902 8.93439 63.4879 9.10373V18.5605H60.668V9.30834C60.668 8.28764 60.4022 7.77729 59.7884 7.77729C59.2969 7.77729 58.8665 8.06186 58.5631 8.57456V18.5628H55.7456V6.03929H57.9728L58.2221 7.63383H58.2621C58.8947 6.42969 59.9178 5.77588 61.1219 5.77588C62.3072 5.77588 62.9799 6.36854 63.288 7.43157C63.9418 6.34973 64.9225 5.77588 66.0443 5.77588C67.7564 5.77588 68.4103 7.00119 68.4103 9.09902Z"
                                                    class="style-scope yt-icon"></path>
                                                <path
                                                    d="M69.8191 2.8338C69.8191 1.4862 70.3106 1.09814 71.3501 1.09814C72.4132 1.09814 72.8812 1.54734 72.8812 2.8338C72.8812 4.22373 72.4108 4.57181 71.3501 4.57181C70.3106 4.56945 69.8191 4.22138 69.8191 2.8338ZM69.9837 6.03935H72.6789V18.5629H69.9837V6.03935Z"
                                                    class="style-scope yt-icon"></path>
                                                <path
                                                    d="M81.891 6.03955V18.5631H79.6849L79.4403 17.032H79.3792C78.7466 18.2573 77.827 18.7677 76.684 18.7677C75.0095 18.7677 74.2522 17.7046 74.2522 15.3975V6.0419H77.0697V15.2352C77.0697 16.3382 77.3002 16.7874 77.867 16.7874C78.3844 16.7663 78.8477 16.4582 79.0688 15.9902V6.0419H81.891V6.03955Z"
                                                    class="style-scope yt-icon"></path>
                                                <path
                                                    d="M96.1901 9.09893V18.5557H93.3726V9.30825C93.3726 8.28755 93.1068 7.7772 92.493 7.7772C92.0015 7.7772 91.5523 8.06177 91.2465 8.59329C91.263 8.76027 91.2701 8.9296 91.2677 9.09893V18.5557H88.4502V9.30825C88.4502 8.28755 88.1845 7.7772 87.5706 7.7772C87.0791 7.7772 86.6487 8.06177 86.3453 8.57447V18.5627H83.5278V6.0392H85.7527L85.9973 7.63139H86.0372C86.6699 6.42725 87.6929 5.77344 88.8971 5.77344C90.0824 5.77344 90.755 6.3661 91.0631 7.42913C91.7169 6.34729 92.6976 5.77344 93.8194 5.77344C95.541 5.77579 96.1901 7.0011 96.1901 9.09893Z"
                                                    class="style-scope yt-icon"></path>
                                                <path
                                                    d="M40.0566 6.34524V7.03668C40.0566 10.4915 38.5255 12.5118 35.1742 12.5118H34.6638V18.5583H31.9263V1.42285H35.414C38.6078 1.42285 40.0566 2.7728 40.0566 6.34524ZM37.1779 6.59218C37.1779 4.09924 36.7287 3.50658 35.1765 3.50658H34.6662V10.4727H35.1365C36.6064 10.4727 37.1803 9.40968 37.1803 7.10253L37.1779 6.59218Z"
                                                    class="style-scope yt-icon"></path>
                                            </g>
                                        </g>
                                    </svg>
                                </yt-icon>
                            </div>
                        </a>
                        <span id="country-code" class="style-scope ytd-topbar-logo-renderer">KR</span>
                    </ytd-topbar-logo-renderer>
                    <div id="skip-navigation" class="style-scope ytd-masthead">
                        <ytd-button-renderer
                            use-keyboard-focused=""
                            button-renderer="true"
                            is-paper-button=""
                            class="style-scope ytd-masthead style-default size-default">
                            <a tabindex="-1" class="yt-simple-endpoint style-scope ytd-button-renderer">
                                <tp-yt-paper-button
                                    id="button"
                                    role="button"
                                    tabindex="0"
                                    animated=""
                                    elevation="0"
                                    aria-disabled="false"
                                    aria-label="탐색 건너뛰기"
                                    class="style-scope ytd-button-renderer style-default size-default">
                                    <yt-formatted-string
                                        id="text"
                                        class="style-scope ytd-button-renderer style-default size-default">탐색 건너뛰기</yt-formatted-string>
                                </tp-yt-paper-button>
                            </a>
                        </ytd-button-renderer>
                    </div>
                </div>
                <div id="center" class="style-scope ytd-masthead">
                    <ytd-searchbox
                        id="search"
                        desktop-searchbar-style="default"
                        desktop-sbox-icon="default"
                        system-icons=""
                        role="search"
                        class="style-scope ytd-masthead">
                        <form
                            id="search-form"
                            action="https://www.youtube.com/results"
                            class="style-scope ytd-searchbox">
                            <div id="container" class="style-scope ytd-searchbox">
                                <yt-icon id="search-icon" class="style-scope ytd-searchbox">
                                    <svg
                                        viewBox="0 0 24 24"
                                        preserveAspectRatio="xMidYMid meet"
                                        focusable="false"
                                        class="style-scope yt-icon"
                                        style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                        <g class="style-scope yt-icon">
                                            <path
                                                d="M20.87,20.17l-5.59-5.59C16.35,13.35,17,11.75,17,10c0-3.87-3.13-7-7-7s-7,3.13-7,7s3.13,7,7,7c1.75,0,3.35-0.65,4.58-1.71 l5.59,5.59L20.87,20.17z M10,16c-3.31,0-6-2.69-6-6s2.69-6,6-6s6,2.69,6,6S13.31,16,10,16z"
                                                class="style-scope yt-icon"></path>
                                        </g>
                                    </svg>
                                </yt-icon>
                                <div slot="search-input" id="search-input" class="ytd-searchbox-spt">
                                    <input
                                        id="search"
                                        autocapitalize="none"
                                        autocomplete="off"
                                        autocorrect="off"
                                        name="search_query"
                                        tabindex="0"
                                        type="text"
                                        spellcheck="false"
                                        placeholder="검색"
                                        aria-label="검색"
                                        aria-haspopup="false"
                                        role="combobox"
                                        aria-autocomplete="list"
                                        dir="ltr"
                                        class="gsfi ytd-searchbox"
                                        style="border: none; padding: 0px; margin: 0px; height: auto; width: 100%; outline: none; font-size: 15px;"></div>
                                    <div id="search-clear-button" hidden="hidden" class="style-scope ytd-searchbox">
                                        <ytd-button-renderer
                                            use-keyboard-focused=""
                                            button-renderer="true"
                                            is-icon-button=""
                                            has-no-text=""
                                            class="style-scope ytd-searchbox style-default size-default">
                                            <a tabindex="-1" class="yt-simple-endpoint style-scope ytd-button-renderer">
                                                <yt-icon-button
                                                    id="button"
                                                    touch-feedback=""
                                                    class="style-scope ytd-button-renderer style-default size-default">
                                                    <button id="button" aria-label="검색어 삭제" class="style-scope yt-icon-button">
                                                        <yt-icon class="style-scope ytd-button-renderer">
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
                                                        </yt-icon>
                                                    </button>
                                                    <yt-interaction id="interaction" class="circular style-scope yt-icon-button">
                                                        <div class="stroke style-scope yt-interaction"></div>
                                                        <div class="fill style-scope yt-interaction"></div>
                                                    </yt-interaction>
                                                </yt-icon-button>
                                            </a>
                                        </ytd-button-renderer>
                                    </div>
                                </div>
                                <div slot="search-container" id="search-container" class="ytd-searchbox-spt"></div>
                            </form>
                            <button
                                id="search-icon-legacy"
                                aria-label="검색"
                                class="style-scope ytd-searchbox">
                                <yt-icon class="style-scope ytd-searchbox">
                                    <svg
                                        viewBox="0 0 24 24"
                                        preserveAspectRatio="xMidYMid meet"
                                        focusable="false"
                                        class="style-scope yt-icon"
                                        style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                        <g class="style-scope yt-icon">
                                            <path
                                                d="M20.87,20.17l-5.59-5.59C16.35,13.35,17,11.75,17,10c0-3.87-3.13-7-7-7s-7,3.13-7,7s3.13,7,7,7c1.75,0,3.35-0.65,4.58-1.71 l5.59,5.59L20.87,20.17z M10,16c-3.31,0-6-2.69-6-6s2.69-6,6-6s6,2.69,6,6S13.31,16,10,16z"
                                                class="style-scope yt-icon"></path>
                                        </g>
                                    </svg>
                                </yt-icon>
                                <tp-yt-paper-tooltip
                                    prefix=""
                                    role="tooltip"
                                    tabindex="-1"
                                    class="style-scope ytd-searchbox">
                                    <div id="tooltip" class="hidden style-scope tp-yt-paper-tooltip">
                                        검색
                                    </div>
                                </tp-yt-paper-tooltip>
                            </button>
                        </ytd-searchbox>
                        <yt-icon-button
                            id="search-button-narrow"
                            touch-feedback=""
                            class="style-scope ytd-masthead">
                            <button id="button" aria-label="검색" class="style-scope yt-icon-button">
                                <yt-icon
                                    icon="yt-icons:search"
                                    disable-upgrade=""
                                    class="topbar-icons style-scope ytd-masthead"></yt-icon>
                                <tp-yt-paper-tooltip
                                    for="search-button-narrow"
                                    disable-upgrade=""
                                    hidden=""
                                    class="style-scope ytd-masthead">
                                    검색
                                </tp-yt-paper-tooltip>
                            </button>
                            <yt-interaction id="interaction" class="circular style-scope yt-icon-button">
                                <div class="stroke style-scope yt-interaction"></div>
                                <div class="fill style-scope yt-interaction"></div>
                            </yt-interaction>
                        </yt-icon-button>
                    </div>
                    <div id="end" class="style-scope ytd-masthead">
                        <div slot="masthead-skeleton" id="masthead-skeleton-icons">
                            <div class="masthead-skeleton-icon"></div>
                            <div class="masthead-skeleton-icon"></div>
                            <div class="masthead-skeleton-icon"></div>
                            <div class="masthead-skeleton-icon"></div>
                        </div>
                        <div id="buttons" class="style-scope ytd-masthead">
                            <ytd-topbar-menu-button-renderer
                                use-keyboard-focused=""
                                is-icon-button=""
                                has-no-text=""
                                class="style-scope ytd-masthead style-default">
                                <dom-if class="style-scope ytd-topbar-menu-button-renderer"></dom-if>
                            </ytd-topbar-menu-button-renderer>
                            <ytd-topbar-menu-button-renderer
                                use-keyboard-focused=""
                                is-icon-button=""
                                has-no-text=""
                                class="style-scope ytd-masthead style-default">
                                <dom-if class="style-scope ytd-topbar-menu-button-renderer"></dom-if>
                            </ytd-topbar-menu-button-renderer>
                            <ytd-button-renderer
                                use-keyboard-focused=""
                                button-renderer="true"
                                is-paper-button-with-icon=""
                                is-paper-button=""
                                class="style-scope ytd-masthead style-suggestive size-small">
                                <a
                                    tabindex="-1"
                                    href="https://accounts.google.com/ServiceLogin?service=youtube&amp;uilel=3&amp;passive=true&amp;continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Dko%26next%3Dhttps%253A%252F%252Fwww.youtube.com%252F&amp;hl=ko&amp;ec=65620"
                                    class="yt-simple-endpoint style-scope ytd-button-renderer">
                                    <tp-yt-paper-button
                                        id="button"
                                        role="button"
                                        tabindex="0"
                                        animated=""
                                        elevation="0"
                                        aria-disabled="false"
                                        aria-label="로그인"
                                        class="style-scope ytd-button-renderer style-suggestive size-small">
                                        <yt-icon class="style-scope ytd-button-renderer">
                                            <svg
                                                viewBox="0 0 24 24"
                                                preserveAspectRatio="xMidYMid meet"
                                                focusable="false"
                                                class="style-scope yt-icon"
                                                style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                <g class="style-scope yt-icon">
                                                    <path
                                                        d="M12,2C6.48,2,2,6.48,2,12c0,5.52,4.48,10,10,10s10-4.48,10-10C22,6.48,17.52,2,12,2z M12,3c4.96,0,9,4.04,9,9 c0,1.42-0.34,2.76-0.93,3.96c-1.53-1.72-3.98-2.89-7.38-3.03C14.57,12.6,16,10.97,16,9c0-2.21-1.79-4-4-4C9.79,5,8,6.79,8,9 c0,1.97,1.43,3.6,3.31,3.93c-3.4,0.14-5.85,1.31-7.38,3.03C3.34,14.76,3,13.42,3,12C3,7.04,7.04,3,12,3z M9,9c0-1.65,1.35-3,3-3 s3,1.35,3,3c0,1.65-1.35,3-3,3S9,10.65,9,9z M12,21c-3.16,0-5.94-1.64-7.55-4.12C6.01,14.93,8.61,13.9,12,13.9 c3.39,0,5.99,1.03,7.55,2.98C17.94,19.36,15.16,21,12,21z"
                                                        class="style-scope yt-icon"></path>
                                                </g>
                                            </svg>
                                        </yt-icon>
                                        <yt-formatted-string
                                            id="text"
                                            class="style-scope ytd-button-renderer style-suggestive size-small">로그인</yt-formatted-string>
                                        <paper-ripple class="style-scope tp-yt-paper-button">
                                            <div id="background" class="style-scope paper-ripple"></div>
                                            <div id="waves" class="style-scope paper-ripple"></div>
                                        </paper-ripple>
                                    </tp-yt-paper-button>
                                </a>
                            </ytd-button-renderer>
                        </div>
                    </div>
                </div>
            </ytd-masthead>
        </div>
    </template>