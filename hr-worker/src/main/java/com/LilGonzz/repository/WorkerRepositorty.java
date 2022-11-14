package com.LilGonzz.repository;


import com.LilGonzz.model.Worker;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkerRepositorty extends MongoRepository<Worker, String> {
}
