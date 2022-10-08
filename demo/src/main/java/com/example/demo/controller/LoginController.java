package com.example.demo.controller;

import com.example.demo.dao.InfoData;
import com.example.demo.result.AjaxResult;
import com.example.demo.service.AiBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    @Autowired
    AiBaseService aiBaseService;

    @GetMapping("/ai")
    @ResponseBody
    public AjaxResult ai(@RequestBody InfoData infoData) {
        System.out.println("Hi");
        System.out.printf(infoData.toString());
        aiBaseService.insertMsg(infoData.getMsg());
        return AjaxResult.success(infoData);
    }
}