package com.example;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RestController
public class HelloWorldController {

    @Autowired
    private IdentityClient identityClient;

    @RequestMapping("/")
    public String home() {
        return "forward:/hystrix";
    }

    @RequestMapping("/hello/{id}")
    public ResponseEntity<String> hello(@PathVariable("id") String id) {
        return ResponseEntity.ok().body("Hello new buddy " + identityClient.getName(id).getName());
    }

}
