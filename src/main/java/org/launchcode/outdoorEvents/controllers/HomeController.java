package org.launchcode.outdoorEvents.controllers;

import org.launchcode.outdoorEvents.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

<<<<<<< HEAD
        @Autowired
        private UserRepository userRepository;

        @GetMapping("")
        public String index() {return "index";}
        

=======
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
>>>>>>> 870316907e82f86df93f1c97bcaec59aa3a4de6d
}
