package com.viniciusmdc.factorypatternnotificationexample.controller;

import com.viniciusmdc.factorypatternnotificationexample.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    @Autowired
    NotificationService notificationService;

    @GetMapping("/email")
    public String sendEmailNotification(){
        List<String> emails = List.of("email1@gmail.com", "email2@gmail.com");
        notificationService.sendEmailNotificationToAll(emails);
        return "email notification sent.";
    }

    @GetMapping("/phone")
    public String sendPhoneMessageNotification(){
        List<String> numbers = List.of("13245678", "87654321");
        notificationService.sendPhoneMessageNotificationToAll(numbers);
        return "Phone message notification sent.";
    }

}
