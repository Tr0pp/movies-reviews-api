package com.rest.restapi.models.Reviews;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Link {
    private String type;
    private String url;
    private String suggested_link_text;
}
