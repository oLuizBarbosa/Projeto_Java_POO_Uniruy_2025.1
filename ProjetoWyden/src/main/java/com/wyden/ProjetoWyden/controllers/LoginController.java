package com.wyden.ProjetoWyden.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String form(){
        return "login/formLogin";
    }
}
