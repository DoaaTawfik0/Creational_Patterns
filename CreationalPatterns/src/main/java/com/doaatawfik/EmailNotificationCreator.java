package com.doaatawfik;

public class EmailNotificationCreator extends NotificationManager {
    @Override
    Notification createNotification() {
        return new EmailNotification();
    }
}
