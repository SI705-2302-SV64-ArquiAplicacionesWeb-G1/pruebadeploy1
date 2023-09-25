package pe.edu.upc.aww.werecycle.dtos;

import pe.edu.upc.aww.werecycle.entities.Events;
import pe.edu.upc.aww.werecycle.entities.Useror;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class EventsUserDTO {
    private int idEventUser;

    private Useror idUser;

    private Events idEvent;

    public int getIdEventUser() {
        return idEventUser;
    }

    public void setIdEventUser(int idEventUser) {
        this.idEventUser = idEventUser;
    }

    public Useror getIdUser() {
        return idUser;
    }

    public void setIdUser(Useror idUser) {
        this.idUser = idUser;
    }

    public Events getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Events idEvent) {
        this.idEvent = idEvent;
    }
}
