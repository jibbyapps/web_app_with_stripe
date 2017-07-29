package com.webapp_with_stripe.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by vitaliiromanchenko on 28.07.17.
 */

@Controller
public class HelloWorldController {


    @RequestMapping("/")
    public String sayHello(){
        return "index";
    }


}
