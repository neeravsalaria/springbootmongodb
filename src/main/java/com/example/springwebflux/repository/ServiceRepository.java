package com.example.springwebflux.repository;

import com.example.springwebflux.model.Services;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface ServiceRepository extends ReactiveMongoRepository<Services, String> {
    Flux<Services> findByType(String type);
}
