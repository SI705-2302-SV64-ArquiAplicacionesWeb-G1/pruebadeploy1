package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.Events;
import pe.edu.upc.aww.werecycle.repositories.IEventsRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IEventsService;

import java.time.LocalDate;
import java.util.List;

@Service
public class EventsServiceImplement implements IEventsService {
    @Autowired
    private IEventsRepository eR;


    @Override
    public void insert(Events events) {
        eR.save(events);
    }

    @Override
    public List<Events> list() {
        return eR.findAll();
    }

    @Override
    public void delete(int idEvent) {
        eR.deleteById(idEvent);
    }

    @Override 
    public List<Events> findByDate(LocalDate date)
    {
        return eR.findByDate(date);
    }

    @Override
    public List<Events> findByTitle(String title)
    {
        return eR.findByTitle(title);
    }


    @Override
    public List<Events> findEventsByUbication( String ciudad)
    {
        return eR.findEventsByUbication(ciudad);
    }

    @Override
    public List<Events> cuposLibres(){ return eR.cuposLibres();}

    @Override
    public Events findById(int id) {
        return eR.findById(id).orElse(new Events());
    }

    /*
    public void followEvent(int userId, int eventId) {
        Useror user = uR.findById(userId)
                .orElseThrow(() -> new EntityNotFoundException("Usuario no encontrado"));

        Events event = eR.findById(eventId)
                .orElseThrow(() -> new EntityNotFoundException("Evento no encontrado"));

        user.getFollowedEvents().add(event);
        uR.save(user);
    }

    public  void unfollowEvent(int userId, int eventId) {
        Useror user = uR.findById(userId)
                .orElseThrow(() -> new EntityNotFoundException("Usuario no encontrado"));

        Events event = eR.findById(eventId)
                .orElseThrow(() -> new EntityNotFoundException("Evento no encontrado"));

        user.getFollowedEvents().remove(event);
        uR.save(user);
    }*/

    
}
