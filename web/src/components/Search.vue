<template>
  <div>
    <Navbar></Navbar>
   adssdasd
  </div>
</template>
<script>

import Navbar from '../components/Navbar.vue'

export default {
  name: 'Search',
  components: {
    Navbar
  },
  data() {
    return {
      moviesReviews: []
    }
  },
  async created() {
    // await this.$axios(`all/20/by-publication-date`)
    //     .then(res => {
    //       res.data.results.map(r => {
    //         if(r.multimedia !== null){
    //           this.moviesReviews.push(r)
    //         }
    //       })
    //     })
  }

}
</script>
