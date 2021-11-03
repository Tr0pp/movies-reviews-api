<template>
  <div class="col-md-12">
    <b-card
        :title="title"
        :img-src="img.src"
        img-alt="Image"
        img-top
        tag="article"
        style="max-width: 10rem;"
        class="m-2 align-content-md-between float-start"
    >
      <b-card-text>
        {{sumaryShort}}
      </b-card-text>

      <b-button href="#" variant="primary">Go somewhere</b-button>
    </b-card>
  </div>
</template>

<script>
export default {
  name: 'Card',
  props: ['img', 'title', 'sumaryShort'],
  data(){
    return {
      textCard: '',
      buttonCard: ''
    }
  },
  created() {
    console.log(this.img)
  }
}
</script>