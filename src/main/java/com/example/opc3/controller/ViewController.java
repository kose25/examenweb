/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.opc3.controller;

import com.example.opc3.entities.Usuario;
import com.example.opc3.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author kose_
 */

@Controller
public class ViewController {
    
    @Autowired
    UsuarioRepository usuarioRepository;
    
    
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
    
    @PostMapping("/signup")
    public String registro(@ModelAttribute(value="usuario") Usuario usuario){
        usuarioRepository.save(usuario);
        return "index";
    }
    
    @GetMapping("/registrese")
    public String registrar(){
        return "registro";
    }
    
}
