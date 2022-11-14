package com.LilGonzz.service;

import com.LilGonzz.model.Worker;
import com.LilGonzz.repository.WorkerRepositorty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerService {
    @Autowired
    WorkerRepositorty repository;

    public List<Worker> findAll(){
        return repository.findAll();
    }

    public Optional<Worker> findOne(String id){
        return repository.findById(id);
    }
}
