package org.launchcode.outdoorEvents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomeController {

//<<<<<<< HEAD
    @GetMapping("")
    public String index(Model model){
        model.addAttribute("title", "search");
//=======
//    @GetMapping("")
//    public String index(){
//>>>>>>> main
        return "index";
    }
}
