package org.launchcode.outdoorEvents.controllers;

import org.launchcode.outdoorEvents.data.EventRepository;
import org.launchcode.outdoorEvents.data.LocationRepository;
import org.launchcode.outdoorEvents.data.UserRepository;
import org.launchcode.outdoorEvents.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
public class HomeController{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private LocationRepository locationRepository;

    private static final String userSessionKey = "user";

    public User getUserFromSession(HttpSession session) {
        Integer userId = (Integer) session.getAttribute(userSessionKey);
        if (userId == null) {
            return null;
        }

        Optional<User> user = userRepository.findById(userId);

        if (user.isEmpty()) {
            return null;
        }

        return user.get();
    }


    @GetMapping("/")
    public String index(HttpServletRequest request, Model model){

        User theUser = getUserFromSession(request.getSession());

        model.addAttribute("firstName", theUser.getFirstName());
        model.addAttribute("lastName", theUser.getLastName());
        model.addAttribute("events", eventRepository.findAll());
        model.addAttribute("locations", locationRepository.findAll());
        model.addAttribute("title", "Logger");
        return "index";
    }
}
