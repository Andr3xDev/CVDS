package edu.eci.cvds.Inventory.notification;

public class FactoryNotification {
    public static Notification create(String type) {
        switch (type) {
            case "Log":
                return new UpdateNotification();
            case "Update":
                return new LogNotification();
            default:
                System.out.println("NOt Reconognize");
        }
        return null;
    }
}