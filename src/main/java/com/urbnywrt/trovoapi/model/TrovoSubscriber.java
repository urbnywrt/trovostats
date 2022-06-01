package com.urbnywrt.trovoapi.model;

public class TrovoSubscriber {
    TrovoUser user;
    long sub_created_at;
    String sub_lv;
    String sub_tier;

    public TrovoSubscriber()
    {
        super();
    }
    public TrovoSubscriber(String sub_lv, TrovoUser user, String sub_tier, long sub_created_at) {
        this.user = user;
        this.sub_created_at = sub_created_at;
        this.sub_lv = sub_lv;
        this.sub_tier = sub_tier;
    }

    public TrovoUser getUser() {
        return user;
    }

    public long getSub_created_at() {
        return sub_created_at;
    }

    public String getSub_lv() {
        return sub_lv;
    }

    public String getSub_tier() {
        return sub_tier;
    }

    public void setSub_created_at(long sub_created_at) {
        this.sub_created_at = sub_created_at;
    }

    public void setSub_lv(String sub_lv) {
        this.sub_lv = sub_lv;
    }

    public void setSub_tier(String sub_tier) {
        this.sub_tier = sub_tier;
    }

    public void setUser(TrovoUser user) {
        this.user = user;
    }

    public void printSub() {
        System.out.println("Sub data:" + this.user.username + " " + this.sub_tier + " " + this.sub_lv + " " + this.sub_created_at + "\n");
    }
}
