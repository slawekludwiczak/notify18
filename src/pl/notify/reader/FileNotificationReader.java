package pl.notify.reader;

import pl.notify.model.Notification;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileNotificationReader {

    public List<Notification> getNotifications() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("notifications.csv"));
        List<Notification> notifications = new ArrayList<>();
        for (String line : lines) {
            String[] data = line.split(";");
            notifications.add(new Notification(data[0], data[1], data[2], data[3]));
        }
        return notifications;
    }

}
