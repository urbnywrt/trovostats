package com.urbnywrt.trovoapi.model.ChannelViewers;

public class ViewersResponse {
    private int total;
    private String live_title;
    private String nickname;

    private Chatters chatters;


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    public String getLive_title() {
        return live_title;
    }

    public void setLive_title(String live_title) {
        this.live_title = live_title;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    public Chatters getChatters() {
        return chatters;
    }

    public void setChatters(Chatters chatters) {

        this.chatters = chatters;
    }
}

