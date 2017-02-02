package com.example;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RestController
public class IdentityController {

    @RequestMapping("/nameFor/{id}")
    public ResponseEntity<User> id(@PathVariable("id") String id) {
        System.out.println(">>> REQUEST: " + id);

        if ("ON".equals(System.getProperty("SLOW"))) {
            try {
                Thread.sleep(10000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return ResponseEntity.ok().body(new User(id, "user:" + id));
    }

}
