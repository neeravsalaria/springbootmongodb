package com.example.springwebflux.repository;

import com.example.springwebflux.model.CostType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CostTypeRepository extends ReactiveMongoRepository<CostType, String> {
}
