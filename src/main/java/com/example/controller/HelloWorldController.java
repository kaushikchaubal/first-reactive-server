package com.example.controller;

import com.example.domain.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.example.service.HelloWorldService;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(value = "api")
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {

    private HelloWorldService helloWorldService;

    @Autowired
    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping(value = "helloWorld", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Word> sayHelloWorld() {
        return helloWorldService.sayHelloWorld();
    }
}
