<template>
  <div class="col-md-12">
    <b-card
        :title="title"
        :img-src="img.src"
        img-alt="Image"
        img-top
        tag="article"
        style="max-width: 18rem; max-height: 30rem;"
        class="m-2 align-content-md-between float-start"
    >
      <b-card-text
          style="max-width: 60rem; max-height: 11rem;"
      >
        {{sumaryShort}}
      </b-card-text>

      <router-link :to="{name: 'movie', params: { name: allData.display_title, infoMovie: allData } }">
        <b-button href="filme" variant="primary">Mais detalhes</b-button>
      </router-link>
    </b-card>
  </div>
</template>

<script>
export default {
  name: 'Card',
  props: ['img', 'title', 'sumaryShort', 'allData'],
  data(){
    return {
      textCard: '',
      buttonCard: ''
    }
  }
}
</script>