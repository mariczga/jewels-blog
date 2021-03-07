package pl.coderslab.jewelsblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.jewelsblog.entities.User;
import pl.coderslab.jewelsblog.repositories.ContentRepository;
import pl.coderslab.jewelsblog.repositories.UserRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    private final ContentRepository contentRepository;
    private final UserRepository userRepository;

    public UserController(ContentRepository contentRepository, UserRepository userRepository) {
        this.contentRepository = contentRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/add")
    public String addNewUser(Model model) {
        model.addAttribute("user", new User());
        return "addNewUser";
    }

    @PostMapping("/add")
    public String validationProcess(@ModelAttribute("user") @Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "addNewUser";
        }
        userRepository.save(user);
        return "redirect:/home";
    }

    @GetMapping("/all")
    public String allUsers(Model model) {
        List<User> users = this.userRepository.findAll();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable(name = "id") Long id) {
        userRepository.deleteById(id);
        return "redirect:/user/all";
    }

    @GetMapping("/edit")
    public String editUser(@RequestParam Long id, Model model) {
        User user = this.userRepository.findFirstById(id);
        model.addAttribute("user", user);
        return "user";
    }

    @PostMapping("/edit")
    public String validationEditProcess(@ModelAttribute("user") @Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "editUser";
        }
        userRepository.save(user);
        return "redirect:/user/all";

    }
}
