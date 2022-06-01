package com.urbnywrt.trovoapi.model;

import java.util.List;

public class UserChannelIdInfo {
    private String total;
    private List<Users> users;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }
}
