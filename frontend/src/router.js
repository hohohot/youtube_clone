import Vue from "vue";
import VueRouter from "vue-router";
import Main from "./Main.vue";
import VideoSee from "./VideoSee.vue"
import ModalTest from "./ModalTest.vue"

Vue.use(VueRouter);

const router = new VueRouter({
    mode: "history",
    routes: [{
        path: "/",
        component: Main 
    },
    {
        path: "/video",
        component: VideoSee
    },
    {
        path: "/test",
        component: ModalTest
    }]

});

export default router;