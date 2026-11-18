import com.doaatawfik.EmailNotification;
import com.doaatawfik.NotificationManager;
import com.doaatawfik.SmsNotificationCreator;

void main(String[] args) {
    NotificationManager manager1 = new SmsNotificationCreator();
    manager1.sendNotification("Hello World");

    NotificationManager manager2 = new NotificationManager(new EmailNotification());
    manager2.sendNotification("Hello World!!!");

}
