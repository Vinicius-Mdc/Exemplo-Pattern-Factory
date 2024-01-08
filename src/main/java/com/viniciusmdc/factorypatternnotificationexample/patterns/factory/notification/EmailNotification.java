package com.viniciusmdc.factorypatternnotificationexample.patterns.factory.notification;

public class EmailNotification implements NotificationFactory{
    @Override
    public NotificationServiceDef getInstance() {
        return new EmailNotificationServiceDef();
    }
}
