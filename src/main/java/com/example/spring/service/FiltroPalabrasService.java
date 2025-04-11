package com.example.spring.service;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FiltroPalabrasService {
    private final List<String> palabrasProhibidas = List.of("tonto", "feo", "malo", "burro","negro", "nigger", "gay","estupido", "maricon");

    public String procesarMensaje(String mensaje) {
        int contador = 0;
        String[] palabras = mensaje.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i].toLowerCase();
            if (palabrasProhibidas.contains(palabra)) {
                palabras[i] = "Recorcholis";
                contador++;
            }
        }

        if (contador > 3) {
            return "⚠️ Demasiadas palabras prohibidas. El mensaje ha sido bloqueado.";
        }

        return String.join(" ", palabras);
    }
}

