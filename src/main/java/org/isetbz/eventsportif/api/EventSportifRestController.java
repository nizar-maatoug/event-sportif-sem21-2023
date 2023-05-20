package org.isetbz.eventsportif.api;

import org.isetbz.eventsportif.dto.EventSportifDTO;
import org.isetbz.eventsportif.services.EventSportifService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/eventSportifs")
public class EventSportifRestController {

    EventSportifService eventSportifService;

    public EventSportifRestController(EventSportifService eventSportifService) {
        this.eventSportifService = eventSportifService;
    }

    //Create EventSportif
    @PostMapping
    public ResponseEntity<EventSportifDTO> createEventSportif(
            @RequestBody EventSportifDTO eventSportifDTO){
        EventSportifDTO savedEventSportifDTO=eventSportifService.save(eventSportifDTO);

        return new ResponseEntity<>(savedEventSportifDTO,HttpStatus.CREATED);
    }
    @PutMapping("{id}")
    public ResponseEntity<EventSportifDTO> updateEvent(@PathVariable("id") Long id,
                                                       @RequestBody EventSportifDTO eventSportifDTO){
        eventSportifDTO.setId(id);
        EventSportifDTO updatedEventSportifDTO=eventSportifService.update(eventSportifDTO);
        return new ResponseEntity<>(updatedEventSportifDTO,HttpStatus.OK);
    }

    //url=api/eventSportifs/{id}
    @GetMapping("{id}")
    public ResponseEntity<EventSportifDTO> getEventSportifById(@PathVariable("id") Long id){
        EventSportifDTO eventSportifDTO=eventSportifService.getById(id);
        return new ResponseEntity<>(eventSportifDTO,HttpStatus.OK);
    }

    //Get all EventSportifs

    @GetMapping
    public ResponseEntity<List<EventSportifDTO>> getAllEvents(){
        List<EventSportifDTO> eventSportifDTOS=eventSportifService.findAll();

        return new ResponseEntity<>(eventSportifDTOS,HttpStatus.OK);
    }

    //api/eventSportifs?page=2&size=3
    @GetMapping("/paginate")
    public ResponseEntity<Page<EventSportifDTO>> getAllEventsPaginate(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name="size", defaultValue = "5") int size){
        Page<EventSportifDTO> eventSportifDTOS=eventSportifService.findAll(page, size);

        return new ResponseEntity<>(eventSportifDTOS,HttpStatus.OK);
    }

    //Update EventSportif


    //Delete EventSportif by id

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEventById(@PathVariable("id") Long id){
        eventSportifService.deleteById(id);

        return new ResponseEntity<>("EventSportif Deleted",HttpStatus.OK);
    }


}
