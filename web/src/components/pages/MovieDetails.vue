<template>
  <div>
    <Navbar></Navbar>
    <b-container class="mt-1">
      <b-card-group deck>
        <b-card-header>
          Classificação indicativa: {{ infoMovie.mpaa_rating }}
        </b-card-header>
        <b-card :title="infoMovie.display_title" class="mb-3">
          <div class="card-style mt-2">
            <img :src="infoMovie.multimedia.src" :img-alt="infoMovie.summary_short">
          </div>
          <b-card class="mt-4 card-style">
            {{ infoMovie.summary_short }}
          </b-card>

          <b-card-text class="mt-4">
            <p>Reviewer: <strong>{{ infoMovie.byline }}</strong></p>
            <b-button :href="infoMovie.link.url" target="_blank">
             {{ infoMovie.link.suggested_link_text }}
            </b-button>
          </b-card-text>
            {{ infoMovie.headline }}
          <b-card-footer>
            <p>Última edição: {{ infoMovie.date_updated }}</p>
          </b-card-footer>
        </b-card>
      </b-card-group>
    </b-container>
  </div>
</template>
<script>
import Navbar from '../shared/Navbar.vue'

export default {
  name: 'MovieDetails',
  components: {
    Navbar
  },
  data() {
    return {
      name: this.$route.params.name,
      infoMovie: this.$route.params.infoMovie
    }
  },
  created() {
    if(this.infoMovie.mpaa_rating === null || this.infoMovie.mpaa_rating === '' || this.infoMovie.mpaa_rating === undefined){
      this.infoMovie.mpaa_rating = '--'
    }
  }
}
</script>

<style scoped>
  .card-style {
    border: #d3d3d3 0.01em solid;
    border-radius: 4px;
    box-shadow: rgba(0, 0, 0, 0.16) 1px 1px 12px;
  }

  .img-movie > img {
    border-radius: 4px;
    box-shadow: rgba(0, 0, 0, 0.25) 0px 0px 12px;
  }
</style>
