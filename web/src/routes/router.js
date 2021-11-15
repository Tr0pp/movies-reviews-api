import Home from "../components/pages/Home";
import MovieDetails from "../components/pages/MovieDetails";

let routes = [
    {
        path: '/',
        redirect: '/home'
    },
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
    // {
    //     name: 'reviewers',
    //     path: '/reviewers',
    //     component: Reviewers
    // }
]

export default routes
