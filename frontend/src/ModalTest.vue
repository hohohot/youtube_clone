<template>
  <div id="app">
    <h1>모달 컴포넌트 만들기 :)</h1>
    <ModalView v-if="isModalViewed" @close-modal="isModalViewed = false">
      <Content msg="Hello Vue in CodeSandbox!" />
    </ModalView>
    <button @click="isModalViewed = true">Open Modal</button>
  </div>
</template>

<script>
import Content from "./components/UploadModal";
import ModalView from "./components/ModalView";

export default {
  name: "App",
  components: {
    Content,
    ModalView,
  },
  data() {
    return {
      isModalViewed: false,
    };
  },
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
