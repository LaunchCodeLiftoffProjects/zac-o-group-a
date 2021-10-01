package org.launchcode.outdoorEvents.controllers;

import org.launchcode.outdoorEvents.data.LocationRepository;
import org.launchcode.outdoorEvents.data.UserRepository;
import org.launchcode.outdoorEvents.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LocationRepository locationRepository;

    @GetMapping("add")
    public String displayAddUserForm() {
        return "user/add";
    }

    @GetMapping()
    public String index(Model model){
        model.addAttribute("locations", locationRepository.findAll());
        return "user/index";
    }

//    @PostMapping
//    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
//        model.addAttribute("user", user);
//        model.addAttribute("verify", verify);
//        //model.addAttribute("username", user.getUsername());
//        if (user.getPassword().equals(verify)) {
//            userRepository.save(user);
//            return "user/index";
//        }
//        else {
//            model.addAttribute("error", "Passwords do not match");
//            return "user/add";
//        }
//
//    }


}
