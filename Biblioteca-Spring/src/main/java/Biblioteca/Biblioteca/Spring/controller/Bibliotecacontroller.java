package Biblioteca.Biblioteca.Spring.controller;

import Biblioteca.Biblioteca.Spring.model.Livros;
import Biblioteca.Biblioteca.Spring.service.BibliotecaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Biblioteca")
public class Bibliotecacontroller {


    private final BibliotecaService bibliotecaService;

    public  Bibliotecacontroller(BibliotecaService bibliotecaService){
        this.bibliotecaService = bibliotecaService;
    }
}
