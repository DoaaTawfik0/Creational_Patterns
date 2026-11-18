package com.doaatawfik;

public class SmsNotification implements Notification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending SMS: " + message);
    }
}