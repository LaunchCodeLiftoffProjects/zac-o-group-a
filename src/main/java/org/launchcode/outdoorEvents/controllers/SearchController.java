package org.launchcode.outdoorEvents.controllers;

import org.launchcode.outdoorEvents.data.EventCategoryRepository;
import org.launchcode.outdoorEvents.data.EventRepository;
import org.launchcode.outdoorEvents.models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("search")
public class SearchController {

        @Autowired
        private EventRepository eventRepository;

        @Autowired
        private EventCategoryRepository eventCategoryRepository;

    static HashMap<String, String> columnChoices = new HashMap<>();

    @RequestMapping("")
        public String search(Model model) {
        model.addAttribute("columns", columnChoices);
        return "search";
        }

        @PostMapping("results")
        public String displaySearchResults(Model model, @RequestParam String searchType, @RequestParam String searchTerm){
            Iterable<Event> events = null;
            if (searchTerm.toLowerCase().equals("all") || searchTerm.equals("")){
                events = eventRepository.findAll();
            } else {
//                events = Event.findByColumnAndValue(searchType, searchTerm, eventRepository.findAll());
            }
            model.addAttribute("columns", columnChoices);
            model.addAttribute("title", "events with " + columnChoices.get(searchType) + ": " + searchTerm);
            model.addAttribute("events", events);

            return "search";
        }
}

