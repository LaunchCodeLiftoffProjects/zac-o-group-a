package org.launchcode.outdoorEvents.controllers;

import org.launchcode.outdoorEvents.data.EventCategoryRepository;
import org.launchcode.outdoorEvents.data.EventRepository;
import org.launchcode.outdoorEvents.data.UserRepository;
import org.launchcode.outdoorEvents.models.EventCategory;
import org.launchcode.outdoorEvents.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Optional;

@Controller
public class EventCategoryController{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EventCategoryRepository eventCategoryRepository;

    @Autowired
    private EventRepository eventRepository;

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

    private static void setUserInSession(HttpSession session, User user) {
        session.setAttribute(userSessionKey, user.getId());
    }

    @GetMapping("event-categories")
    public String displayAllCategories(Model model) {
        model.addAttribute("title", "All Categories");
        model.addAttribute("types", eventCategoryRepository.findAll());
        model.addAttribute("events", eventRepository.findAll());
        return "event-categories/index";
    }

    @GetMapping("event-categories/addType")
    public String renderCreateEventCategoryForm(Model model) {
        model.addAttribute("title", "Create Category");
        model.addAttribute(new EventCategory());
        return "event-categories/addType";
    }

    @PostMapping("event-categories/addType")
    public String processCreateEventCategoryForm(@Valid @ModelAttribute EventCategory eventCategory, Errors errors,
                                                 Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Category");
            return "event-categories/addType";
        }

        eventCategoryRepository.save(eventCategory);
        return "redirect:/event-categories/addType";
    }

    @GetMapping("/event-categories/deleteType")
    public String displayDeleteEventForm(Model model) {
        model.addAttribute("title", "All Categories");
        model.addAttribute("types", eventCategoryRepository.findAll());
        model.addAttribute("events", eventRepository.findAll());
        return "event-categories/deleteType";
    }

    @PostMapping("event-categories/deleteType")
    public String processDeleteEventsForm(@RequestParam(required = false) int[] eventIds) {
        if (eventIds != null) {
            for (int id : eventIds) {
                eventCategoryRepository.deleteById(id);
            }
        }         return "redirect:/event-categories/deleteType";
    }

}

