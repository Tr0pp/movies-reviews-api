<template>
  <div>
    <Navbar></Navbar>
    <div v-for="(item, index) in moviesReviews" :key="index">
      <Card
          :key="index"
          :title="item.display_title"
          :img="item.multimedia"
          :sumaryShort="item.summary_short"
      />
    </div>
  </div>
</template>
<script>
// import HelloWorld from './components/HelloWorld.vue'
import Navbar from '../components/Navbar.vue'
import Card from '../components/Card.vue'

export default {
  name: 'Template',
  components: {
    Navbar,
    Card
  },
  data() {
    return {
      moviesReviews: []
    }
  },
  async created() {
    await this.$axios(`all/20/by-publication-date`)
        .then(res => {
          res.data.results.map(r => {
            if(r.multimedia !== null){
              this.moviesReviews.push(r)
            }
          })
        })
  }

}
</script>
