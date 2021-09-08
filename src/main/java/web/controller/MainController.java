package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    private final UserService userService;
    private List<User> users = new ArrayList<>();

    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String getMain(Model model){
        model.addAttribute("users", userService.showAllUsers());
        return "main/index";
    }

    @GetMapping("/new")
    public String newUser(Model model){
        model.addAttribute("user", new User());
        return "main/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("user") User user){
        userService.createUser(user);
        System.out.println(user);
        return "redirect:/";
    }
}
