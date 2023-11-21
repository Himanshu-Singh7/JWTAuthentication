package com.jwt.exaple.service;

import com.jwt.exaple.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    List<User> store = new ArrayList<>();

    UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Himanshu","himanshu@gmail.com" ));
        store.add(new User(UUID.randomUUID().toString(),"Prashant","prashant@gmail.com" ));
        store.add(new User(UUID.randomUUID().toString(),"Shasta","shasta@gmail.com" ));
        store.add(new User(UUID.randomUUID().toString(),"Rahul","rahul@gmail.com" ));
    }

    public List<User> getUser(){
        return this.store;
    }
}
