package com.example.springbootLearning.SpringBoot.Learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLearningApplication implements CommandLineRunner {

    @Autowired //To let compiler know that this class is a bean we have to manage it
    PaymentService ps;

	public static void main(String[] args) {
        SpringApplication.run(SpringBootLearningApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        ps.pay();
    }
}
