package org.isetbz.eventsportif.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="events")
public class EventSportif implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    private String Lieu;

    private String logo;

    private String poster;

    private Date dateDebut;

    private Date dateFin;
    @CreatedDate
    @Column(name="creationDate",nullable = false, updatable = false)
    private Instant creationDate;
    @LastModifiedDate
    @Column(name="lastModifiedDate")
    private Instant lastModifiedDate;

}
