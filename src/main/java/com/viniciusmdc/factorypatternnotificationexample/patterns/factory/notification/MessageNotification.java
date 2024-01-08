package com.viniciusmdc.factorypatternnotificationexample.patterns.factory.notification;

public class MessageNotification implements NotificationFactory {

    @Override
    public NotificationServiceDef getInstance() {
        return new MessageNotificationServiceDef();
    }
}
