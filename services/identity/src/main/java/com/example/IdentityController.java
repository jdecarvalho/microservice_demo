package com.example;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RestController
public class IdentityController {

    @RequestMapping("/nameFor/{id}")
    public ResponseEntity<String> id(@PathVariable("id") String id) {
        return new ResponseEntity<>("user:" + id, HttpStatus.OK);
    }

}
