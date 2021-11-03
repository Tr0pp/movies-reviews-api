package com.rest.restapi.models.Critics;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MovieReview {
    private String display_name;
    private String sort_name;
    private String status;
    private String bio;
    private String seo_name;
    private Multimedia multimedia;
}
