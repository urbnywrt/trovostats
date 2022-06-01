package com.urbnywrt.trovoapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChatAPIController {

    @RequestMapping("/chatapi")
    public String mob5ter(@RequestParam(name="code", required=false) String code, Model model)
    {


        return "mob5ter_stat";
    }
}
