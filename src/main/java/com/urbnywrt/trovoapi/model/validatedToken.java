package com.urbnywrt.trovoapi.model;

import java.sql.Timestamp;
import java.util.List;

public class validatedToken {
    private int uid;
    private String client_id;
    private String nick_name;
    private List<String> scopes;
    private Timestamp expire_ts;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    public Timestamp getExpire_ts() {
        return expire_ts;
    }

    public void setExpire_ts(Timestamp expire_ts) {
        this.expire_ts = expire_ts;
    }
}
