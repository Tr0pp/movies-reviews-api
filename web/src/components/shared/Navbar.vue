<template>
    <b-navbar toggleable="lg" type="dark" variant="dark">
      <b-navbar-brand href="/" class="nv">Movies Reviews</b-navbar-brand>

      <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

      <b-collapse id="nav-collapse" is-nav>
        <b-navbar-nav>
<!--          <b-nav-item href="#">Reviewers</b-nav-item>-->
        </b-navbar-nav>
      </b-collapse>
    </b-navbar>
</template>

<script>

export default {
  name: 'Navbar',
}
</script>

<style scoped>
  .nv {
    margin-left: 1% !important;
  }
</style>