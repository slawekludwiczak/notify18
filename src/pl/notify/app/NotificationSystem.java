package pl.notify.app;

import java.io.IOException;

public class NotificationSystem {
    public static void main(String[] args) {
        NotificationFacade facade = new NotificationFacade();
        try {
            facade.sendAllNotifications();
        } catch (IOException e) {
            System.err.println("Nie udało się wysłać powiadomień");
        }
    }
}
