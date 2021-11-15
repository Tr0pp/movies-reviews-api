import Home from "../components/Home";
import MovieDetails from "../components/MovieDetails";

let routes = [
    { path: '/home',
        component: Home
    },
    { name: 'movie',
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
