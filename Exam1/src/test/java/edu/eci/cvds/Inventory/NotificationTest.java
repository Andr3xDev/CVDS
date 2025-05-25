package edu.eci.cvds.Inventory;

import edu.eci.cvds.Inventory.notification.FactoryNotification;
import edu.eci.cvds.Inventory.notification.Notification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class NotificationTest {
    @Test
    public void mustCreateNotification() {
        FactoryNotification notification = new FactoryNotification();
        assertNotNull(notification);
    }

    @Test
    public void mustCreateNotificationU() {
        FactoryNotification notification = new FactoryNotification();
        assertNotNull(notification.create("Update"));
    }

    @Test
    public void mustCreateNotificationL() {
        FactoryNotification notification = new FactoryNotification();
        assertNotNull(notification.create("Log"));
    }

}