package com.rest.restapi.models.Reviews;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MovieReview {
    private String display_title;
    private String mpaa_rating;
    private int critics_pick;
    private String byline;
    private String headline;
    private String summary_short;
    private String privateation_date;
    private String opening_date;
    private String date_updated;
    private Link link;
    private Multimedia multimedia;
}
