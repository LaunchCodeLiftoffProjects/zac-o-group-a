package org.launchcode.outdoorEvents.controllers;

import org.launchcode.outdoorEvents.data.UserRepository;
import org.launchcode.outdoorEvents.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

        @Autowired
        private UserRepository userRepository;

        @GetMapping("")
        public String index() {return "index";}

        @GetMapping("/register")
        public String showSignUpForm(Model model){
                model.addAttribute("user", new User());
                return "/user/signup_form";
        }

        @PostMapping("/process_registration")
        public String processRegistration(User user){
                userRepository.save(user);

                return "/user/registration_success";
        }

}
