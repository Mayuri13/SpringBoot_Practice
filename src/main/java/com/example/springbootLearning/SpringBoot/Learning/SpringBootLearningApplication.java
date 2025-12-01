package com.example.springbootLearning.SpringBoot.Learning;

import com.example.springbootLearning.SpringBoot.Learning.Implementation.EmailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SpringBootLearningApplication implements CommandLineRunner {

    @Autowired //To let compiler know that this class is a bean we have to manage it
    PaymentService ps;

//    @Autowired //Using Autowired is not recommended
//    final NotificationService notificationServiceObj; //Dependency Injection
//
//    public SpringBootLearningApplication(@Qualifier("smsNotify") NotificationService notificationServiceObj) {
//        this.notificationServiceObj = notificationServiceObj;
//    }

    //To create beans of all notification service instead of only one we can use a map
    @Autowired
    Map<String, NotificationService> notificationServiceMap = new HashMap<>();

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLearningApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        ps.pay();
        for(var notificationService: notificationServiceMap.entrySet()){
            System.out.println(notificationService.getKey());
            notificationService.getValue().send("Hello");
        }
    }
}
