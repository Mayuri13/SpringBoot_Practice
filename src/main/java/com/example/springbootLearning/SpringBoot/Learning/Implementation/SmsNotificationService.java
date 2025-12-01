package com.example.springbootLearning.SpringBoot.Learning.Implementation;

import com.example.springbootLearning.SpringBoot.Learning.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("smsNotify")
public class SmsNotificationService implements NotificationService {

    @Override
    public void send(String message){
        System.out.println("Sms sending... "+message);
    }
}
