package com.example.springwebflux.repository;

import com.example.springwebflux.model.InsurancePlan;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface InsurancePlanRepository extends ReactiveMongoRepository<InsurancePlan,String> {

    Mono<InsurancePlan> findInsurancePlanByName(String name);

    Flux<InsurancePlan> findInsurancePlanByType(String type);

    //Flux<InsurancePlan> findInsurancePlanByServices_Name(String name);

}
