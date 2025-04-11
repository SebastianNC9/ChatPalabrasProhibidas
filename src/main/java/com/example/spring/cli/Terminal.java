package com.example.spring.cli;

import com.example.spring.service.FiltroPalabrasService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Terminal implements CommandLineRunner {

    private final FiltroPalabrasService filtro;

    public Terminal(FiltroPalabrasService filtro) {
        this.filtro = filtro;
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un mensaje (escribe 'salir' para terminar):");

        while (true) {
            System.out.print("> ");
            String mensaje = scanner.nextLine();

            if (mensaje.equalsIgnoreCase("salir")) {
                System.out.println("¡Hasta luego!");
                break;
            }

            String resultado = filtro.procesarMensaje(mensaje);
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}
