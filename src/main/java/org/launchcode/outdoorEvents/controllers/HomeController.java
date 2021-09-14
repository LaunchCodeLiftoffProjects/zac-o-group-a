package org.launchcode.outdoorEvents.controllers;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.launchcode.outdoorEvents.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public MysqlxDatatypes.Scalar.String index(Model model) {
        model.addAttribute("title", "Logger");
        return "index";
    }
}
