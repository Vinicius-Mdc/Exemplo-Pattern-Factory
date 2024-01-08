package com.viniciusmdc.factorypatternnotificationexample.patterns.factory.notification;

import java.util.List;

public class EmailNotificationServiceDef implements NotificationServiceDef {

    @Override
    public void sendNotificationToAll(List<String> contact) {
        System.out.println("Email notification was sent succesfully!");
    }

}
