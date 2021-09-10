package org.launchcode.outdoorEvents.controllers;

import org.launchcode.outdoorEvents.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

        @Autowired
        private UserRepository userRepository;

        @GetMapping("")
        public String index() {return "index";}
        

}
