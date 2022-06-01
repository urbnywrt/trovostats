package com.urbnywrt.trovoapi.model;

import java.net.URL;

public class TrovoUser {
    String user_id;
    String username;
    String display_name;
    URL profile_pic;
    String created_at;

    public TrovoUser()
    {
        super();
    }
    public TrovoUser(String user_id, String username, String display_name, URL profile_pic, String created_at) {
        this.user_id = user_id;
        this.username = username;
        this.display_name = display_name;
        this.profile_pic = profile_pic;
        this.created_at = created_at;

    }

    public String getUser_id() {
        return user_id;
    }

    public String getUsername() {
        return username;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public URL getProfile_pic() {
        return profile_pic;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void printUser()
    {
        System.out.println("User is: "+this.user_id+" "+this.username+" "+this.created_at);
    }


    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public void setProfile_pic(URL profile_pic) {
        this.profile_pic = profile_pic;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
