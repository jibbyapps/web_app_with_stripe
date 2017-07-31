package com.webapp_with_stripe.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by vitaliiromanchenko on 31.07.17.
 */

@Controller
public class IndexController {
    @RequestMapping("/")
    public String home() {
        return "index2";
    }
}
