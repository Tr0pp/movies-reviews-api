import Home from "../components/pages/Home";
import MovieDetails from "../components/pages/MovieDetails";

let routes = [
    {
        name: 'home',
        path: '/home',
        component: Home
    },
    {
        name: 'movie',
        path: '/movie/:name',
        component: MovieDetails,
        props(route) {
            return { infoMovie: route.query.infoMovie }
        }
    },
    {
        path: '/',
        redirect: '/home'
    }
]

export default routes
