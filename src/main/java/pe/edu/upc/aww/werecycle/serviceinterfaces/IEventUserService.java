package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.EventUser;
import pe.edu.upc.aww.werecycle.entities.Events;

import java.util.List;

public interface IEventUserService {
    public void insert(EventUser eventsUser);

    public List<EventUser> list();

    public void delete(int idEventUser);
}
