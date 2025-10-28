package com.codewithsumit.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotification implements NotificationService {
    @Override
    public void send(String message ){
        System.out.println("Sending Via Email " + message);
    }
}
