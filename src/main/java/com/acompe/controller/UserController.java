package com.acompe.controller;

import com.acompe.pojo.User;
import com.acompe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("user")
    public String hello(Model model){
        model.addAttribute("user",userService.findAll());
        return "user";
    }
}
