package org.isetbz.eventsportif.services;

import org.isetbz.eventsportif.dto.EventSportifDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface EventSportifService {

   public EventSportifDTO save(EventSportifDTO eventSportifDTO);

   public EventSportifDTO update(EventSportifDTO eventSportifDTO);

   public List<EventSportifDTO> findAll();

   public Page<EventSportifDTO> findAll(int page,int size);

   public EventSportifDTO getById(Long id);

   void deleteById(Long id);

}
