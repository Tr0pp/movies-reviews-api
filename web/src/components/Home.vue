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
import {nameReviewer} from "../main";

export default {
  name: 'Template',
  components: {
    Navbar,
    Card
  },
  data() {
    return {
      moviesReviews: [],
      nameReviewer: '',
    }
  },
  created() {
    this.dadosPage()
    nameReviewer.$on('name_reviewer', (res) => {
      if(res !== undefined){
        this.nameReviewer = res
        this.dadosPage()
      }
    })
  },
  watch() {
    nameReviewer.$on('name_reviewer', (res) => {
      if(res !== undefined){
        this.nameReviewer = res
        this.$axios(res)
            .then(res => {
              res.data.results.map(r => {
                if(r.multimedia !== null){
                  this.moviesReviews.push(r)
                }
              })
            })
      }
    })
  },
  methods: {
    async dadosPage(){
      let search

      if(this.nameReviewer !== '') {
        search = this.nameReviewer.toLowerCase()
      } else {
        search = 'all/10/by-publication-date'
      }
      await this.$axios(search)
          .then(res => {
            res.data.results.map(r => {
              if(r.multimedia !== null){
                this.moviesReviews.push(r)
              }
            })
          })
    }
  }

}
</script>
