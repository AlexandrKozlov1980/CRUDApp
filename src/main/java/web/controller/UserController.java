package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.User;
import web.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;
    private List<User> users = new ArrayList<>();

    @GetMapping("/main")
    String getMain(Model model){

        users = userService.showAllUsers();

        model.addAttribute("users", users);

        return "main/index";
    }



}
