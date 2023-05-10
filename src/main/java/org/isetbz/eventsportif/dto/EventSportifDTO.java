package org.isetbz.eventsportif.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.isetbz.eventsportif.models.EventSportif;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventSportifDTO {

    private Long id;

    @NotEmpty
    @Size(min=5, max = 100)
    private String nom;

    @Email
    private String email;

    @NotEmpty
    @Size(min=5, max = 100)
    private String lieu;

    private String logo;

    private String poster;

    @NotNull
    private Date dateDebut;

    @NotNull
    private Date dateFin;

    public static EventSportif toEntity(EventSportifDTO eventSportifDTO){
        if(eventSportifDTO==null){
            return null;
        }

        EventSportif eventSportif=new EventSportif();
        return EventSportif.builder()
                .id(eventSportifDTO.getId())
                .nom(eventSportifDTO.getNom())
                .email(eventSportifDTO.getEmail())
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
                .email(eventSportif.getEmail())
                .lieu(eventSportif.getLieu())
                .logo(eventSportif.getLogo())
                .poster(eventSportif.getPoster())
                .dateDebut(eventSportif.getDateDebut())
                .dateFin(eventSportif.getDateFin())
                .build();
    }

}
