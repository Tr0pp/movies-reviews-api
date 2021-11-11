package com.rest.restapi.controllers;

import com.rest.restapi.services.DataService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:8081","http://localhost"})
@RestController
@RequestMapping("/")
public class DataController {

    final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    /**
     * @param reviewer name or "all" for all reviewers,
     * "full-time" for full-time reviewers,
     * or "part-time" for part-time reviewers
     */
    @GetMapping("/{reviewer}")
    public Object criticsReviewer(@PathVariable String reviewer) {
        return dataService.criticsReviewer(reviewer);
    }

    /**
     * @param type all, picks
     * @param offset Sets the starting point of the result set. Needs to be multiple of 20.
     * @param order by-opening-date, by-publication-date
     */
    @GetMapping("/{type}/{offset}/{order}")
    public Object typeReviews(@PathVariable String type, String offset, String order) {
        return dataService.typeReviews(type, offset, order);
    }

    /**
     *
     * @param criticsPick Set to Y to only show critics' picks. Otherwise shows both.
     * @param offset Sets the starting point of the result set (0, 20, ...). Used to paginate thru results. Defaults to 0. The has_more field indicates the response has more results.
     * @param openingDate U.S. opening date range. Start and end dates separated by colon (e.g. 1930-01-01:1940-01-01)
     * @param order by-opening-date, by-publication-date -- Field to order results by (e.g. by-publication-date)
     * @param publicationDate Review publication date range. Start and end dates separated by colon (e.g. 1930-01-01:1940-01-01)
     * @param reviewer Filter by reviewer byline (e.g. Stephen Holden)
     * @param query Search keyword (e.g. lebowski).
     */
    @GetMapping("/{criticsPick}/{offset}/{openingDate}/{order}/{publicationDate}/{reviewer}/{query}")
    public Object searchReviewes(
            @PathVariable String criticsPick,
            String offset,
            String openingDate,
            String order,
            String publicationDate,
            String reviewer,
            String query
    ) {
        return dataService.searchReviews(criticsPick, offset, openingDate, order, publicationDate, reviewer, query);
    }
}
