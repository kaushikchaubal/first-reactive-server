package com.example.service;

import java.util.Random;

import com.example.domain.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.HelloWorldDao;
import reactor.core.publisher.Flux;

@Service
public class HelloWorldService {

    private HelloWorldDao helloWorldDao;

    @Autowired
    public HelloWorldService(HelloWorldDao helloWorldDao) {
        this.helloWorldDao = helloWorldDao;
    }

    public Flux<Word> sayHelloWorld() {
        return helloWorldDao.sayHelloWorld();
    }
}
