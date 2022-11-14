package com.LilGonzz.controller;

import com.LilGonzz.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {
    @Autowired
    WorkerService service;

    @GetMapping
    public ResponseEntity<?> findAll(){
        var workers = service.findAll();
        return ResponseEntity.ok(workers);
    }

    @GetMapping(value = "/{id}")
    public  ResponseEntity<?> findOne(@PathVariable String id){
        var worker = service.findOne(id);
        if(worker.isPresent())
            return ResponseEntity.ok(worker.get());

        return ResponseEntity.notFound().build();
    }
}
