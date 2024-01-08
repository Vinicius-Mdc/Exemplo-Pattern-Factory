package com.viniciusmdc.factorypatternnotificationexample.service.impl;

import com.viniciusmdc.factorypatternnotificationexample.patterns.factory.notification.EmailNotification;
import com.viniciusmdc.factorypatternnotificationexample.patterns.factory.notification.MessageNotification;
import com.viniciusmdc.factorypatternnotificationexample.patterns.factory.notification.NotificationFactory;
import com.viniciusmdc.factorypatternnotificationexample.patterns.factory.notification.NotificationServiceDef;
import com.viniciusmdc.factorypatternnotificationexample.service.NotificationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService {

    Integer totalNotificationsSentToday = 0;


    @Override
    public void sendEmailNotificationToAll(List<String> contacts) {

        NotificationFactory notificationFactory = new EmailNotification();
        NotificationServiceDef service = notificationFactory.getInstance();
        service.sendNotificationToAll(contacts);

    }

    @Override
    public void sendPhoneMessageNotificationToAll(List<String> contacts) {

        NotificationFactory notificationFactory = new MessageNotification();
        NotificationServiceDef service = notificationFactory.getInstance();
        service.sendNotificationToAll(contacts);

    }

    @Override
    public Integer countNotificationsSentToday() {
        return totalNotificationsSentToday;
    }
}
