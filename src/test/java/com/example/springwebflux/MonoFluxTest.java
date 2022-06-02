package com.example.springwebflux;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {

    @Test
    public void testMono() {
        Mono<String> monopublisher = Mono.just("hello").log();
        monopublisher.subscribe(System.out::println);
    }

    @Test
    public void testFlux() {
        Flux<String> fluxublisher = Flux.just("1","2","3").log();
        fluxublisher.subscribe(System.out::println);
    }

}
