package org.isetbz.eventsportif;

import org.isetbz.eventsportif.dto.EventSportifDTO;
import org.isetbz.eventsportif.services.EventSportifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootApplication
@EnableJpaAuditing
public class EventSportifSem212023Application implements CommandLineRunner {

	@Autowired
	private EventSportifService eventSportifService;

	public static void main(String[] args) {
		SpringApplication.run(EventSportifSem212023Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
		EventSportifDTO eventSportifDTO=new EventSportifDTO();
		eventSportifDTO.setNom("Tournoi TKD");
		eventSportifDTO.setLieu("Bizerte");
		eventSportifDTO.setDateDebut(simpleDateFormat.parse("09/03/2023"));
		eventSportifDTO.setDateFin(simpleDateFormat.parse("12/03/2023"));
		eventSportifDTO=eventSportifService.save(eventSportifDTO);

		eventSportifDTO=new EventSportifDTO();
		eventSportifDTO.setNom("Tournoi TKD");
		eventSportifDTO.setLieu("Bizerte");
		eventSportifDTO.setDateDebut(simpleDateFormat.parse("09/03/2023"));
		eventSportifDTO.setDateFin(simpleDateFormat.parse("12/03/2023"));
		eventSportifDTO=eventSportifService.save(eventSportifDTO);

		eventSportifDTO=new EventSportifDTO();
		eventSportifDTO.setNom("Tournoi TKD");
		eventSportifDTO.setLieu("Bizerte");
		eventSportifDTO.setDateDebut(simpleDateFormat.parse("09/03/2023"));
		eventSportifDTO.setDateFin(simpleDateFormat.parse("12/03/2023"));
		eventSportifDTO=eventSportifService.save(eventSportifDTO);

		eventSportifDTO=new EventSportifDTO();
		eventSportifDTO.setNom("Tournoi TKD");
		eventSportifDTO.setLieu("Bizerte");
		eventSportifDTO.setDateDebut(simpleDateFormat.parse("09/03/2023"));
		eventSportifDTO.setDateFin(simpleDateFormat.parse("12/03/2023"));
		eventSportifDTO=eventSportifService.save(eventSportifDTO);

		eventSportifDTO=new EventSportifDTO();
		eventSportifDTO.setNom("Tournoi TKD");
		eventSportifDTO.setLieu("Bizerte");
		eventSportifDTO.setDateDebut(simpleDateFormat.parse("09/03/2023"));
		eventSportifDTO.setDateFin(simpleDateFormat.parse("12/03/2023"));
		eventSportifDTO=eventSportifService.save(eventSportifDTO);

		eventSportifDTO=new EventSportifDTO();
		eventSportifDTO.setNom("Tournoi TKD");
		eventSportifDTO.setLieu("Bizerte");
		eventSportifDTO.setDateDebut(simpleDateFormat.parse("09/03/2023"));
		eventSportifDTO.setDateFin(simpleDateFormat.parse("12/03/2023"));
		eventSportifDTO=eventSportifService.save(eventSportifDTO);

		 eventSportifDTO=new EventSportifDTO();
		eventSportifDTO.setNom("Tournoi TKD");
		eventSportifDTO.setLieu("Bizerte");
		eventSportifDTO.setDateDebut(simpleDateFormat.parse("09/03/2023"));
		eventSportifDTO.setDateFin(simpleDateFormat.parse("12/03/2023"));
		eventSportifDTO=eventSportifService.save(eventSportifDTO);

		eventSportifDTO=new EventSportifDTO();
		eventSportifDTO.setNom("Tournoi TKD");
		eventSportifDTO.setLieu("Bizerte");
		eventSportifDTO.setDateDebut(simpleDateFormat.parse("09/03/2023"));
		eventSportifDTO.setDateFin(simpleDateFormat.parse("12/03/2023"));
		eventSportifDTO=eventSportifService.save(eventSportifDTO);

		eventSportifDTO=new EventSportifDTO();
		eventSportifDTO.setNom("Tournoi TKD");
		eventSportifDTO.setLieu("Bizerte");
		eventSportifDTO.setDateDebut(simpleDateFormat.parse("09/03/2023"));
		eventSportifDTO.setDateFin(simpleDateFormat.parse("12/03/2023"));
		eventSportifDTO=eventSportifService.save(eventSportifDTO);
		eventSportifDTO=new EventSportifDTO();
		eventSportifDTO.setNom("Tournoi TKD");
		eventSportifDTO.setLieu("Bizerte");
		eventSportifDTO.setDateDebut(simpleDateFormat.parse("09/03/2023"));
		eventSportifDTO.setDateFin(simpleDateFormat.parse("12/03/2023"));
		eventSportifDTO=eventSportifService.save(eventSportifDTO);
		eventSportifDTO=new EventSportifDTO();
		eventSportifDTO.setNom("Tournoi TKD");
		eventSportifDTO.setLieu("Bizerte");
		eventSportifDTO.setDateDebut(simpleDateFormat.parse("09/03/2023"));
		eventSportifDTO.setDateFin(simpleDateFormat.parse("12/03/2023"));
		eventSportifDTO=eventSportifService.save(eventSportifDTO);
		eventSportifDTO=new EventSportifDTO();
		eventSportifDTO.setNom("Tournoi TKD");
		eventSportifDTO.setLieu("Bizerte");
		eventSportifDTO.setDateDebut(simpleDateFormat.parse("09/03/2023"));
		eventSportifDTO.setDateFin(simpleDateFormat.parse("12/03/2023"));
		eventSportifDTO=eventSportifService.save(eventSportifDTO);
		eventSportifDTO=new EventSportifDTO();
		eventSportifDTO.setNom("Tournoi TKD");
		eventSportifDTO.setLieu("Bizerte");
		eventSportifDTO.setDateDebut(simpleDateFormat.parse("09/03/2023"));
		eventSportifDTO.setDateFin(simpleDateFormat.parse("12/03/2023"));
		eventSportifDTO=eventSportifService.save(eventSportifDTO);








		List<EventSportifDTO> eventSportifDTOS=eventSportifService.findAll();

		eventSportifDTOS.stream().forEach(event -> {System.out.println(event.getNom());
		System.out.println(event.getDateDebut());});


	}
}
