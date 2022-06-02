package com.example.springwebflux.repository;

import com.example.springwebflux.model.NetworkType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface NetworkTypeRepository extends ReactiveMongoRepository<NetworkType, String> {
}
