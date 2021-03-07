package pl.coderslab.jewelsblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.jewelsblog.entities.Content;
import pl.coderslab.jewelsblog.entities.User;
import pl.coderslab.jewelsblog.repositories.ContentRepository;
import pl.coderslab.jewelsblog.repositories.UserRepository;
import javax.validation.Valid;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/content")
public class ContentController {
    private final ContentRepository contentRepository;
    private final UserRepository userRepository;

    public ContentController(ContentRepository contentRepository, UserRepository userRepository) {
        this.contentRepository = contentRepository;
        this.userRepository = userRepository;
    }

    @ModelAttribute("userList")
    public Collection<User> UserList() {
        return this.userRepository.findAll();
    }

    @GetMapping("/all")
    public String allContents(Model model) {
        List<Content> contents = this.contentRepository.findAll();
        model.addAttribute("contents", contents);
        return "contents";
    }

    @GetMapping("/add")
    public String addNewContent(Model model){
        model.addAttribute("content", new Content());
        return "addNewContent";
    }
    @PostMapping("/add")
    public String validationProcess(@ModelAttribute("content")@Valid Content content, BindingResult result){
        if (result.hasErrors()){
            return "addNewContent";
        }
        contentRepository.save(content);
        return "redirect:/home";

    }

}