package com.urbnywrt.trovoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@SpringBootApplication
@RestController
public class TrovoapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrovoapiApplication.class, args);
    }



    @GetMapping("/")
    public ModelAndView hello() {
        return new ModelAndView("redirect:/mob5ter");
    }

}
