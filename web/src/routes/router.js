import Home from "../components/Home";
import Search from "../components/Search";

let routes = [
    { path: '/home',
        component: Home
    },
    { path: '/search',
        component: Search
    },
    {
        path: '/',
        redirect: '/home'
    }
]

export default routes
