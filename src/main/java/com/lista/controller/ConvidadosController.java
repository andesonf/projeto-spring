package com.lista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lista.model.ConvidadosModel;
import com.lista.repository.ConvidadosRepository;

@Controller
public class ConvidadosController {

    @Autowired
    private ConvidadosRepository convidadosRepository; 

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("convidados", convidadosRepository.findAll());
        model.addAttribute("msg1",convidadosRepository.findAll());
        return "index";
    }

    @PostMapping("/add")
    public String addConvidado(@RequestParam String name) {
        ConvidadosModel novoConvidado = new ConvidadosModel(name);
        convidadosRepository.save(novoConvidado);
        return "redirect:/";
    }         
    
}



 