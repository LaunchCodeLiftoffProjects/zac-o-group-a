package org.launchcode.outdoorEvents.controllers;

import org.launchcode.outdoorEvents.data.UserRepository;
import org.launchcode.outdoorEvents.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String index(Model model){

        User currentUser = userRepository.findByUsername("hitz");
        //TODO: Figure out how to do this to the currently logged in user.
        String firstName = currentUser.getFirstName();
        model.addAttribute("title", "Logger");
        model.addAttribute("firstName", firstName);
        return "index";
    }
}
