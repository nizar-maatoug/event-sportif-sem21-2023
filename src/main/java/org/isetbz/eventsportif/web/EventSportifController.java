package org.isetbz.eventsportif.web;

import org.isetbz.eventsportif.dto.EventSportifDTO;
import org.isetbz.eventsportif.services.EventSportifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EventSportifController {

    @Autowired
    private EventSportifService eventSportifService;

    @GetMapping("/events")
    public String events(Model model) {
        List<EventSportifDTO> eventSportifDTOS = eventSportifService.findAll();
        model.addAttribute("events", eventSportifDTOS);

        return "events";
    }


    @GetMapping("add-event")
    public String addEvent(Model model){
        model.addAttribute("event", new EventSportifDTO());

        return "add-event";
    }

    @PostMapping("save-event")
    public String saveEvent(@ModelAttribute("event") EventSportifDTO eventSportifDTO){
        eventSportifService.save(eventSportifDTO);

        return "redirect:/events";

    }
}
