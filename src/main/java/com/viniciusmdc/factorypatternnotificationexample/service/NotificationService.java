package com.viniciusmdc.factorypatternnotificationexample.service;

import java.util.List;

public interface NotificationService {

    void sendEmailNotificationToAll(List<String> contact);

    void sendPhoneMessageNotificationToAll(List<String> contact);

    Integer countNotificationsSentToday();

    // Other possible usages for this service
}
