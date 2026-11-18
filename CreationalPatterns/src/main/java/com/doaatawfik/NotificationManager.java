package com.doaatawfik;

public class NotificationManager {
    private final Notification notification;

    public NotificationManager(Notification notification) {
        this.notification = notification;
    }

    public void sendNotification(String message) {
        notification.notifyUser(message);
    }
}
