package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;

@Entity
@Table(name = "EvenUser")
public class EventUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEventUser;

    @ManyToOne
    @JoinColumn(name = "IdUser")
    private Useror idUser;

    @ManyToOne
    @JoinColumn(name = "idEvent")
    private Events idEvent;

    public EventUser() {
    }

    public EventUser(int idEventUser, Useror idUser, Events idEvent) {
        this.idEventUser = idEventUser;
        this.idUser = idUser;
        this.idEvent = idEvent;
    }

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
