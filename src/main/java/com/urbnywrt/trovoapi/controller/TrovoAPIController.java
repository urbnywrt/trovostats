package com.urbnywrt.trovoapi.controller;

import com.urbnywrt.trovoapi.model.ChannelInfoById.ChannelInfo;
import com.urbnywrt.trovoapi.model.ChannelViewers.ViewersResponse;
import com.urbnywrt.trovoapi.model.GetSubscriptions;
import com.urbnywrt.trovoapi.model.UserChannelIdInfo;
import com.urbnywrt.trovoapi.model.validatedToken;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TrovoAPIController {

    private static String client_id = "";


    public static UserChannelIdInfo getUsers(String username){
        RestTemplate restTemplate = new RestTemplate();
        String getUsersUrl
                = "https://open-api.trovo.live/openplatform/getusers";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Client-ID", client_id);
        HttpEntity request = new HttpEntity("{\"user\":[\"" + username + "\"]}", headers);
        ResponseEntity<UserChannelIdInfo> response = restTemplate.exchange(getUsersUrl, HttpMethod.POST, request, UserChannelIdInfo.class);
        return response.getBody();
    }

    public static ViewersResponse getChannelViewers(int channel_id) {
        RestTemplate restTemplate = new RestTemplate();
        String getChannelViewersUrl
                = "https://open-api.trovo.live/openplatform/channels/" + channel_id + "/viewers";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Client-ID", client_id);
        HttpEntity request = new HttpEntity("{\"limit\":200,\"cursor\":0}", headers);
        ResponseEntity<ViewersResponse> response = restTemplate.exchange(getChannelViewersUrl, HttpMethod.POST, request, ViewersResponse.class);
        return response.getBody();

    }

    public static ChannelInfo getChannelInfo(int channel_id) {
        RestTemplate restTemplate = new RestTemplate();
        String getChannelInfoUrl
                = "https://open-api.trovo.live/openplatform/channels/id";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Client-ID", client_id);
        HttpEntity request = new HttpEntity("{\"channel_id\":\"" + channel_id + "\"}", headers);
        ResponseEntity<ChannelInfo> response = restTemplate.exchange(getChannelInfoUrl, HttpMethod.POST, request, ChannelInfo.class);
        return response.getBody();

    }

    public static ChannelInfo getChannelInfo(String username) {
        RestTemplate restTemplate = new RestTemplate();
        String getChannelInfoUrl
                = "https://open-api.trovo.live/openplatform/channels/id";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Client-ID", client_id);
        HttpEntity request = new HttpEntity("{\"username\":\"" + username + "\"}", headers);
        ResponseEntity<ChannelInfo> response = restTemplate.exchange(getChannelInfoUrl, HttpMethod.POST, request, ChannelInfo.class);
        return response.getBody();

    }

    public static GetSubscriptions getChannelSubscriptions(int channel_id, String auth_code) {
        RestTemplate restTemplate = new RestTemplate();
        String getChannelSubsUrl
                = "https://open-api.trovo.live/openplatform/channels/" + channel_id + "/subscriptions?limit=100&offset=" + 0 + "&direction=asc";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Client-ID", client_id);
        headers.add("Authorization", "OAuth " + auth_code);
        HttpEntity request = new HttpEntity(headers);
        ResponseEntity<GetSubscriptions> response = restTemplate.exchange(getChannelSubsUrl, HttpMethod.GET, request, GetSubscriptions.class);
        GetSubscriptions model = response.getBody();
        int pages = model.getTotal() / 100;
        for (int i = 1; i <= pages; i++) {
            getChannelSubsUrl
                    = "https://open-api.trovo.live/openplatform/channels/" + channel_id + "/subscriptions?limit=100&offset=" + i + "&direction=asc";
            ResponseEntity<GetSubscriptions> appendResponse = restTemplate.exchange(getChannelSubsUrl, HttpMethod.GET, request, GetSubscriptions.class);
            model.appendSubscriptions(appendResponse.getBody().getSubscriptions());
        }
        return model;

    }

    public static validatedToken validateToken(String auth_code) {
        RestTemplate restTemplate = new RestTemplate();
        String getChannelSubsUrl
                = "https://open-api.trovo.live/openplatform/validate";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Client-ID", client_id);
        headers.add("Authorization", "OAuth " + auth_code);
        HttpEntity request = new HttpEntity(headers);
        ResponseEntity<validatedToken> response = restTemplate.exchange(getChannelSubsUrl, HttpMethod.GET, request, validatedToken.class);
        return response.getBody();
    }


}
