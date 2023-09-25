package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.EventUser;
import pe.edu.upc.aww.werecycle.repositories.IEventsUserRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IEventUserService;

import java.util.List;

@Service
public class EventsUserServiceImplement implements IEventUserService {
    @Autowired
    private IEventsUserRepository euR;

    @Override
    public void insert(EventUser eventsUser) {
        euR.save(eventsUser);
    }

    @Override
    public List<EventUser> list() {
        return euR.findAll();
    }

    @Override
    public void delete(int idEventUser) {
        euR.deleteById(idEventUser);
    }
}
