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
                            href="/"
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
                                        </g>
                                        <text
                                            x="30"
                                            y="17"
                                            style="font-family:verdana; font-size:15pt; fill:black; letter-spacing:-3.1pt; font-weight:600;">MyTube</text>
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
                        <form id="search-form" action="/" class="style-scope ytd-searchbox">
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
                                        @blur="blurEvent"
                                        @focus="focusEvent"
                                        @input="keywordInput"
                                        id="search"
                                        autocapitalize="none"
                                        autocomplete="off"
                                        autocorrect="off"
                                        name="search"
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
                                        style="border: none; padding: 0px; margin: 0px; height: auto; width: 100%; outline: none; font-size: 15px;"/></div>
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
                        <RecommendedSearchList v-show="isFocused" :recomdendList="recomdendList"/>
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
                        <div v-if="userInfo===null">
                            <ytd-button-renderer
                                use-keyboard-focused=""
                                button-renderer="true"
                                is-paper-button-with-icon=""
                                is-paper-button=""
                                class="style-scope ytd-masthead style-suggestive size-small">
                                <a
                                    tabindex="-1"
                                    href="/oauth2/authorization/google"
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
                        <ytd-topbar-menu-button-renderer
                            v-if="userInfo!==null"
                            class="style-scope ytd-masthead style-default"
                            use-keyboard-focused=""
                            is-icon-button=""
                            has-no-text="">
                            <!--css-build:shady-->
                            <dom-if class="style-scope ytd-topbar-menu-button-renderer">
                                <template is="dom-if"></template>
                            </dom-if>
                            <div id="button" class="style-scope ytd-topbar-menu-button-renderer">
                                <a
                                    class="yt-simple-endpoint style-scope ytd-topbar-menu-button-renderer"
                                    tabindex="-1">
                                    <yt-icon-button
                                        id="button"
                                        class="style-scope ytd-topbar-menu-button-renderer style-default"
                                        touch-feedback="">
                                        <!--css-build:shady-->
                                        <button
                                            @click="seeModal"
                                            id="button"
                                            class="style-scope yt-icon-button"
                                            aria-label="만들기">
                                            <yt-icon class="style-scope ytd-topbar-menu-button-renderer">
                                                <svg
                                                    viewBox="0 0 24 24"
                                                    preserveAspectRatio="xMidYMid meet"
                                                    focusable="false"
                                                    class="style-scope yt-icon"
                                                    style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                    <g class="style-scope yt-icon">
                                                        <path
                                                            d="M14,13h-3v3H9v-3H6v-2h3V8h2v3h3V13z M17,6H3v12h14v-6.39l4,1.83V8.56l-4,1.83V6 M18,5v3.83L22,7v8l-4-1.83V19H2V5H18L18,5 z"
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
                            </div>
                        </ytd-topbar-menu-button-renderer>

                        <ytd-topbar-menu-button-renderer
                            v-if="userInfo!==null"
                            class="style-scope ytd-masthead"
                            use-keyboard-focused="">
                            <!--css-build:shady-->
                            <button
                                id="avatar-btn"
                                aria-haspopup="true"
                                class="style-scope ytd-topbar-menu-button-renderer"
                                aria-label="대체 계정 목록을 여는 계정 프로필 사진">
                                <yt-img-shadow
                                    height="32"
                                    width="32"
                                    class="style-scope ytd-topbar-menu-button-renderer no-transition"
                                    loaded=""
                                    style="background-color: transparent;">
                                    <!--css-build:shady-->
                                    <img
                                        id="img"
                                        class="style-scope yt-img-shadow"
                                        alt="아바타 이미지"
                                        height="32"
                                        width="32"
                                        v-bind:src="profile"/></yt-img-shadow>
                            </button>
                            <dom-if class="style-scope ytd-topbar-menu-button-renderer">
                                <template is="dom-if"></template>
                            </dom-if>
                            <div id="button" class="style-scope ytd-topbar-menu-button-renderer"></div>
                        </ytd-topbar-menu-button-renderer>
                    </div>
                </div>
            </div>
        </ytd-masthead>

    </div>
</template>

<script>
    import axios from 'axios'
    import RecommendedSearchList from './RecommendedSearchList.vue'
    export default {
        components: {
            'RecommendedSearchList': RecommendedSearchList
        },
        methods: {
            focusEvent() {
                this.isFocused = true;
                console.log("focus!!!");
            },
            blurEvent() {
                this.isFocused = false;
                console.log("blur!!!");
            },
            updateKewordList(target) {
                axios
                    .get('/recommended_keywords', {
                        params: {
                            prefix: target
                        }
                    })
                    .then(response => {
                        this.recomdendList = response.data;
                    });
            },
            keywordInput(e) {
                if (e.target.value != undefined) {
                    this.updateKewordList(e.target.value);
                }
            }
        },
        created() {
            this.updateKewordList("");
            axios
                .get('/userInfo')
                .then(response => {
                    this.userInfo = response;
                    this.profile = response.data.profileUrl;
                    console.log(this.userInfo);
                });
            this.search_keyword = this.$route.query.search;
        },
        data() {
            return {userInfo: null, profile: null, isFocused: false, search_keyword: this.$route.query.search, recomdendList: []};
        },
        props: ['seeModal']
    }
</script>