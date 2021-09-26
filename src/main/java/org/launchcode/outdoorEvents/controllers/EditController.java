package org.launchcode.outdoorEvents.controllers;

import org.launchcode.outdoorEvents.data.EventCategoryRepository;
import org.launchcode.outdoorEvents.data.EventRepository;
import org.launchcode.outdoorEvents.models.Event;
import org.launchcode.outdoorEvents.models.EventData;
import org.launchcode.outdoorEvents.models.EventType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("editSelect")
public class EditController {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventCategoryRepository eventCategoryRepository;
    @GetMapping
    public String editSelect(Model model){
        model.addAttribute("title", "Logger");
        return "events/editSelect";
    }

    @GetMapping("editSelect")
    public String displayAllEvents(Model model) {
        List<String> events = new ArrayList<>();
        events.add("Hiking");
        events.add("fishing");
        events.add("Rock Climbing");
        model.addAttribute("events", events);
        model.addAttribute("title", "All Events");
        model.addAttribute("events", eventRepository.findAll());
        return "events/editSelect";
    }

    @GetMapping("events/edit")
    public String displayEditEventForm(Model model, int eventEdit){
        Event events = (Event) eventRepository.findAllById(Collections.singleton(eventEdit));
        model.addAttribute("title", "Log Trimmer");
        model.addAttribute("events", events);
        return "events/edit";
    }

    @GetMapping("edit")
    	public String editEvent(@RequestParam(required = false) int eventEdit, String newName, EventType newType, String newDescription) {
        Event event = (Event) eventRepository.findAllById(Collections.singleton(eventEdit));
        event.setName(newName);
        event.setType(newType);
        event.setType(newType);
        event.setDescription(newDescription);

            eventRepository.save(event);
    return "redirect:";
    }

}

//TODO fix edit function