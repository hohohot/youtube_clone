

<template>
    <video
        :src="this.videoUrl"
        style="width: 960px; height: 540px; left: 0px; top: 0px;"
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