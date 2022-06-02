package com.example.springwebflux.repository;


import com.example.springwebflux.model.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
    Flux<Customer> findByName(String name);
}
