package com.mrxu.service;

import com.mrxu.pojo.User;
import reactor.core.publisher.Mono;

import java.util.List;

public interface UserService {
    User find(String id);

    List<User> findAll();

    void insert(User user);

    void update(User user);

    Mono<Void> delete(String id);
}
