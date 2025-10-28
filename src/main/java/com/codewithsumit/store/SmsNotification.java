package com.codewithsumit.store;

import org.springframework.stereotype.Service;

@Service("sms")
public class SmsNotification implements NotificationService {
    @Override
    public void send(String message){
        System.out.println("Sending sms " + message);
    }

}
