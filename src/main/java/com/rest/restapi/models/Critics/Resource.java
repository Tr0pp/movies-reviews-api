package com.rest.restapi.models.Critics;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Resource {
    private String url;
    private String format;
    private int height;
    private int width;
    private String type;
    private String subtype;
    private String caption;
    private String copyright;
}
