package com.proyectoinventario.ProyectoInventario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")  //ruta de manera local
    public String home (Model model){
        return "Home";
    }

}
