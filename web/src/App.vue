<template>
  <div id="app">
    <Template></Template>
  </div>
</template>

<script>
// import HelloWorld from './components/HelloWorld.vue'
import Template from './components/Template.vue'

export default {
  name: 'App',
  components: {
    Template
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
