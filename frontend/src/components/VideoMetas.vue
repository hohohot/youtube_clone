<style lang="css" css-build-single="">
    @import "../../overall.css";
</style>

<template>
    <div id="meta" class="style-scope ytd-watch-flexy">
        <div id="meta-skeleton" class="watch-skeleton style-scope ytd-watch-flexy">
            <div id="secondary-info" class="skeleton-light-border-bottom">
                <div id="top-row">
                    <div id="video-owner" class="flex-1">
                        <div id="channel-icon" class="skeleton-bg-color"></div>
                        <div id="upload-info" class="flex-1">
                            <div id="owner-name" class="text-shell skeleton-bg-color"></div>
                            <div id="published-date" class="text-shell skeleton-bg-color"></div>
                        </div>
                    </div>
                    <div id="subscribe-button" class="skeleton-bg-color"></div>
                </div>
            </div>
        </div>
        <div id="meta-contents" class="style-scope ytd-watch-flexy">
            <ytd-video-secondary-info-renderer class="style-scope ytd-watch-flexy">
                <!--css-build:shady-->
                <div id="container" class="style-scope ytd-video-secondary-info-renderer">
                    <div id="top-row" class="style-scope ytd-video-secondary-info-renderer">
                        <ytd-video-owner-renderer class="style-scope ytd-video-secondary-info-renderer">
                            <!--css-build:shady-->
                            <a
                                class="yt-simple-endpoint style-scope ytd-video-owner-renderer"
                                tabindex="-1"
                                href="/channel/UCeyUnRL6sG_GQJRus89sZ8Q">
                                <yt-img-shadow
                                    id="avatar"
                                    class="style-scope ytd-video-owner-renderer no-transition"
                                    loaded=""
                                    style="background-color: transparent;">
                                    <!--css-build:shady-->
                                    <img
                                        id="img"
                                        class="style-scope yt-img-shadow"
                                        alt=""
                                        width="48"
                                        :src="videoMetaDatas.userInfoDto.profileUrl"/></yt-img-shadow>
                            </a>
                            <div id="upload-info" class="style-scope ytd-video-owner-renderer">
                                <ytd-channel-name
                                    id="channel-name"
                                    class="style-scope ytd-video-owner-renderer">
                                    <!--css-build:shady-->
                                    <div id="container" class="style-scope ytd-channel-name">
                                        <div id="text-container" class="style-scope ytd-channel-name">
                                            <yt-formatted-string
                                                id="text"
                                                title=""
                                                class="style-scope ytd-channel-name"
                                                has-link-only_="">
                                                <a
                                                    class="yt-simple-endpoint style-scope yt-formatted-string"
                                                    spellcheck="false"
                                                    href="/channel/UCeyUnRL6sG_GQJRus89sZ8Q"
                                                    dir="auto">{{videoMetaDatas.userInfoDto.userName}}</a>
                                            </yt-formatted-string>
                                        </div>
                                        <tp-yt-paper-tooltip
                                            fit-to-visible-bounds=""
                                            class="style-scope ytd-channel-name"
                                            role="tooltip"
                                            tabindex="-1">
                                            <!--css-build:shady-->
                                            <div id="tooltip" class="hidden style-scope tp-yt-paper-tooltip">

                                                개발자의품격

                                            </div>
                                        </tp-yt-paper-tooltip>
                                    </div>
                                    <ytd-badge-supported-renderer
                                        class="style-scope ytd-channel-name"
                                        disable-upgrade=""
                                        hidden=""></ytd-badge-supported-renderer>
                                </ytd-channel-name>
                                <yt-formatted-string
                                    id="owner-sub-count"
                                    class="style-scope ytd-video-owner-renderer"
                                    aria-label="구독자 9.13천명">구독자 9.13천명</yt-formatted-string>
                                <span class="date style-scope ytd-video-secondary-info-renderer" slot="date"></span>
                            </div>
                            <div
                                id="purchase-button"
                                class="style-scope ytd-video-owner-renderer"
                                hidden=""></div>
                            <div id="sponsor-button" class="style-scope ytd-video-owner-renderer"></div>
                            <div id="analytics-button" class="style-scope ytd-video-owner-renderer"></div>
                        </ytd-video-owner-renderer>
                        <div
                            id="subscribe-button"
                            class="style-scope ytd-video-secondary-info-renderer">
                            <ytd-subscribe-button-renderer
                                class="style-scope ytd-video-secondary-info-renderer"
                                use-keyboard-focused="">
                                <!--css-build:shady-->
                                <tp-yt-paper-button
                                    noink=""
                                    class="style-scope ytd-subscribe-button-renderer"
                                    role="button"
                                    tabindex="0"
                                    animated=""
                                    elevation="0"
                                    aria-disabled="false"
                                    aria-label="개발자의품격을(를) 구독합니다.">
                                    <!--css-build:shady-->
                                    <yt-formatted-string class="style-scope ytd-subscribe-button-renderer">구독</yt-formatted-string>
                                </tp-yt-paper-button>
                                <div
                                    id="notification-preference-toggle-button"
                                    class="style-scope ytd-subscribe-button-renderer"
                                    hidden=""></div>
                                <div
                                    id="notification-preference-button"
                                    class="style-scope ytd-subscribe-button-renderer"
                                    hidden="">
                                    <ytd-subscription-notification-toggle-button-renderer
                                        class="style-scope ytd-subscribe-button-renderer style-text size-default"
                                        use-keyboard-focused=""
                                        button-renderer="true"
                                        is-icon-button=""
                                        has-no-text="">
                                        <a
                                            class="yt-simple-endpoint style-scope ytd-subscription-notification-toggle-button-renderer"
                                            tabindex="-1">
                                            <yt-icon-button
                                                id="button"
                                                class="style-scope ytd-subscription-notification-toggle-button-renderer style-text size-default"
                                                touch-feedback="">
                                                <!--css-build:shady-->
                                                <button
                                                    id="button"
                                                    class="style-scope yt-icon-button"
                                                    aria-label="현재 설정은 맞춤설정 알림 수신입니다. 개발자의품격 채널의 알림 설정을 변경하려면 탭하세요.">
                                                    <yt-icon
                                                        class="style-scope ytd-subscription-notification-toggle-button-renderer">
                                                        <svg
                                                            viewBox="0 0 24 24"
                                                            preserveAspectRatio="xMidYMid meet"
                                                            focusable="false"
                                                            class="style-scope yt-icon"
                                                            style="pointer-events: none; display: block; width: 100%; height: 100%;">
                                                            <g class="style-scope yt-icon">
                                                                <path
                                                                    d="M10,20h4c0,1.1-0.9,2-2,2S10,21.1,10,20z M20,17.35V19H4v-1.65l2-1.88v-5.15c0-2.92,1.56-5.22,4-5.98V3.96 c0-1.42,1.49-2.5,2.99-1.76C13.64,2.52,14,3.23,14,3.96l0,0.39c2.44,0.75,4,3.06,4,5.98v5.15L20,17.35z M19,17.77l-2-1.88v-5.47 c0-2.47-1.19-4.36-3.13-5.1c-1.26-0.53-2.64-0.5-3.84,0.03C8.15,6.11,7,7.99,7,10.42v5.47l-2,1.88V18h14V17.77z"
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
                                    </ytd-subscription-notification-toggle-button-renderer>
                                </div>
                            </ytd-subscribe-button-renderer>
                        </div>
                    </div>
                    <ytd-expander
                        class="style-scope ytd-video-secondary-info-renderer"
                        collapsed=""
                        style="--ytd-expander-collapsed-height:60px;">
                        <!--css-build:shady-->
                        <div id="content" class="style-scope ytd-expander">

                            <div
                                id="description"
                                slot="content"
                                class="style-scope ytd-video-secondary-info-renderer">
                                <yt-formatted-string
                                    class="content style-scope ytd-video-secondary-info-renderer"
                                    force-default-style=""
                                    split-lines="">{{videoMetaDatas.description}}</yt-formatted-string>
                            </div>
                        </div>
                        <ytd-metadata-row-container-renderer
                            class="sticky style-scope ytd-video-secondary-info-renderer"
                            slot="sticky">
                            <!--css-build:shady-->
                            <div id="always-shown" class="style-scope ytd-metadata-row-container-renderer"></div>
                            <div
                                id="collapsible"
                                class="style-scope ytd-metadata-row-container-renderer"
                                hidden=""></div>
                        </ytd-metadata-row-container-renderer>
                        <tp-yt-paper-button
                            id="less"
                            aria-expanded="true"
                            noink=""
                            class="style-scope ytd-expander"
                            hidden=""
                            role="button"
                            tabindex="0"
                            animated=""
                            elevation="0"
                            aria-disabled="false">
                            <!--css-build:shady-->
                            <yt-formatted-string
                                class="less-button style-scope ytd-video-secondary-info-renderer"
                                slot="less-button"
                                role="button">간략히</yt-formatted-string>
                        </tp-yt-paper-button>
                        <tp-yt-paper-button
                            id="more"
                            aria-expanded="false"
                            noink=""
                            class="style-scope ytd-expander"
                            role="button"
                            tabindex="0"
                            animated=""
                            elevation="0"
                            aria-disabled="false">
                            <!--css-build:shady-->
                            <yt-formatted-string
                                class="more-button style-scope ytd-video-secondary-info-renderer"
                                slot="more-button"
                                role="button">더보기</yt-formatted-string>
                        </tp-yt-paper-button>

                    </ytd-expander>
                </div>
            </ytd-video-secondary-info-renderer>
        </div>
    </div>
</template>


<script>

export default({
    props:['videoMetaDatas'],
})
</script>
