package com.rest.restapi.services;

import com.rest.restapi.models.TopStories;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class DataService {
    @Value("${api.key}")
    private String apiKey;

    public TopStories consumerAPI(String section){
            RestTemplate template = new RestTemplate();

            UriComponents uri = UriComponentsBuilder.newInstance()
                    .scheme("https")
                    .host("api.nytimes.com")
                    .path("svc/topstories/v2/"+section+".json")
                    .queryParam("api-key", apiKey)
                    .build();

            ResponseEntity<TopStories> entity = template.getForEntity(uri.toUriString(), TopStories.class);

           return entity.getBody();
    }
}
