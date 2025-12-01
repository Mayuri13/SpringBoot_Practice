package com.example.springbootLearning.SpringBoot.Learning;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component  //Signifies to the compiler that this class will be managed by Spring framework
public class PaymentService {
    public void pay() {
        System.out.println("Paying...");
    }

    @PostConstruct  //Just after creation of the bean
    public void afterInit(){
        System.out.println("Before Paying...");
    }

    @PreDestroy //before bean is destroyed(basically when the application is stop
    public void beforeDestroyed() {
        System.out.println("After payment is done...");
    }
}
