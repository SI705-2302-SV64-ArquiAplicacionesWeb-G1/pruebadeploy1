package pe.edu.upc.aww.werecycle.serviceinterfaces;

import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.Events;
import pe.edu.upc.aww.werecycle.entities.FrequentQuestions;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;


public interface IEventsService {

    public void insert(Events events);

    public List<Events> list();

    public void delete(int idEvent);

    List<Events> findByDate(LocalDate date);

    List<Events> findByTitle( String title);

    List<Events> findEventsByUbication(String city);

    List<Events> cuposLibres();

    public Events findById(int id);

}
