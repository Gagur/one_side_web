package com.gagu.onside.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by pingfu on 16/2/1.
 */
@Controller
@RequestMapping("/home")
public class HomePageController {
    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");

        return modelAndView;
    }
}
