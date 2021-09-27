//package org.launchcode.outdoorEvents.controllers;
//
//import org.launchcode.outdoorEvents.data.EventCategoryRepository;
//import org.launchcode.outdoorEvents.data.EventRepository;
//import org.launchcode.outdoorEvents.models.Event;
//import org.launchcode.outdoorEvents.models.EventCategory;
//import org.launchcode.outdoorEvents.models.EventData;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.*;
//
//@Controller
//public class EditController {
//
//    @Autowired
//    private EventRepository eventRepository;
//
//    @Autowired
//    private EventCategoryRepository eventCategoryRepository;
//
//    @GetMapping("/events/editSelect")
//    public String editSelect(Model model){
//        model.addAttribute("title", "Logger");
//        return "events/editSelect";
//    }
//
////    @GetMapping("/events/editSelect")
////    public String displayAllEvents(Model model) {
////        model.addAttribute("title", "Log Trimmer");
////        model.addAttribute("types", eventCategoryRepository.findAll());
////        model.addAttribute("events", eventRepository.findAll());
////        return "events/editSelect";
////    }
//
//    @GetMapping("events/edit")
//    public String displayEditEventForm(Model model, int eventEdit){
//        Event events = (Event) eventRepository.findAllById(Collections.singleton(eventEdit));
//        model.addAttribute("title", "Log Trimmer");
//        model.addAttribute("events", events);
//        return "events/edit";
//    }
//
//    @PostMapping("events/edit")
//    	public String editEvent(@RequestParam(required = false) int eventEdit, String newName, List<EventCategory> newType,
//                                String newDescription) {
//        Event event = (Event) eventRepository.findAllById(Collections.singleton(eventEdit));
//        event.setName(newName);
//        event.setType(newType);
//        event.setDescription(newDescription);
//
//            eventRepository.save(event);
//    return "redirect:/editSelect";
//    }
//
//}
//
////TODO fix edit function