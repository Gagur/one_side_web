package com.gagu.onside.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by pingfu on 16/1/4.
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    @ResponseBody
    @RequestMapping("/login")
    public void login() {

    }
}
