package com.doaatawfik;

public abstract class NotificationManager {
    abstract Notification createNotification();

    public void sendNotification(String message) {

        Notification notification = createNotification();
        notification.notifyUser(message);
    }
}
