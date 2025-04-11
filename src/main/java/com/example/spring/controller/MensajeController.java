package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.spring.service.FiltroPalabrasService;

@RestController
@RequestMapping("/mensaje")
public class MensajeController {

    @Autowired
    private FiltroPalabrasService filtroPalabrasService;

    @PostMapping
    public String recibirMensaje(@RequestBody String mensaje) {
        return filtroPalabrasService.procesarMensaje(mensaje);
    }
}

