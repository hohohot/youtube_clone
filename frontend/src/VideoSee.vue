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
                                <VideoInfos :videoInfoDatas="videoInfoDatas"></VideoInfos>
                                <VideoMetas :videoMetaDatas="videoMetaDatas"></VideoMetas>

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
                                            <RelatedVideoItem v-for="(item,index) in videoItemList" :key="index" :infos="item"/>
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
    import RelatedVideoItem from "./components/RelatedVideoItem.vue"
    import axios from "axios";

    export default {
        name: "App",
        components: {
            TopView,
            VideoComments,
            VideoInfos,
            VideoMetas,
            VideoPlayer,
            RelatedVideoItem
        },
        data() {
            return {
                videoInfoDatas: {
                    title: "title",
                    likes: 0,
                    views: 0,
                    isLiked: true,
                    createdDate: "asdas"
                },
                videoMetaDatas: {
                    userInfoDto: {
                        profileUrl: "a",
                        userName: "a",
                        email: "a"
                    },
                    isSubs: false,
                    description: "a"
                },
                videoItemList: [
                ]
            }
        },
        created() {
            console.log(this.videoInfoDatas);
            axios
                .get("/videoinfos/" + this.$route.query.id)
                .then(response => {
                    this.videoInfoDatas = {
                        title: response.data.title,
                        likes: response.data.likes,
                        views: response.data.views,
                        isLiked: response.data.isLiked,
                        createdDate: String(response.data.createdDate).substring(0, 10)
                    };
                    console.log(this.videoInfoDatas);
                    this.videoMetaDatas = {
                        userInfoDto: response.data.userInfoDto,
                        description: response.data.description,
                        isSubs: response.data.isSubs
                    };
                    console.log(this.videoMetaDatas);
                });

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
        }
    }
</script>