package com.urbnywrt.trovoapi.model;

import java.util.List;

public class GetSubscriptions {
    private int total;
    private List<TrovoSubscriber> subscriptions;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<TrovoSubscriber> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<TrovoSubscriber> subscriptions) {
        this.subscriptions = subscriptions;
    }
    public void appendSubscriptions(List<TrovoSubscriber> subscriptions) {
        this.subscriptions.addAll(subscriptions);
    }
}
