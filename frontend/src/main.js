import Vue from 'vue'
import App from './App.vue'
import router from './router'
import VueSession from 'vue-session'
import 'video.js/dist/video-js.css'
import VueVideoPlayer from 'vue-video-player'


var sessionOptions = {
  persist: true
};
Vue.use(VueSession, sessionOptions);
Vue.config.productionTip = false
Vue.use(VueVideoPlayer, null);

new Vue({
  router,
  render: h => h(App),
  created() {
    const html = document.documentElement // returns the html tag
    html.setAttribute('lang', 'ko-KR')
    html.setAttribute('system-icons', '')
    html.setAttribute('typography', '')
    html.setAttribute('typography-spacing', '')
    html.setAttribute('standardized-themed-scrollbar', '')
    html.setAttribute('style', 'font-size: 10px;font-family: Roboto, Arial, sans-serif;')
  }
}).$mount('#app')
