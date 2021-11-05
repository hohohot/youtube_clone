<style lang="css" css-build-single="">
    @import "../overall.css";
</style>

<style type="text/css">.gsok_a{background:url(data:image/gif;base64,R0lGODlhEwALAKECAAAAABISEv///////yH5BAEKAAIALAAAAAATAAsAAAIdDI6pZ+suQJyy0ocV3bbm33EcCArmiUYk1qxAUAAAOw==) no-repeat center;display:inline-block;height:11px;line-height:0;width:19px}.gsok_a img{border:none;visibility:hidden}.gsst_a{display:inline-block}.gsst_a{cursor:pointer;padding:0 4px}.gsst_a:hover{text-decoration:none!important}.gsst_b{font-size:16px;padding:0 2px;position:relative;user-select:none;-webkit-user-select:none;white-space:nowrap}.gsst_e{vertical-align:middle;opacity:0.6;}.gsst_a:hover .gsst_e,.gsst_a:focus .gsst_e{opacity:0.8;}.gsst_a:active .gsst_e{opacity:1;}.sbib_a{background:#fff;box-sizing:border-box;-webkit-box-sizing:border-box;}.sbib_b{box-sizing:border-box;-webkit-box-sizing:border-box;height:100%;overflow:hidden;padding:5px 9px 0}.sbib_c[dir=ltr]{float:right}.sbib_c[dir=rtl]{float:left}.sbib_d{box-sizing:border-box;-webkit-box-sizing:border-box;height:100%;unicode-bidi:embed;white-space:nowrap}.sbib_d[dir=ltr]{float:left}.sbib_d[dir=rtl]{float:right}.sbib_a,.sbib_c{vertical-align:top}.sbdd_a{z-index:989}.sbdd_a[dir=ltr] .fl, .sbdd_a[dir=rtl] .fr{float:left}.sbdd_a[dir=ltr] .fr, .sbdd_a[dir=rtl] .fl{float:right}.sbdd_b{background:#fff;border:1px solid #ccc;border-top-color:#d9d9d9;box-shadow:0 2px 4px rgba(0,0,0,0.2);-webkit-box-shadow:0 2px 4px rgba(0,0,0,0.2);cursor:default}.sbdd_c{border:0;display:block;position:absolute;top:0;z-index:988}.sbpqs_a{color:#52188c}.sbdd_a[dir=ltr] .sbpqs_a{padding-right:8px}.sbdd_a[dir=rtl] .sbpqs_a{padding-left:8px}.sbdd_a[dir=ltr] .sbpqs_b{padding-right:3px}.sbdd_a[dir=rtl] .sbpqs_b{padding-left:3px}.sbpqs_c{color:#666;line-height:22px}.gspr_a{padding-right:1px}.sbsb_c[dir=ltr] .sbqs_a{float:right}.sbsb_c[dir=rtl] .sbqs_a{float:left}.sbqs_b{visibility:hidden}.sbsb_d .sbqs_b{visibility:visible}.sbsb_c[dir=ltr] .sbqs_b{padding-left:5px;}.sbsb_c[dir=rtl] .sbqs_b{padding-right:5px;}.sbqs_c{word-wrap:break-word}.sbfl_a{font-size:12px;font-style:italic;color:#777;margin:-5px -18px -5px 0}.sbsb_c[dir=ltr] .sbfl_a{text-align:right}.sbsb_c[dir=rtl] .sbfl_a{text-align:left}.sbfl_a:hover{color:#333;cursor:pointer}.sbfl_b{background:rgba(255,255,255,.9)}.sbsb_a{background:#fff}.sbsb_b{list-style-type:none;margin:0;padding:0}.sbsb_c{line-height:22px;overflow:hidden;padding:0 10px}.sbsb_d{background:#eee}.sbsb_e{height:1px;background-color:#e5e5e5}#sbsb_f{font-size:11px;color:#36c;text-decoration:none}#sbsb_f:hover{font-size:11px;color:#36c;text-decoration:underline}.sbsb_g{text-align:center;padding:8px 0 7px;position:relative}.sbsb_h{font-size:15px;height:28px;margin:0.2em;-webkit-appearance:button}.sbsb_i{font-size:13px;color:#36c;text-decoration:none;line-height:100%}.sbsb_i:hover{text-decoration:underline}.sbsb_j{padding-top:1px 0 2px 0;font-size:11px}.sbdd_a[dir=ltr] .sbsb_j{padding-right:4px;text-align:right}.sbdd_a[dir=rtl] .sbsb_j{padding-left:4px;text-align:left}.sbsb_c{padding:4px 24px 4px 10px}.sbsb_a{padding: 16px 0 0}.sbdd_b{border-top: 0}.sbib_a{background:transparent}.sbib_b{padding: 0}.gsfs{font-size:1.6rem;color:#222}.sbqs_c b{font-weight:500}.sbdd_c{z-index:2010}.sbdd_a{z-index:2021}.sbib_a{background:transparent; width: 100%; flex: 1;}ytd-masthead[dark] .gsst_e{filter: invert(100%)}</style>

<template system-icons="">
    <div>
        <ModalView v-if="seeModal" @close-modal="seeModal = false" position="absolute">
            <Content msg="Hello Vue in CodeSandbox!"/>
        </ModalView>
        <ytd-app
            scrollbar-rework=""
            standardized-themed-scrollbar=""
            scrollbar-color=""
            guide-persistent-and-visible="">
            <!--css-build:shady-->
            <yt-history-manager id="historyManager" class="style-scope ytd-app"></yt-history-manager>
            <div id="content" class="style-scope ytd-app" position="relative">
                <TopView v-bind:seeModal="uploadButtonClick"></TopView>

                <SideDrawer z-index="99" posision="absolute"></SideDrawer>

                <ytd-page-manager d="page-manager" class="style-scope ytd-app">
                    <!--css-build:shady-->
                    <ytd-browse
                        class="style-scope ytd-page-manager"
                        responsive-playlist=""
                        page-subtype="home"
                        role="main"
                        guide-persistent-and-visible="">
                        <!--css-build:shady-->

                        <ytd-two-column-browse-results-renderer
                            class="style-scope ytd-browse grid grid-disabled"
                            page-subtype="home"
                            disable-grid-state-aware="">
                            <!--css-build:shady-->
                            <div id="primary" class="style-scope ytd-two-column-browse-results-renderer">
                                <ytd-rich-grid-renderer
                                    class="style-scope ytd-two-column-browse-results-renderer"
                                    style="--ytd-rich-grid-items-per-row:4; --ytd-rich-grid-posts-per-row:4; --ytd-rich-grid-slim-items-per-row:9;">
                                    <!--css-build:shady-->
                                    <div id="header" class="style-scope ytd-rich-grid-renderer">
                                        <ytd-feed-filter-chip-bar-renderer
                                            class="style-scope ytd-rich-grid-renderer"
                                            at-start=""
                                            style="--ytd-rich-grid-chips-bar-width:1664px; --ytd-rich-grid-chips-bar-top:56px;"
                                            at-end="">
                                            <!--css-build:shady-->
                                            <div id="chips-wrapper" class="style-scope ytd-feed-filter-chip-bar-renderer">
                                                <div id="left-arrow" class="style-scope ytd-feed-filter-chip-bar-renderer">
                                                    <div
                                                        id="left-arrow-button"
                                                        class="style-scope ytd-feed-filter-chip-bar-renderer">
                                                        <ytd-button-renderer
                                                            class="style-scope ytd-feed-filter-chip-bar-renderer style-default size-default"
                                                            use-keyboard-focused=""
                                                            button-renderer="true"
                                                            is-icon-button=""
                                                            has-no-text="">
                                                            <a class="yt-simple-endpoint style-scope ytd-button-renderer" tabindex="-1">
                                                                <yt-icon-button
                                                                    id="button"
                                                                    class="style-scope ytd-button-renderer style-default size-default"
                                                                    touch-feedback="">
                                                                    <!--css-build:shady-->
                                                                    <button id="button" class="style-scope yt-icon-button" aria-label="이전">
                                                                        <yt-icon class="style-scope ytd-button-renderer">
                                                                            <svg
                                                                                viewBox="0 0 16 16"
                                                                                preserveAspectRatio="xMidYMid meet"
                                                                                focusable="false"
                                                                                class="style-scope yt-icon"
                                                                                style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                                                <g mirror-in-rtl="" class="style-scope yt-icon">
                                                                                    <path
                                                                                        d="M10.15,13.35L4.79,8l5.35-5.35l0.71,0.71L6.21,8l4.65,4.65L10.15,13.35z"
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
                                                    </div>
                                                </div>
                                                <div
                                                    id="scroll-container"
                                                    class="style-scope ytd-feed-filter-chip-bar-renderer"
                                                    style="touch-action: pan-y;">
                                                    <iron-selector
                                                        id="chips"
                                                        activate-event=""
                                                        role="tablist"
                                                        selected-attribute="selected"
                                                        class="style-scope ytd-feed-filter-chip-bar-renderer"
                                                        style="transform: translateX(0px);">
                                                        <yt-chip-cloud-chip-renderer
                                                            class="style-scope ytd-feed-filter-chip-bar-renderer iron-selected"
                                                            aria-selected="true"
                                                            role="tab"
                                                            tabindex="0"
                                                            chip-style="STYLE_HOME_FILTER"
                                                            selected="">
                                                            <!--css-build:shady-->
                                                            <yt-formatted-string
                                                                id="text"
                                                                ellipsis-truncate=""
                                                                class="style-scope yt-chip-cloud-chip-renderer"
                                                                title="전체">전체</yt-formatted-string>
                                                        </yt-chip-cloud-chip-renderer>
                                                    </iron-selector>
                                                </div>
                                                <div id="right-arrow" class="style-scope ytd-feed-filter-chip-bar-renderer">
                                                    <div
                                                        id="right-arrow-button"
                                                        class="style-scope ytd-feed-filter-chip-bar-renderer">
                                                        <ytd-button-renderer
                                                            class="style-scope ytd-feed-filter-chip-bar-renderer style-default size-default"
                                                            use-keyboard-focused=""
                                                            button-renderer="true"
                                                            is-icon-button=""
                                                            has-no-text="">
                                                            <a class="yt-simple-endpoint style-scope ytd-button-renderer" tabindex="-1">
                                                                <yt-icon-button
                                                                    id="button"
                                                                    class="style-scope ytd-button-renderer style-default size-default"
                                                                    touch-feedback="">
                                                                    <!--css-build:shady-->
                                                                    <button id="button" class="style-scope yt-icon-button" aria-label="다음">
                                                                        <yt-icon class="style-scope ytd-button-renderer">
                                                                            <svg
                                                                                viewBox="0 0 16 16"
                                                                                preserveAspectRatio="xMidYMid meet"
                                                                                focusable="false"
                                                                                class="style-scope yt-icon"
                                                                                style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                                                <g mirror-in-rtl="" class="style-scope yt-icon">
                                                                                    <path
                                                                                        d="M4.97,12.65L9.62,8L4.97,3.35l0.71-0.71L11.03,8l-5.35,5.35L4.97,12.65z"
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
                                                    </div>
                                                </div>
                                            </div>
                                        </ytd-feed-filter-chip-bar-renderer>
                                    </div>
                                    <div id="big-yoodle" class="style-scope ytd-rich-grid-renderer"></div>
                                    <div id="masthead-ad" class="style-scope ytd-rich-grid-renderer"></div>

                                    <div id="contents" class="style-scope ytd-rich-grid-renderer">
                                        <VideoItem v-for="(item, index) in videoItemList" :key="index" :infos="item"/>
                                    </div>

                                </ytd-rich-grid-renderer>
                            </div>
                            <div id="secondary" class="style-scope ytd-two-column-browse-results-renderer"></div>
                        </ytd-two-column-browse-results-renderer>

                    </ytd-browse>
                </ytd-page-manager>
            </div>

        </ytd-app>
        
    </div>

</template>

<script>
    import TopView from "./components/TopView";
    import SideDrawer from "./components/SideDrawer";
    import VideoItem from "./components/VideoItem";
    import ModalView from "./components/ModalView.vue"
    import Content from "./components/UploadModal.vue"
    import axios from "axios"
    import 'url-search-params-polyfill'

    export default {
        name: "Main",
        components: {
            'TopView': TopView,
            'SideDrawer': SideDrawer,
            'VideoItem': VideoItem,
            'Content': Content,
            'ModalView': ModalView
        },
        data() {
            return {seeModal: false, videoItemList: []}
        },
        methods: {
            uploadButtonClick() {
                console.log(this.seeModal);
                this.seeModal = true;
                console.log(this.seeModal);
            },
            numToView(num) {
                var ret;
                if (num < 1000) {
                    ret = num + "회";
                } else if (num < 10000) {
                    ret = (num / 1000).toFixed(1) + "천회";
                } else {
                    ret = (num / 10000).toFixed(1) + "만회";
                }
                return ret;
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
                    ret = (gap / 3600 / 24 / 7).toFixed(0) + "주";
                } else if (gap < 3600 * 24 * 365) {
                    ret = (gap / 3600 / 24 / 30).toFixed(0) + "개월";
                } else {
                    ret = (gap / 3600 / 24 / 365).toFixed(0) + "년";
                }
                return ret;
            }
        },
        created() {
            if(this.$route.query.search != null){
                console.log(this.$route.query.search);
                axios
                .get(`/recommending_videos/0/9`, {params:{keyword:this.$route.query.search}})
                .then(response => {
                    for (var i = 0; i < response.data.length; i++) {
                        console.log(response.data);
                        response
                            .data[i]
                            .view = this.numToView(response.data[i].view);
                        response
                            .data[i]
                            .createdTime = this.strToDate(response.data[i].createdTime);
                        response
                            .data[i]
                            .videoLength = String((response.data[i].videoLength / 60).toFixed(0)).padStart(
                                2,
                                "0"
                            ) + ":" + String(response.data[i].videoLength % 60).padStart(2, "0");
                        console.log(response.data);
                    }
                    this.videoItemList = this
                        .videoItemList
                        .concat(response.data);
                    console.log(this.videoItemList);
                });
            }else{
                axios
                .get("/recommending_videos/0/9")
                .then(response => {
                    for (var i = 0; i < response.data.length; i++) {
                        console.log(response.data);
                        response
                            .data[i]
                            .view = this.numToView(response.data[i].view);
                        response
                            .data[i]
                            .createdTime = this.strToDate(response.data[i].createdTime);
                        response
                            .data[i]
                            .videoLength = String((response.data[i].videoLength / 60).toFixed(0)).padStart(
                                2,
                                "0"
                            ) + ":" + String(response.data[i].videoLength % 60).padStart(2, "0");
                        console.log(response.data);
                    }
                    this.videoItemList = this
                        .videoItemList
                        .concat(response.data);
                    console.log(this.videoItemList);
                });
            }
            
        }
    }
</script>