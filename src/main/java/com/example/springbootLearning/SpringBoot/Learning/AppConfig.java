package com.example.springbootLearning.SpringBoot.Learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    PaymentService paymentService(){
        System.out.println("This is a bean");
        return new PaymentService();
    }

}
