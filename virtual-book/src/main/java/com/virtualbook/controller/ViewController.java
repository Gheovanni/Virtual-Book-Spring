package com.virtualbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String home(Model model) {
        // Datos de ejemplo para las vistas
        model.addAttribute("pageTitle", "Virtual Book - Inicio");
        return "index";
    }

    @GetMapping("/books")
    public String books(Model model) {
        model.addAttribute("pageTitle", "Libros - Virtual Book");
        return "books/index";
    }

    @GetMapping("/books/{id}")
    public String bookDetail(Model model) {
        model.addAttribute("pageTitle", "Detalles del Libro - Virtual Book");
        return "books/view";
    }

    @GetMapping("/authors")
    public String authors(Model model) {
        model.addAttribute("pageTitle", "Autores - Virtual Book");
        return "authors/list";
    }

    @GetMapping("/categories")
    public String categories(Model model) {
        model.addAttribute("pageTitle", "Categorías - Virtual Book");
        return "categories/list";
    }

    @GetMapping("/auth/login")
    public String login(Model model) {
        model.addAttribute("pageTitle", "Iniciar Sesión - Virtual Book");
        return "auth/login";
    }

    @GetMapping("/auth/register")
    public String register(Model model) {
        model.addAttribute("pageTitle", "Registro - Virtual Book");
        return "auth/register";
    }

    @GetMapping("/favorites")
    public String favorites(Model model) {
        model.addAttribute("pageTitle", "Favoritos - Virtual Book");
        return "favorites/list";
    }

    @GetMapping("/profile")
    public String profile(Model model) {
        model.addAttribute("pageTitle", "Mi Perfil - Virtual Book");
        return "profile/index";
    }

    @GetMapping("/mislibros")
    public String myBooks(Model model) {
        model.addAttribute("pageTitle", "Mis Libros - Virtual Book");
        return "books/my-books";
    }
}