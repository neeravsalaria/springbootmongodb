package com.example.springwebflux.repository;

import com.example.springwebflux.model.PlanType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface PlanTypeRepository extends ReactiveMongoRepository<PlanType, String> {
    Flux<PlanType> findByType(String type);
}
