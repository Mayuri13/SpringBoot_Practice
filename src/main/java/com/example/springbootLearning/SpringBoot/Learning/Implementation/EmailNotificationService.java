package com.example.springbootLearning.SpringBoot.Learning.Implementation;

import com.example.springbootLearning.SpringBoot.Learning.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
@Qualifier("emailNotify")
public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String message){
        System.out.println("Email sending... "+message);
    }
}
