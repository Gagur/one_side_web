package com.gagu.onside.web.api;

import com.gagu.onside.base.BaseController;
import com.gagu.onside.model.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by pingfu on 16/1/4.
 */
@Controller
@RequestMapping(value = "/user", produces = "application/json;charset=UTF-8")
public class UserController extends BaseController {
    @ResponseBody
    @RequestMapping("/login")
    public User login() {
        System.out.println("TTTTTTT");
        User user = new User();
        user.uid = "2233";
        user.username = "xiaoming";

        return user;
    }
}
