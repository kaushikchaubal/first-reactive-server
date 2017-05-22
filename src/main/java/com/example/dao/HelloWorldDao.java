package com.example.dao;

import com.example.domain.Word;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Repository
public class HelloWorldDao {

    public Flux<Word> sayHelloWorld() {
        return Flux.just(new Word("Hello"), new Word("World"), new Word("from"), new Word("Kaushik"))
                .delayElements(Duration.ofSeconds(2));
    }

}
