package pl.notify.app;

import pl.notify.logger.ConsoleNotificationLogger;
import pl.notify.model.Notification;
import pl.notify.reader.FileNotificationReader;
import pl.notify.sender.EmailNotificationSender;

import java.io.IOException;
import java.util.List;

public class NotificationFacade {

    public void sendAllNotifications() throws IOException {
        FileNotificationReader reader = new FileNotificationReader();
        EmailNotificationSender sender = new EmailNotificationSender();
        ConsoleNotificationLogger logger = new ConsoleNotificationLogger();

        List<Notification> notifications = reader.getNotifications();
        for (Notification notification : notifications) {
            sender.sendNotification(notification);
            logger.log("Wysłano wiadomość do " + notification.getEmail());
        }
    }

}
