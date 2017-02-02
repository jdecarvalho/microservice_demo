package com.example;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("http://a-identity-client")
public interface IdentityClient {

    @RequestMapping(value = "/nameFor/{id}", method = RequestMethod.GET)
    User getName(@PathVariable("id") String id);

}
