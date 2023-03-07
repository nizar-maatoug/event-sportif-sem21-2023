package org.isetbz.eventsportif.services;

import org.isetbz.eventsportif.dto.EventSportifDTO;

import java.util.List;

public interface EventSportifService {

   public EventSportifDTO save(EventSportifDTO eventSportifDTO);

   public List<EventSportifDTO> findAll();

   void deleteById(Long id);

}
