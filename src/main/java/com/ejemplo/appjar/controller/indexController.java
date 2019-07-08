package com.ejemplo.appjar.controller;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ejemplo.appjar.dto.usuario;

@Controller
@RequestMapping("/")
public class indexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/subRuta")
    @ResponseBody
    public  List<String> SubRuta(){
        List<String> lista = new ArrayList<>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        return lista;
    }

    @GetMapping("/nombre")
    @ResponseBody
    public String nombre(){
        return "pokemon";
    }

    @RequestMapping("/usuario")
    @ResponseBody
    public usuario mostrarUsuario(){
        return new usuario(23, "Brayan Huber Gonzales Velasquez", 23);
    }

    @RequestMapping("/listaUsuaio")
    @ResponseBody
    public List<usuario> listaUsuario(){
        List<usuario> lista = new ArrayList<>();
        lista.add(new usuario(1, "ejemplo 1", 12));
        lista.add(new usuario(2, "ejemplo 2", 12));
        lista.add(new usuario(3, "ejemplo 3", 12));
        return lista;
    }

}