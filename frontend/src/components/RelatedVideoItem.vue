<style lang="css" css-build-single="">
    @import "../../overall.css";
</style>


<template>
    <ytd-compact-video-renderer
        class="style-scope ytd-watch-next-secondary-results-renderer"
        thumbnail-width="168"
        lockup="true"
        style="position: relative;">
        <!--css-build:shady-->
        <div id="dismissible" class="style-scope ytd-compact-video-renderer">
            <ytd-thumbnail
                use-hovered-property=""
                class="style-scope ytd-compact-video-renderer">
                <!--css-build:shady-->
                <a
                    id="thumbnail"
                    class="yt-simple-endpoint inline-block style-scope ytd-thumbnail"
                    aria-hidden="true"
                    tabindex="-1"
                    rel="nofollow"
                    :href="infos.videoUrl">
                    <yt-img-shadow
                        ftl-eligible=""
                        class="style-scope ytd-thumbnail no-transition"
                        loaded=""
                        style="background-color: transparent;">
                        <!--css-build:shady-->
                        <img
                            id="img"
                            class="style-scope yt-img-shadow"
                            alt=""
                            width="168"
                            :src="infos.thumbnailUrl"/></yt-img-shadow>

                    <div id="overlays" class="style-scope ytd-thumbnail">
                        <ytd-thumbnail-overlay-time-status-renderer
                            class="style-scope ytd-thumbnail"
                            overlay-style="DEFAULT">
                            <!--css-build:shady-->
                            <yt-icon
                                class="style-scope ytd-thumbnail-overlay-time-status-renderer"
                                disable-upgrade=""
                                hidden=""></yt-icon>
                            <span
                                id="text"
                                class="style-scope ytd-thumbnail-overlay-time-status-renderer"
                                aria-label="11분 37초">
                                {{infos.videoLength}}
                            </span>
                        </ytd-thumbnail-overlay-time-status-renderer>
                        <ytd-thumbnail-overlay-now-playing-renderer class="style-scope ytd-thumbnail">
                            <!--css-build:shady-->
                            <span class="style-scope ytd-thumbnail-overlay-now-playing-renderer">지금 재생 중</span>
                            <ytd-thumbnail-overlay-equalizer
                                class="style-scope ytd-thumbnail-overlay-now-playing-renderer">
                                <!--css-build:shady-->
                                <svg
                                    xmlns="http://www.w3.org/2000/svg"
                                    id="equalizer"
                                    viewBox="0 0 55 95"
                                    class="style-scope ytd-thumbnail-overlay-equalizer">
                                    <g class="style-scope ytd-thumbnail-overlay-equalizer">
                                        <rect class="bar style-scope ytd-thumbnail-overlay-equalizer" x="0"></rect>
                                        <rect class="bar style-scope ytd-thumbnail-overlay-equalizer" x="20"></rect>
                                        <rect class="bar style-scope ytd-thumbnail-overlay-equalizer" x="40"></rect>
                                    </g>
                                </svg>
                            </ytd-thumbnail-overlay-equalizer>
                        </ytd-thumbnail-overlay-now-playing-renderer>
                    </div>
                    <div id="mouseover-overlay" class="style-scope ytd-thumbnail"></div>
                    <div id="hover-overlays" class="style-scope ytd-thumbnail"></div>
                </a>
            </ytd-thumbnail>
            <div class="details style-scope ytd-compact-video-renderer">
                <div class="metadata style-scope ytd-compact-video-renderer">
                    <a
                        class="yt-simple-endpoint style-scope ytd-compact-video-renderer"
                        rel="nofollow"
                        :href="infos.videoUrl">
                        <h3 class="style-scope ytd-compact-video-renderer">
                            <ytd-badge-supported-renderer
                                class="style-scope ytd-compact-video-renderer"
                                disable-upgrade=""
                                hidden=""></ytd-badge-supported-renderer>
                            <span
                                id="video-title"
                                class="style-scope ytd-compact-video-renderer"
                                aria-label="요리하는 닌자들? 게시자: 어린악어 11개월 전 11분 37초 조회수 552,349회"
                                title="요리하는 닌자들?">
                                {{infos.title}}
                            </span>
                        </h3>
                        <div class="secondary-metadata style-scope ytd-compact-video-renderer">
                            <ytd-video-meta-block
                                class="compact style-scope ytd-compact-video-renderer byline-separated"
                                no-endpoints="">
                                <!--css-build:shady-->
                                <div id="metadata" class="style-scope ytd-video-meta-block">
                                    <div id="byline-container" class="style-scope ytd-video-meta-block">
                                        <ytd-channel-name id="channel-name" class="style-scope ytd-video-meta-block">
                                            <!--css-build:shady-->
                                            <div id="container" class="style-scope ytd-channel-name">
                                                <div id="text-container" class="style-scope ytd-channel-name">
                                                    <yt-formatted-string
                                                        id="text"
                                                        title=""
                                                        class="style-scope ytd-channel-name"
                                                        ellipsis-truncate="">{{infos.userInfoDto.userName}}</yt-formatted-string>
                                                </div>
                                                <tp-yt-paper-tooltip
                                                    fit-to-visible-bounds=""
                                                    class="style-scope ytd-channel-name"
                                                    role="tooltip"
                                                    tabindex="-1">
                                                    <!--css-build:shady-->
                                                    <div id="tooltip" class="hidden style-scope tp-yt-paper-tooltip">

                                                        {{infos.userInfoDto.userName}}

                                                    </div>
                                                </tp-yt-paper-tooltip>
                                            </div>
                                            <ytd-badge-supported-renderer
                                                class="style-scope ytd-channel-name"
                                                disable-upgrade=""
                                                hidden=""></ytd-badge-supported-renderer>
                                        </ytd-channel-name>
                                        <div id="separator" class="style-scope ytd-video-meta-block">•</div>
                                    </div>
                                    <div id="metadata-line" class="style-scope ytd-video-meta-block">

                                        <span class="style-scope ytd-video-meta-block">조회수 {{infos.view}}</span>

                                        <span class="style-scope ytd-video-meta-block">{{infos.createdTime}} 전</span>
                                        <dom-repeat strip-whitespace="" class="style-scope ytd-video-meta-block">
                                            <template is="dom-repeat"></template>
                                        </dom-repeat>
                                    </div>
                                </div>

                            </ytd-video-meta-block>

                        </div>
                    </a>

                </div>

            </div>
        </div>

    </ytd-compact-video-renderer>
</template>

<script>
    export default {setup() {}, props: ['infos']}
</script>