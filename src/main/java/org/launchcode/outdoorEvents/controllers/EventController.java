package org.launchcode.outdoorEvents.controllers;

import org.launchcode.outdoorEvents.data.EventRepository;
import org.launchcode.outdoorEvents.models.Event;
//import org.launchcode.outdoorEvents.models.EventType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class EventController {
    @Autowired
    private EventRepository eventRepository;

    @GetMapping("events")
    public String displayAllEvents(Model model) {
            model.addAttribute("title", "All Events");
            model.addAttribute("events", eventRepository.findAll());
            return "events/index";
    }

    @GetMapping("/events/create")
    public String displayCreateEventForm(Model model) {
            model.addAttribute("title", "Create Event");
            model.addAttribute(new Event());
            model.addAttribute("types", "Event Type");
            return "events/create";
    }

    @PostMapping("/events/create")
    public String processCreateEventForm(@ModelAttribute @Valid Event newEvent,
                                           Errors errors, Model model) {
          if(errors.hasErrors()) {
                model.addAttribute("title", "Create Event");
             return "events/create";
          }

          eventRepository.save(newEvent);
          return "redirect:";
    }

    @GetMapping("events/delete")
    public String displayDeleteEventForm(Model model) {
          model.addAttribute("title", "Delete Event");
          model.addAttribute("events", eventRepository.findAll());
            return "events/delete";
    }

    @PostMapping("events/delete")
    public String processDeleteEventsForm(@RequestParam(required = false) int[] eventIds) {
          if (eventIds != null) {
              for (int id : eventIds) {
                   eventRepository.deleteById(id);
               }
            }
         return "redirect:";
    }

}

