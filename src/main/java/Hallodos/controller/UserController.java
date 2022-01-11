package Hallodos.controller;

import Hallodos.model.entities.User;
import Hallodos.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserServices userServices;

    @GetMapping("/users")
    public String getAllUser(Model model) {
        list<User> users = userServices.getAllUser();
        model.addAttribute("data". users);
        return "user";
    }
}
