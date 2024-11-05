package com.jovisco.tutorial.patterns.observer;

import static com.jovisco.tutorial.patterns.observer.Event.NEW_ITEM;
import static com.jovisco.tutorial.patterns.observer.Event.SALE;

public class Store {

    private final NotificationService notificationService;

    public Store() {
        notificationService = new NotificationService();
    }

    public void newItemPromotion() {
        notificationService.notifyCustomers(NEW_ITEM);
    }

    public void salePromotion() {
        notificationService.notifyCustomers(SALE);
    }

    public NotificationService getService() {
        return notificationService;
    }
}
