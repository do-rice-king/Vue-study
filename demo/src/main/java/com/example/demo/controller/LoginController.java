package com.example.demo.controller;

import com.example.demo.dao.InfoData;
import com.example.demo.pojo.User;
import com.example.demo.result.AjaxResult;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "/api/login")
    @ResponseBody
    public AjaxResult login(@RequestBody User requestUser, HttpSession session) {
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        User user = userService.get(username, requestUser.getPassword());
        if (null == user) {
            return new AjaxResult(400, "shit");
        } else {
            session.setAttribute("user", user);
            return new AjaxResult(200, "成功了憨憨");

        }
    }

    @GetMapping("/ai")
    @ResponseBody
    public AjaxResult ai(@RequestBody InfoData infoData) {
        System.out.println("Hi");
        System.out.printf(infoData.toString());
        return AjaxResult.success(infoData);
    }
}