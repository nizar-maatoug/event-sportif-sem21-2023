package org.isetbz.eventsportif.repositories;

import org.isetbz.eventsportif.models.EventSportif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventSportifRepository extends JpaRepository<EventSportif, Long> {

}
