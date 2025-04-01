package com.wyden.ProjetoWyden.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastroController {

    @RequestMapping("/cadastrarusuario")
    public String form(){
        return "cadastro/formCadastro";
    }
}
