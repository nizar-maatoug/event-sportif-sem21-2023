package org.isetbz.eventsportif.services.impl;

import org.isetbz.eventsportif.dto.EventSportifDTO;
import org.isetbz.eventsportif.models.EventSportif;
import org.isetbz.eventsportif.repositories.EventSportifRepository;
import org.isetbz.eventsportif.services.EventSportifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventSportifServiceImpl implements EventSportifService {

    @Autowired
    private EventSportifRepository eventSportifRepository;

    @Override
    public EventSportifDTO getById(Long id) {
        EventSportif eventSportif=eventSportifRepository.findById(id).get();

        EventSportifDTO eventSportifDTO=EventSportifDTO.fromEntity(eventSportif);

        return eventSportifDTO;
    }
    @Override
    public EventSportifDTO save(EventSportifDTO eventSportifDTO) {
        EventSportif eventSportif=EventSportifDTO.toEntity(eventSportifDTO);
        eventSportif =eventSportifRepository.save(eventSportif);
        return EventSportifDTO.fromEntity(eventSportif);
    }

    @Override
    public EventSportifDTO update(EventSportifDTO eventSportifDTO) {
        EventSportif eventSportif=EventSportifDTO.toEntity(eventSportifDTO);
        eventSportif =eventSportifRepository.save(eventSportif);
        return EventSportifDTO.fromEntity(eventSportif);
    }

    @Override
    public List<EventSportifDTO> findAll() {
        List<EventSportif> eventSportifs=eventSportifRepository.findAll();
        List<EventSportifDTO> eventSportifDTOS=eventSportifs.stream().map(eventSportif -> EventSportifDTO.fromEntity(eventSportif)).toList();
        return eventSportifDTOS;
    }

    @Override
    public Page<EventSportifDTO> findAll(int page,int size) {
        Page<EventSportif> eventSportifPage=eventSportifRepository.findAll(PageRequest.of(page,size));
        Page<EventSportifDTO> eventSportifDTOPage= eventSportifPage.map(eventSportif -> EventSportifDTO.fromEntity(eventSportif));
        return eventSportifDTOPage;
    }


    @Override
    public void deleteById(Long id) {
        eventSportifRepository.deleteById(id);
    }
}
