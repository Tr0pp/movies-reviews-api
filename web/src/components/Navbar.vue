<template>
    <b-navbar toggleable="lg" type="dark" variant="dark">
      <b-navbar-brand href="/home">Movies Reviews</b-navbar-brand>

      <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

      <b-collapse id="nav-collapse" is-nav>
        <b-navbar-nav>
<!--          <b-nav-item href="#">Link</b-nav-item>-->
<!--          <b-nav-item-dropdown text="Data" right>-->
<!--            <b-dropdown-item v-for="(item, index) in reviewer" :key="index">{{item.display_name}}</b-dropdown-item>-->
<!--          </b-nav-item-dropdown>-->
        </b-navbar-nav>

        <!-- Right aligned nav items -->
        <b-navbar-nav class="ml-auto">
          <b-nav-item-dropdown text="Reviewers" right>
            <b-dropdown-item href="#" v-for="(item, index) in reviewer" :key="index" @click="addFilter(item.display_name)">{{item.display_name}}</b-dropdown-item>
          </b-nav-item-dropdown>
        </b-navbar-nav>
      </b-collapse>
    </b-navbar>
</template>

<script>
import {nameReviewer} from "../main";

export default {
  name: 'Navbar',
  data(){
    return {
      reviewer: [],
      filter: [],
      name_reviewer: '',
    }
  },
  created() {
    this.dadosDropdown()
  },
  methods: {
    async dadosDropdown(){
      await this.$axios(`all`)
          .then(res => {
            this.reviewer = res.data.results
          })
    },
    async addFilter(display_name){
      nameReviewer.$emit('name_reviewer', display_name)
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
