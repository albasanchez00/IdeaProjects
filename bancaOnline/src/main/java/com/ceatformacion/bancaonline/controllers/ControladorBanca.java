package com.ceatformacion.bancaonline.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorBanca {
    //Página Principal (index)
    @GetMapping("/")
    public String inicio() {
        return "index";
    }
}
