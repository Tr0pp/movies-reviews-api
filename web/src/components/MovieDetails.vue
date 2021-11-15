<template>
  <div>
    <Navbar></Navbar>
   adssdasd
  </div>
</template>
<script>

import Navbar from '../components/Navbar.vue'

export default {
  name: 'FilmeDetails',
  props: ['infoMovie'],
  components: {
    Navbar
  },
  data() {
    return {
      moviesReviews: [],
      name: this.$route.params.name
    }
  },
  created() {
    console.log(this.$route.params.infoMovie)
  }

}
</script>
