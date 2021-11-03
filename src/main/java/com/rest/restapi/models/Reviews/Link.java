package com.rest.restapi.models.Reviews;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Link {
    private String type;
    private String url;
    private String suggested_link_text;
}
