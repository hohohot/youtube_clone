<template>
    <video
        id="video_1"
        class="video-js vjs-default-skin"
        controls="controls"
        preload="auto"
        width="1280"
        height="720"
        autoplay=""
        data-setup='{}'></video>
</template>
/*
<video
    :src="this.videoUrl"
    style="width: 1280px; height: 720px; left: 0px; top: 0px;"
    controls=""></video>
*/
<script>
    import 'video.js/dist/video-js.css';
    import axios from 'axios';
    var videojs = require('video.js');
    require('@silvermine/videojs-quality-selector')(videojs);
    require('@silvermine/videojs-quality-selector/dist/css/quality-selector.css');

    export default {
        data() {
            return {
                videoUrl: "/streaming/" + this.$route.query.id,
                options: {
                    controlBar: {
                        children: ['playToggle', 'progressControl', 'volumePanel', 'qualitySelector', 'fullscreenToggle']
                    }
                },
                player: null
            }
        },
        mounted() {
            this.player = videojs("video_1", this.options,);

            axios
                .get(`/videoUrlList/${this.$route.query.id}`)
                .then(response => {
                    this.player.src(response.data);
                });
                    
        }
    }
</script>