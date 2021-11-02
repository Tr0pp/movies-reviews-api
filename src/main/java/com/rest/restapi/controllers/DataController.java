package com.rest.restapi.controllers;

import com.rest.restapi.services.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class DataController {

    final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/{section}")
    public Object data(@PathVariable String section){
        return dataService.consumerAPI(section);
    }
}
