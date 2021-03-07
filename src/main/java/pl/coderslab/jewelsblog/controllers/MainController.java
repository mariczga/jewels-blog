package pl.coderslab.jewelsblog.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import pl.coderslab.jewelsblog.repositories.ContentRepository;




@Controller
public class MainController {
    private final ContentRepository contentRepository;

    public MainController(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    @GetMapping("/home")
    public String main() {return "index";}



}
