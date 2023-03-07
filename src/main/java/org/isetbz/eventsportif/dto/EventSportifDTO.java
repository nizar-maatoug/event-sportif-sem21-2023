package org.isetbz.eventsportif.dto;


import lombok.Builder;
import lombok.Data;
import org.isetbz.eventsportif.models.EventSportif;

import java.util.Date;

@Data
@Builder
public class EventSportifDTO {

    private Long id;
    private String nom;

    private String lieu;

    private String logo;

    private String poster;

    private Date dateDebut;

    private Date dateFin;

    public static EventSportif toEntity(EventSportifDTO eventSportifDTO){
        if(eventSportifDTO==null){
            return null;
        }

        EventSportif eventSportif=new EventSportif();
        return EventSportif.builder()
                .id(eventSportifDTO.getId())
                .nom(eventSportifDTO.getNom())
                .lieu(eventSportifDTO.getLieu())
                .logo(eventSportifDTO.getLogo())
                .poster(eventSportifDTO.getPoster())
                .dateDebut(eventSportifDTO.getDateDebut())
                .dateFin(eventSportifDTO.getDateFin())
                .build();


    }
    public static EventSportifDTO fromEntity(EventSportif eventSportif){
        if(eventSportif==null){
            return null;
        }
        return EventSportifDTO.builder()
                .id(eventSportif.getId())
                .nom(eventSportif.getNom())
                .lieu(eventSportif.getLieu())
                .logo(eventSportif.getLogo())
                .poster(eventSportif.getPoster())
                .dateDebut(eventSportif.getDateDebut())
                .dateFin(eventSportif.getDateFin())
                .build();
    }

}
