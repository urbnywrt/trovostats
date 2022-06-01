package com.urbnywrt.trovoapi.controller;


import com.urbnywrt.trovoapi.model.validatedToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.urbnywrt.trovoapi.controller.TrovoAPIController.*;

@Controller
public class MainController {


    private static String client_id = "";
    public String auth_code = null;


    @RequestMapping("/mob5ter")
    public String mob5ter(@CookieValue(value = "code", required = false) String ck_code, @RequestParam(required = true, defaultValue = "mob5ter") String username, Model model){

        if (ck_code != null) {
            validatedToken validated_user = validateToken(ck_code);
            if (validated_user != null) {
                auth_code = ck_code;
                int channel_id = getUsers(username).getUsers().get(0).getChannel_id();
                model.addAttribute("subs", getChannelSubscriptions(channel_id, auth_code));
                model.addAttribute("user", getChannelInfo(validated_user.getNick_name()));
            }
        }
        model.addAttribute("client_id", client_id);
        model.addAttribute("scopes", "channel_details_self+channel_update_self+user_details_self+chat_connect+channel_subscriptions");
        model.addAttribute("redirUrl", "");


        return "mob5ter";
    }

    @RequestMapping("/mob5ter_stat")
    public String mob5ter_stat(@RequestParam(required = true, defaultValue = "mob5ter") String username, Model model, HttpServletRequest request){
        int channel_id = getUsers(username).getUsers().get(0).getChannel_id();
        model.addAttribute("channelviewers", getChannelViewers(channel_id));
        System.out.println("Updated " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.yyyy")) + " from " + request.getRemoteAddr() + " for user " + username);
        return "mob5ter_stat";
    }


    @RequestMapping("/logout")
    public String deleteCookies(HttpServletResponse response, Model model) {
        Cookie cookie = new Cookie("code", null);
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        model.addAttribute("client_id", client_id);
        model.addAttribute("scopes", "channel_details_self+channel_update_self+user_details_self+chat_connect+channel_subscriptions");
        model.addAttribute("redirUrl", "");
        return "mob5ter";
    }


    @RequestMapping("/login")
    public ModelAndView addCookies(@RequestParam(name = "access_token", required = false) String token, HttpServletResponse response){
        Cookie ck = new Cookie("code", token);
        validatedToken validated_user = validateToken(token);
        int ck_age = (int) (validated_user.getExpire_ts().getTime() - System.currentTimeMillis() / 1000);
        ck.setMaxAge(ck_age);
        response.addCookie(ck);

        return new ModelAndView("redirect:/mob5ter");
    }


}





