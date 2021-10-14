import Vue from 'vue'
import App from './App.vue'


Vue.config.productionTip = false

new Vue({
  render: h => h(App),
  created() {
    const html = document.documentElement // returns the html tag
    html.setAttribute('lang', 'ko-KR')
    html.setAttribute('system-icons', '')
    html.setAttribute('style', 'font-size: 10px;font-family: Roboto, Arial, sans-serif;')
  }
}).$mount('#app')