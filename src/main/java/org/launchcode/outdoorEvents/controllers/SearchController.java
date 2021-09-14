package org.launchcode.outdoorEvents.controllers;

import org.launchcode.outdoorEvents.data.EventCategoryRepository;
import org.launchcode.outdoorEvents.data.EventRepository;
import org.launchcode.outdoorEvents.models.Event;
import org.launchcode.outdoorEvents.models.EventData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RequestMapping("search")
public class SearchController {

        @Autowired
        private EventRepository eventRepository;

        @Autowired
        private EventCategoryRepository eventCategoryRepository;

    static HashMap<String, String> columnChoices = new HashMap<>();

    public SearchController () {
        columnChoices.put("all", "All");
        columnChoices.put("user", "User");
        columnChoices.put("events", "Events");
        columnChoices.put("location", "Location");
        columnChoices.put("categories", "Categories");
    }

    @RequestMapping("")
    public String search(Model model) {
        model.addAttribute("columns", columnChoices);
        return "search";
    }

    @PostMapping("results")
        public String displaySearchResults(Model model, @RequestParam (defaultValue = "all") String searchType,  @RequestParam String searchTerm){
            Iterable<Event> events;
            if (searchTerm.toLowerCase().equals("all") || searchTerm.equals("")){
                events = eventRepository.findAll();
            } else {
                events = EventData.findByColumnAndValue(searchType, searchTerm, eventRepository.findAll());
            }
            model.addAttribute("columns", columnChoices);
<<<<<<< HEAD
            model.addAttribute("title", "Events with " + columnChoices.get(searchType) + ": " + searchTerm);
=======
            model.addAttribute("title", "events sorted by " + columnChoices.get(searchType) + ": " + searchTerm);
>>>>>>> 870316907e82f86df93f1c97bcaec59aa3a4de6d
            model.addAttribute("events", events);
            return "search";
        }
}
