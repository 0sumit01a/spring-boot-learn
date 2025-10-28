package com.codewithsumit.store;

import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
    private final NotificationService notificationService;

    public NotificationManager(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void sendNotification(){
        notificationService.send("this is a text message");
    }

}
