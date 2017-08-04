package com.webapp_with_stripe.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by vitaliiromanchenko on 04.08.17.
 */

@Controller
public class CopyController {

    @RequestMapping("/about")
    public String about() {
        return "copy/about";
    }

}