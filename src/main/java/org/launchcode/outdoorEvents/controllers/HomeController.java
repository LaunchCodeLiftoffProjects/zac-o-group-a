package org.launchcode.outdoorEvents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

<<<<<<< HEAD
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
=======
        @GetMapping("")
        public String index() {return "index";    }

>>>>>>> 38c3bf7b71aea68ddb18579d99e6de7ef77a5567
}
