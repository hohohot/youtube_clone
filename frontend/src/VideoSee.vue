<style lang="css" css-build-single="">
    @import "../overall.css";
</style>

<template>
    <ytd-app
        scrollbar-rework=""
        standardized-themed-scrollbar=""
        scrollbar-color="">
        <!--css-build:shady-->

        <div id="content" class="style-scope ytd-app">
            <TopView></TopView>
            <ytd-page-manager id="page-manager" class="style-scope ytd-app">
                <!--css-build:shady-->
                <ytd-watch-flexy
                    class="style-scope ytd-page-manager hide-skeleton"
                    js-panel-height_=""
                    flexy-enable-small-window-sizing=""
                    flexy-enable-large-window-sizing=""
                    flexy=""
                    is-four-three-to-sixteen-nine-video_=""
                    style="--ytd-watch-flexy-scrollbar-width:17px; --ytd-watch-flexy-space-below-player:136px; --ytd-watch-flexy-panel-max-height:360px; --ytd-watch-flexy-chat-max-height:360px; --ytd-watch-flexy-structured-description-max-height:360px; --ytd-watch-flexy-comments-panel-max-height:360px;"
                    video-id="toLDNN4FQv0"
                    role="main"
                    is-two-columns_=""
                    flexy-small-window_="">
                    <!--css-build:shady-->

                    <div id="columns" class="style-scope ytd-watch-flexy">
                        <div id="primary" class="style-scope ytd-watch-flexy">
                            <div id="primary-inner" class="style-scope ytd-watch-flexy">
                                <VideoPlayer></VideoPlayer>
                                <VideoInfos></VideoInfos>
                                <VideoMetas></VideoMetas>

                                <div id="ticket-shelf" class="style-scope ytd-watch-flexy"></div>
                                <VideoComments></VideoComments>
                            </div>
                        </div>

                        <div id="secondary" class="style-scope ytd-watch-flexy">
                            <div id="secondary-inner" class="style-scope ytd-watch-flexy">

                                <div id="related" class="style-scope ytd-watch-flexy">

                                    <ytd-watch-next-secondary-results-renderer
                                        class="style-scope ytd-watch-flexy"
                                        player-move-autonav-toggle=""
                                        style="--yt-img-shadow-placeholder-color:var(--yt-spec-10-percent-layer); --yt-img-shadow-min-height:100%; --yt-img-shadow-min-width:100%;"
                                        is-two-columns="">
                                        <!--css-build:shady-->
                                        <div id="items" class="style-scope ytd-watch-next-secondary-results-renderer">
                                            <ytd-continuation-item-renderer
                                                class="style-scope ytd-watch-next-secondary-results-renderer">
                                                <!--css-build:shady-->
                                                <div id="ghost-cards" class="style-scope ytd-continuation-item-renderer"></div>
                                                <tp-yt-paper-spinner
                                                    id="spinner"
                                                    class="style-scope ytd-continuation-item-renderer"
                                                    aria-hidden="true">
                                                    <!--css-build:shady-->
                                                    <div id="spinnerContainer" class="  style-scope tp-yt-paper-spinner">
                                                        <div class="spinner-layer layer-1 style-scope tp-yt-paper-spinner">
                                                            <div class="circle-clipper left style-scope tp-yt-paper-spinner">
                                                                <div class="circle style-scope tp-yt-paper-spinner"></div>
                                                            </div>
                                                            <div class="circle-clipper right style-scope tp-yt-paper-spinner">
                                                                <div class="circle style-scope tp-yt-paper-spinner"></div>
                                                            </div>
                                                        </div>
                                                        <div class="spinner-layer layer-2 style-scope tp-yt-paper-spinner">
                                                            <div class="circle-clipper left style-scope tp-yt-paper-spinner">
                                                                <div class="circle style-scope tp-yt-paper-spinner"></div>
                                                            </div>
                                                            <div class="circle-clipper right style-scope tp-yt-paper-spinner">
                                                                <div class="circle style-scope tp-yt-paper-spinner"></div>
                                                            </div>
                                                        </div>
                                                        <div class="spinner-layer layer-3 style-scope tp-yt-paper-spinner">
                                                            <div class="circle-clipper left style-scope tp-yt-paper-spinner">
                                                                <div class="circle style-scope tp-yt-paper-spinner"></div>
                                                            </div>
                                                            <div class="circle-clipper right style-scope tp-yt-paper-spinner">
                                                                <div class="circle style-scope tp-yt-paper-spinner"></div>
                                                            </div>
                                                        </div>
                                                        <div class="spinner-layer layer-4 style-scope tp-yt-paper-spinner">
                                                            <div class="circle-clipper left style-scope tp-yt-paper-spinner">
                                                                <div class="circle style-scope tp-yt-paper-spinner"></div>
                                                            </div>
                                                            <div class="circle-clipper right style-scope tp-yt-paper-spinner">
                                                                <div class="circle style-scope tp-yt-paper-spinner"></div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </tp-yt-paper-spinner>
                                                <div id="button" class="style-scope ytd-continuation-item-renderer" hidden="">
                                                    <ytd-button-renderer
                                                        class="style-suggestive size-default style-scope ytd-continuation-item-renderer"
                                                        use-keyboard-focused=""
                                                        button-renderer="true"
                                                        is-paper-button="">
                                                        <a class="yt-simple-endpoint style-scope ytd-button-renderer" tabindex="-1">
                                                            <tp-yt-paper-button
                                                                id="button"
                                                                class="style-scope ytd-button-renderer style-suggestive size-default"
                                                                role="button"
                                                                tabindex="0"
                                                                animated=""
                                                                elevation="0"
                                                                aria-disabled="false"
                                                                aria-label="더보기">
                                                                <!--css-build:shady-->
                                                                <yt-formatted-string
                                                                    id="text"
                                                                    class="style-scope ytd-button-renderer style-suggestive size-default">더보기</yt-formatted-string>
                                                            </tp-yt-paper-button>
                                                        </a>
                                                    </ytd-button-renderer>
                                                </div>
                                            </ytd-continuation-item-renderer>
                                        </div>

                                    </ytd-watch-next-secondary-results-renderer>

                                </div>
                            </div>
                        </div>
                    </div>

                </ytd-watch-flexy>
            </ytd-page-manager>
        </div>

    </ytd-app>
</template>

<script>
    import TopView from "./components/TopView.vue";
    import VideoComments from "./components/VideoComments.vue";
    import VideoInfos from "./components/VideoInfoss.vue";
    import VideoMetas from "./components/VideoMetas.vue";
    import VideoPlayer from "./components/VideoPlayer.vue";


    export default {
        name: "App",
        components: {
            TopView,
            VideoComments,
            VideoInfos,
            VideoMetas,
            VideoPlayer,
        }
    }
</script>