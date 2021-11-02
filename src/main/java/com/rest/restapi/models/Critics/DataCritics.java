package com.rest.restapi.models.Critics;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class DataCritics {
    private List<Object> results;
    private MovieReview movieReview;
}
