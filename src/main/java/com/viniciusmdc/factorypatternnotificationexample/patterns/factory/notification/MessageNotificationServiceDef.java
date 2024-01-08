package com.viniciusmdc.factorypatternnotificationexample.patterns.factory.notification;

import java.util.List;

public class MessageNotificationServiceDef implements NotificationServiceDef {

    @Override
    public void sendNotificationToAll(List<String> contact) {
        System.out.println("Message notification was sent succesfully!");
    }

}
