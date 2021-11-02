package com.rest.restapi.models;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class TopStories {
    private String section;
    private String subsection;
    private String title;
    private String _abstract;
    private String url;
    private String uri;
    private String byline;
    private String item_type;
    private Date updated_date;
    private Date created_date;
    private Date published_date;
    private String material_type_facet;
    private String kicker;
    private List<String> des_facet;
    private List<String> org_facet;
    private List<String> per_facet;
    private List<String> geo_facet;
    private List<Multimedia> multimedia;
    private String short_url;

}
