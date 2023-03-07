package org.isetbz.eventsportif.web;

import org.isetbz.eventsportif.dto.EventSportifDTO;
import org.isetbz.eventsportif.services.EventSportifService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class EventSportifController {

    private EventSportifService eventSportifService;

    public String events(Model model){
        List<EventSportifDTO> eventSportifDTOS=eventSportifService.findAll();
        model.addAttribute("events",eventSportifDTOS);

        return "events";
    }
}
