package com.example;

import org.springframework.stereotype.Component;

@Component
public class IndentityClientImpl implements IdentityClient {

    @Override
    public User getName(String id) {
        return new User(id, "ERROR:DEFAULTING");
    }

}
