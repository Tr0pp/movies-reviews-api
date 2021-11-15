<template>
  <div>
    <Navbar></Navbar>
      <b-container class="mt-3">
          <b-form inline>
            <b-form-input
                style="max-width: 40%; display: inline"
                placeholder="Nome do filme ou reviewer"
                v-model="search"
                inline
            ></b-form-input>

            <b-button title="Limpar filtro" style="margin-left: 1%" v-b-tooltip:hover @click="clearFilter">
              <b-icon-trash></b-icon-trash>
            </b-button>
          </b-form>

          <div v-for="(item, index) in moviesFiltered" :key="index">
            <Card
                :key="index"
                :title="item.display_title"
                :img="item.multimedia"
                :sumaryShort="item.summary_short"
                :allData="item"
                :reviewer="item.byline"
                :reviewersData="reviewersData"
            />
          </div>
      </b-container>
  </div>

</template>
<script>
import Navbar from '../shared/Navbar.vue'
import Card from '../shared/Card.vue'

export default {
  name: 'Template',
  components: {
    Navbar,
    Card
  },
  data() {
    return {
      moviesReviews: [],
      reviewersData: '',
      search: '',
      selected: null
    }
  },
  created() {
    this.dadosPage()
  },
  computed: {
    moviesFiltered() {
      return this.moviesReviews.filter((item) => {
        return (
            item.display_title.toLowerCase().indexOf(this.search.toLowerCase()) > -1 ||
            item.byline.toLowerCase().indexOf(this.search.toLowerCase()) > -1
        )
      })
    }
  },
  methods: {
    async dadosPage(){
      await this.$axios(`all/10/by-publication-date`)
          .then(res => {
            res.data.results.map(r => {
              if(r.multimedia !== null){
                this.moviesReviews.push(r)
              }
            })
          })
    },
    // async dadosReviewers(){
    //   await this.$axios(`all`)
    //       .then(res => {
    //         this.reviewersData = res.data.results
    //       })
    // },
    clearFilter(){
      this.search = ''
      this.selected = null
    }
  }

}
</script>
