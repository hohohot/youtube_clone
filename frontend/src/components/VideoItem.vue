<style lang="css" css-build-single="">
    @import "../../overall.css";
</style>

<template>
    <ytd-rich-item-renderer class="style-scope ytd-rich-grid-renderer">
        <!--css-build:shady-->
        <div id="content" class="style-scope ytd-rich-item-renderer">
            <ytd-rich-grid-media
                class="style-scope ytd-rich-item-renderer"
                three-dot-rework=""
                lockup="true"
                style="position: relative;">
                <!--css-build:shady-->
                <div id="dismissible" class="style-scope ytd-rich-grid-media">
                    <ytd-thumbnail
                        rich-grid-thumbnail=""
                        width="9999"
                        class="style-scope ytd-rich-grid-media">
                        <!--css-build:shady-->
                        <a
                            id="thumbnail"
                            class="yt-simple-endpoint inline-block style-scope ytd-thumbnail"
                            aria-hidden="true"
                            tabindex="-1"
                            rel="null"
                            :href="infos.videoUrl">
                            <yt-img-shadow
                                ftl-eligible=""
                                class="style-scope ytd-thumbnail no-transition"
                                style="background-color: transparent;"
                                loaded="">
                                <!--css-build:shady-->
                                <img
                                    id="img"
                                    class="style-scope yt-img-shadow"
                                    alt=""
                                    width="9999"
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
                                        aria-label="19분 10초">
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
                    <div id="thumbnail-underlay" class="style-scope ytd-rich-grid-media" hidden=""></div>
                    <div id="details" class="style-scope ytd-rich-grid-media">
                        <a
                            id="avatar-link"
                            class="yt-simple-endpoint style-scope ytd-rich-grid-media"
                            tabindex="-1"
                            title="아구 TV"
                            href="https://www.youtube.com/c/%EC%95%84%EA%B5%ACTV">
                            <yt-img-shadow
                                id="avatar"
                                width="48"
                                class="style-scope ytd-rich-grid-media no-transition"
                                style="background-color: transparent;"
                                loaded="">
                                <!--css-build:shady-->
                                <img
                                    id="img"
                                    class="style-scope yt-img-shadow"
                                    alt=""
                                    width="48"
                                    :src="infos.userInfoDto.profileUrl"/></yt-img-shadow>
                        </a>
                        <div id="meta" class="style-scope ytd-rich-grid-media">
                            <h3 class="style-scope ytd-rich-grid-media">
                                <ytd-badge-supported-renderer
                                    class="title-badge style-scope ytd-rich-grid-media"
                                    disable-upgrade=""
                                    hidden=""></ytd-badge-supported-renderer>
                                <a
                                    id="video-title-link"
                                    class="yt-simple-endpoint style-scope ytd-rich-grid-media"
                                    aria-label="레이스 마저 쎄지는 '미사일 만능 주의' ㅋㅋㅋ - [랜능크 : 하제] 게시자: 아구 TV 1시간 전 19분 조회수 6,670회"
                                    title="레이스 마저 쎄지는 '미사일 만능 주의' ㅋㅋㅋ - [랜능크 : 하제]"
                                    :href="infos.videoUrl">
                                    <yt-formatted-string
                                        id="video-title"
                                        class="style-scope ytd-rich-grid-media"
                                        aria-label="레이스 마저 쎄지는 '미사일 만능 주의' ㅋㅋㅋ - [랜능크 : 하제] 게시자: 아구 TV 1시간 전 19분 조회수 6,670회">{{infos.title}}</yt-formatted-string>
                                </a>
                            </h3>
                            <div class="byline style-scope ytd-rich-grid-media">
                                <ytd-badge-supported-renderer
                                    class="ad-badge style-scope ytd-rich-grid-media"
                                    system-icons=""
                                    hidden="">
                                    <!--css-build:shady-->
                                    <dom-repeat
                                        id="repeat"
                                        as="badge"
                                        class="style-scope ytd-badge-supported-renderer">
                                        <template></template>
                                    </dom-repeat>
                                </ytd-badge-supported-renderer>
                                <ytd-video-meta-block rich-meta="" class="grid style-scope ytd-rich-grid-media">
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
                                                            class="style-scope ytd-channel-name complex-string"
                                                            ellipsis-truncate=""
                                                            has-link-only_="">
                                                            <a
                                                                class="yt-simple-endpoint style-scope yt-formatted-string"
                                                                spellcheck="false"
                                                                :href="infos.videoUrl"
                                                                dir="auto">{{infos.userInfoDto.userName}}</a>
                                                        </yt-formatted-string>
                                                    </div>
                                                    <tp-yt-paper-tooltip
                                                        fit-to-visible-bounds=""
                                                        class="style-scope ytd-channel-name"
                                                        role="tooltip"
                                                        tabindex="-1">
                                                        <!--css-build:shady-->
                                                        <div id="tooltip" class="hidden style-scope tp-yt-paper-tooltip">

                                                            아구 TV

                                                        </div>
                                                    </tp-yt-paper-tooltip>
                                                </div>
                                                <ytd-badge-supported-renderer
                                                    class="style-scope ytd-channel-name"
                                                    system-icons="">
                                                    <!--css-build:shady-->
                                                    <div
                                                        class="badge badge-style-type-verified style-scope ytd-badge-supported-renderer"
                                                        aria-label="인증됨">
                                                        <yt-icon class="style-scope ytd-badge-supported-renderer">
                                                            <svg
                                                                viewBox="0 0 24 24"
                                                                preserveAspectRatio="xMidYMid meet"
                                                                focusable="false"
                                                                class="style-scope yt-icon"
                                                                style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                                <g class="style-scope yt-icon">
                                                                    <path
                                                                        d="M12,2C6.5,2,2,6.5,2,12c0,5.5,4.5,10,10,10s10-4.5,10-10C22,6.5,17.5,2,12,2z M9.8,17.3l-4.2-4.1L7,11.8l2.8,2.7L17,7.4 l1.4,1.4L9.8,17.3z"
                                                                        class="style-scope yt-icon"></path>
                                                                </g>
                                                            </svg>
                                                            <!--css-build:shady-->
                                                        </yt-icon>
                                                        <span class="style-scope ytd-badge-supported-renderer"></span>
                                                        <tp-yt-paper-tooltip
                                                            position="top"
                                                            class="style-scope ytd-badge-supported-renderer"
                                                            role="tooltip"
                                                            tabindex="-1">
                                                            <!--css-build:shady-->
                                                            <div id="tooltip" class="hidden style-scope tp-yt-paper-tooltip">
                                                                인증됨
                                                            </div>
                                                        </tp-yt-paper-tooltip>
                                                    </div>
                                                    <dom-repeat
                                                        id="repeat"
                                                        as="badge"
                                                        class="style-scope ytd-badge-supported-renderer">
                                                        <template></template>
                                                    </dom-repeat>
                                                </ytd-badge-supported-renderer>
                                            </ytd-channel-name>
                                            <div id="separator" class="style-scope ytd-video-meta-block">•</div>
                                        </div>
                                        <div id="metadata-line" class="style-scope ytd-video-meta-block">

                                            <span class="style-scope ytd-video-meta-block">조회수 {{infos.view}}</span>

                                            <span class="style-scope ytd-video-meta-block">{{infos.createdTime}} 전</span>
                                            <dom-repeat strip-whitespace="" class="style-scope ytd-video-meta-block">
                                                <template></template>
                                            </dom-repeat>
                                        </div>
                                    </div>
                                    <div id="additional-metadata-line" class="style-scope ytd-video-meta-block">
                                        <dom-repeat class="style-scope ytd-video-meta-block">
                                            <template></template>
                                        </dom-repeat>
                                    </div>

                                </ytd-video-meta-block>
                            </div>
                            <div
                                class="metadata-snippet-container style-scope ytd-rich-grid-media"
                                hidden="">
                                <yt-formatted-string
                                    class="description-snippet style-scope ytd-rich-grid-media">[아구
                                    TV] 트위치 ▷ https://www.twitch.tv/agu_tv [아구 TV] 구독하기 ▷ https://goo.gl/du8umg ㄹㅇ
                                    빡쎗다 후... #스타 #유즈맵 #랜능크</yt-formatted-string>
                            </div>
                            <div class="style-scope ytd-rich-grid-media" hidden="">
                                <ul class="playlist-video-list style-scope ytd-rich-grid-media">
                                    <dom-repeat as="video" class="style-scope ytd-rich-grid-media">
                                        <template></template>
                                    </dom-repeat>
                                </ul>
                                <yt-formatted-string
                                    class="view-more-link style-scope ytd-rich-grid-media"
                                    hidden="">
                                    <!--css-build:shady-->
                                </yt-formatted-string>
                            </div>
                            <ytd-badge-supported-renderer
                                class="video-badge style-scope ytd-rich-grid-media"
                                disable-upgrade=""
                                hidden=""></ytd-badge-supported-renderer>
                            <div id="buttons" class="style-scope ytd-rich-grid-media"></div>
                        </div>
                        <div id="menu" class="style-scope ytd-rich-grid-media">
                            <ytd-menu-renderer class="style-scope ytd-rich-grid-media">
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
                </div>
                <div id="dismissed" class="style-scope ytd-rich-grid-media">
                    <div id="dismissed-content" class="style-scope ytd-rich-grid-media"></div>
                </div>
                <yt-interaction class="extended">
                    <!--css-build:shady-->
                    <div class="stroke style-scope yt-interaction"></div>
                    <div class="fill style-scope yt-interaction"></div>
                </yt-interaction>
            </ytd-rich-grid-media>
        </div>
    </ytd-rich-item-renderer>

</template>
<script>
import Vue from 'vue';
    export default {
    setup() {},
    props: ['infos'],
    created() {
        let vm = this;
        Vue.$nextTick(function(){
            console.log(vm.infos);
            console.log(vm.infos.userInfoDto);
            console.log(vm.$infos);
        });
        
    }
}
</script>