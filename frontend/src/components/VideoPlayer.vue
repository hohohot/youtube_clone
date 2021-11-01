

<template>
    <video
        :src="this.videoUrl"
        style="width: 1280px; height: 720px; left: 0px; top: 0px;"
        controls = ""
        >
    </video>
</template>

<script>
export default{
    data(){
        return {
            videoUrl: "/streaming/" + this.$route.query.id,
        }
    },


}
</script>