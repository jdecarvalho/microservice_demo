package com.example;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RestController
public class HelloWorldController {

    // @Autowired
    // private IdenCon

    @RequestMapping("/hello/{id}")
    public ResponseEntity<String> hello(@PathVariable("id") String id) {
        return new ResponseEntity<>("Hello " + id, HttpStatus.OK);
    }

}
