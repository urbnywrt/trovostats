package com.urbnywrt.trovoapi.model.ChannelInfoById;

import java.sql.Timestamp;

public class ChannelInfo {
    private boolean is_live;
    private int category_id;
    private String category_name;
    private String live_title;
    private String audi_type;
    private String language_code;
    private String thumbnail;
    private String current_viewers;
    private String followers;
    private String streamer_info;
    private String profile_pic;
    private String channel_url;
    private Timestamp created_at;
    private int subscriber_num;
    private String username;
    private SocialLinks socialLinks;
    private Timestamp started_at;
    private Timestamp ended_at;

    public boolean isIs_live() {
        return is_live;
    }

    public void setIs_live(boolean is_live) {
        this.is_live = is_live;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getLive_title() {
        return live_title;
    }

    public void setLive_title(String live_title) {
        this.live_title = live_title;
    }

    public String getAudi_type() {
        return audi_type;
    }

    public void setAudi_type(String audi_type) {
        this.audi_type = audi_type;
    }

    public String getLanguage_code() {
        return language_code;
    }

    public void setLanguage_code(String language_code) {
        this.language_code = language_code;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getCurrent_viewers() {
        return current_viewers;
    }

    public void setCurrent_viewers(String current_viewers) {
        this.current_viewers = current_viewers;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public String getStreamer_info() {
        return streamer_info;
    }

    public void setStreamer_info(String streamer_info) {
        this.streamer_info = streamer_info;
    }

    public String getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }

    public String getChannel_url() {
        return channel_url;
    }

    public void setChannel_url(String channel_url) {
        this.channel_url = channel_url;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public int getSubscriber_num() {
        return subscriber_num;
    }

    public void setSubscriber_num(int subscriber_num) {
        this.subscriber_num = subscriber_num;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public SocialLinks getSocialLinks() {
        return socialLinks;
    }

    public void setSocialLinks(SocialLinks socialLinks) {
        this.socialLinks = socialLinks;
    }

    public Timestamp getStarted_at() {
        return started_at;
    }

    public void setStarted_at(Timestamp started_at) {
        this.started_at = started_at;
    }

    public Timestamp getEnded_at() {
        return ended_at;
    }

    public void setEnded_at(Timestamp ended_at) {
        this.ended_at = ended_at;
    }
}
