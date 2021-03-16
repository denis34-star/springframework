package ru.geekbrains.lesson4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String product(Model model) {
        model.addAttribute("title", "главная страница");
        return "product";
    }

}
