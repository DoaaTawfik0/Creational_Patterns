import com.doaatawfik.EmailNotification;
import com.doaatawfik.NotificationManager;
import com.doaatawfik.SmsNotification;

void main(String[] args) {
    NotificationManager manager = new NotificationManager(new SmsNotification());
    manager.sendNotification("Hello World");

    manager.setNotification(new EmailNotification());
    manager.sendNotification("Hello World");

}
