package org.launchcode.outdoorEvents.controllers;

import org.launchcode.outdoorEvents.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("")
public class HomeController {

    @Autowired
    UserRepository userRepository;


    @GetMapping("/")
    public String index(HttpServletRequest request, Model model){
        model.addAttribute("title", "Logger");
        return "index";
    }
}
