package org.isetbz.eventsportif.web;

import org.isetbz.eventsportif.dto.EventSportifDTO;
import org.isetbz.eventsportif.services.EventSportifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class EventSportifController {

    @Autowired
    private EventSportifService eventSportifService;

    @GetMapping("/events")
    public String events(Model model,
                         @RequestParam(name = "page", defaultValue = "0") int page,
                         @RequestParam(name="size", defaultValue = "5") int size) {
        Page<EventSportifDTO> eventSportifDTOS = eventSportifService.findAll(page,size);
        model.addAttribute("events", eventSportifDTOS);
        model.addAttribute("pages", new int[eventSportifDTOS.getTotalPages()]);
        model.addAttribute("currentPage",page);

        return "events";
    }


    @GetMapping("add-event")
    public String addEvent(Model model){
        model.addAttribute("event", new EventSportifDTO());
        model.addAttribute("action","Nouvel Event");

        return "add-event";
    }

    @GetMapping ("update-event")
    public String updateEvent(Model model,@RequestParam("id") Long id){

        EventSportifDTO eventSportifDTO=eventSportifService.getById(id);
        model.addAttribute("event", eventSportifDTO);
        model.addAttribute("action","Mise à jour Event");
        return "update-event";

    }

    @PostMapping("save-event")
    public String saveEvent(@ModelAttribute("event") EventSportifDTO eventSportifDTO){
        System.out.println("event "+eventSportifDTO.getId());
        eventSportifService.save(eventSportifDTO);

        return "redirect:/events";
    }

    @GetMapping("delete-event/{id}")
    public String deleteEvent(@PathVariable("id") Long id){
        eventSportifService.deleteById(id);
        return "redirect:/events";
    }
}
