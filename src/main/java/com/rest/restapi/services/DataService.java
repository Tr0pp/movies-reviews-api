package com.rest.restapi.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.rest.restapi.models.Critics.DataCritics;
import com.rest.restapi.models.Reviews.DataReviews;
import com.rest.restapi.models.Reviews.MovieReview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.sql.Array;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
public class DataService {
    @Value("${api.key}")
    private String apiKey;

    @Value("${api.host}")
    private String host;

    RestTemplate template = new RestTemplate();

    public DataCritics criticsReviewer(String reviewer) {
            UriComponents uri = UriComponentsBuilder.newInstance()
                    .scheme("https")
                    .host(host)
                    .path("svc/movies/v2/critics/"+reviewer+".json")
                    .queryParam("api-key", apiKey)
                    .build();

            ResponseEntity<DataCritics> entity = template.getForEntity(uri.toUriString(), DataCritics.class);

            return entity.getBody();
    }

    public DataReviews typeReviews(
            String type,
            String offset,
            String order
    ) {
        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host(host)
                .path("svc/movies/v2/reviews/"+type+".json")
                .queryParam("offset", offset)
                .queryParam("order", order)
                .queryParam("api-key", apiKey)
                .build();

        ResponseEntity<DataReviews> entity = template.getForEntity(uri.toUriString(), DataReviews.class);


        List<MovieReview> movieReviews = entity.getBody().getResults();

       movieReviews.stream().map(item -> {
            item.setSlug_movie(
                    item.getDisplay_title()
                    .toLowerCase()
                    .replaceAll(" ", "-")
                    .replaceAll("ã", "a")
                    .replaceAll("ê", "e")
                    .replaceAll("&", "e")
            );
            return item.getSlug_movie();
        }).collect(Collectors.toList());

       return entity.getBody();
    }

    public DataReviews searchReviews(
            String criticsPick,
            String offset,
            String openingDate,
            String order,
            String publicationDate,
            String reviewer,
            String query
    ) {
        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host(host)
                .path("svc/movies/v2/reviews/search.json")
                .queryParam("critics-pick", criticsPick)
                .queryParam("offset", offset)
                .queryParam("opening-date", openingDate)
                .queryParam("order", order)
                .queryParam("publication-date", publicationDate)
                .queryParam("reviewer", reviewer)
                .queryParam("query", query)
                .queryParam("api-key", apiKey)
                .build();

        ResponseEntity<DataReviews> entity = template.getForEntity(uri.toUriString(), DataReviews.class);

        return entity.getBody();
    }
}
