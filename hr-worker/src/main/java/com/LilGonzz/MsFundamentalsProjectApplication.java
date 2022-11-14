package com.LilGonzz;

import com.LilGonzz.model.Worker;
import com.LilGonzz.repository.WorkerRepositorty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@SpringBootApplication
@EnableMongoRepositories
public class MsFundamentalsProjectApplication{

	@Autowired
	WorkerRepositorty repositorty;
	public static void main(String[] args) {
		SpringApplication.run(MsFundamentalsProjectApplication.class, args);
	}

}
