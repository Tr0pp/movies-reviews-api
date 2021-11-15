package com.rest.restapi.models.Reviews;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class DataReviews extends MovieReview {
    private List<MovieReview> results;
}
