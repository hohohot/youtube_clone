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
                    href="/watch?v=LSuzq_T0aaE">
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
                            width="168"
                            src="https://i.ytimg.com/vi/LSuzq_T0aaE/hqdefault.jpg?sqp=-oaymwEcCNACELwBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&amp;rs=AOn4CLBB1y1_6-6440n7dpas6zQN-t9Ncg"/></yt-img-shadow>

                </a>
            </ytd-thumbnail>
            <div class="details style-scope ytd-compact-video-renderer">
                <div class="metadata style-scope ytd-compact-video-renderer">
                    <a
                        class="yt-simple-endpoint style-scope ytd-compact-video-renderer"
                        rel="nofollow"
                        href="/watch?v=LSuzq_T0aaE">
                        <h3 class="style-scope ytd-compact-video-renderer">
                            <ytd-badge-supported-renderer
                                class="style-scope ytd-compact-video-renderer"
                                disable-upgrade=""
                                hidden=""></ytd-badge-supported-renderer>
                            <span
                                id="video-title"
                                class="style-scope ytd-compact-video-renderer"
                                aria-label="[철권7 시즌4] 철린이를 위한 데빌진 주력기술 11가지 게시자: 소야진 2일 전 5분 20초 조회수 7,146회"
                                title="[철권7 시즌4] 철린이를 위한 데빌진 주력기술 11가지">
                                [철권7 시즌4] 철린이를 위한 데빌진 주력기술 11가지
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
                                                        ellipsis-truncate="">소야진</yt-formatted-string>
                                                </div>
                                                <tp-yt-paper-tooltip
                                                    fit-to-visible-bounds=""
                                                    class="style-scope ytd-channel-name"
                                                    role="tooltip"
                                                    tabindex="-1"
                                                    style="inset: -19.6px auto auto 160px;">
                                                    <!--css-build:shady-->
                                                    <div id="tooltip" class="style-scope tp-yt-paper-tooltip hidden">

                                                        소야진

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

                                        <span class="style-scope ytd-video-meta-block">조회수 7.1천회</span>

                                        <span class="style-scope ytd-video-meta-block">2일 전</span>
                                        <dom-repeat strip-whitespace="" class="style-scope ytd-video-meta-block">
                                            <template is="dom-repeat"></template>
                                        </dom-repeat>
                                    </div>
                                </div>
                                <div id="additional-metadata-line" class="style-scope ytd-video-meta-block">
                                    <dom-repeat class="style-scope ytd-video-meta-block">
                                        <template is="dom-repeat"></template>
                                    </dom-repeat>
                                </div>

                            </ytd-video-meta-block>
                            <ytd-badge-supported-renderer
                                class="badges style-scope ytd-compact-video-renderer"
                                system-icons="">
                                <!--css-build:shady-->
                                <div
                                    class="badge badge-style-type-simple style-scope ytd-badge-supported-renderer">
                                    <yt-icon
                                        class="style-scope ytd-badge-supported-renderer"
                                        disable-upgrade=""
                                        hidden=""></yt-icon>
                                    <span class="style-scope ytd-badge-supported-renderer">새 동영상</span>
                                </div>
                                <dom-repeat
                                    id="repeat"
                                    as="badge"
                                    class="style-scope ytd-badge-supported-renderer">
                                    <template is="dom-repeat"></template>
                                </dom-repeat>
                            </ytd-badge-supported-renderer>
                        </div>
                    </a>

                </div>

            </div>
        </div>

    </ytd-compact-video-renderer>
</template>

<script>

export default {
    props:['videoItmeInfo'],
};

</script>
