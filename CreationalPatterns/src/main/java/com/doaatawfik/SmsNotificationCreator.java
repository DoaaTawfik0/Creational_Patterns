package com.doaatawfik;

public class SmsNotificationCreator extends NotificationManager {

    @Override
    Notification createNotification() {
        return new SmsNotification();
    }
}
