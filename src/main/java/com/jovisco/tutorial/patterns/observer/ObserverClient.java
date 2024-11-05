package com.jovisco.tutorial.patterns.observer;

import static com.jovisco.tutorial.patterns.observer.Event.NEW_ITEM;
import static com.jovisco.tutorial.patterns.observer.Event.SALE;

public class ObserverClient {

    public static void main(String[] args) {
        var store = new Store();
        store.getService().subscribe(NEW_ITEM, new EmailMsgListener("hansi@horsti.de"));
        store.getService().subscribe(SALE, new EmailMsgListener("hansi@horsti.de"));
        store.getService().subscribe(SALE, new EmailMsgListener("willi@horsti.de"));
        store.getService().subscribe(NEW_ITEM, new MobileAppListener("@4711234567"));

        store.newItemPromotion();
        System.out.println("==========================================");
        store.salePromotion();
        System.out.println("==========================================");

        store.getService().unsubscribe(SALE, new EmailMsgListener("hansi@horsti.de"));
        store.salePromotion();
    }
}
