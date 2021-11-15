<template>
  <div class="p-2">
    <b-card-group>
        <b-card :title="title" :img-src="img.src" :img-alt="title" img-right>
          <b-card-text>
            {{sumaryShort}}
          </b-card-text>

          <b-card class="mt-5">
            <b-card-text >
              <p class="float-start reviewer-name">{{reviewer}}</p>
            </b-card-text>
          </b-card>

          <router-link :to="{name: 'movie', params: { name: allData.slug_movie, infoMovie: allData } }">
            <b-button class="mt-5" href="filme" variant="dark">Mais detalhes</b-button>
          </router-link>

        </b-card>
    </b-card-group>
  </div>
</template>

<script>
export default {
  name: 'Card',
  props: ['img', 'title', 'sumaryShort', 'allData', 'reviewer', 'reviewersData']
}
</script>

<style scoped>
  .reviewer-name {
    color: #000000;
    text-shadow: #919191 0px 1px;
    font-size: 10pt;
  }
</style>