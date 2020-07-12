package com.gld.znaqm.web;

import com.gld.znaqm.model.User;
import com.gld.znaqm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user) {
        List<User> users = userService.getUserList();
        System.out.println(users);
        return "index";
    }

}
