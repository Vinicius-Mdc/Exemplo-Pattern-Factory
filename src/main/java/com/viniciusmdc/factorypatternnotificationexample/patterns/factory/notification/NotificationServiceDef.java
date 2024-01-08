package com.viniciusmdc.factorypatternnotificationexample.patterns.factory.notification;

import java.util.List;

public interface NotificationServiceDef {
    void sendNotificationToAll(List<String> contact);
}
