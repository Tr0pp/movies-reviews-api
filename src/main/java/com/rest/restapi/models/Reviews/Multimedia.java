package com.rest.restapi.models.Reviews;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Multimedia {
    private String type;
    private String src;
    private int height;
    private int width;
}
