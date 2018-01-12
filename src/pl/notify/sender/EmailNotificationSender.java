package pl.notify.sender;

import pl.notify.model.Notification;

public class EmailNotificationSender {

    public void sendNotification(Notification notification) {
        System.out.println("Sending notification to " + notification);
    }

}
