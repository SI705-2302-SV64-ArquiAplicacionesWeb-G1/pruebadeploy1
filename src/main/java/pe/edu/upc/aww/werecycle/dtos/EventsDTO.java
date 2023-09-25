package pe.edu.upc.aww.werecycle.dtos;

import pe.edu.upc.aww.werecycle.entities.Ubication;
import pe.edu.upc.aww.werecycle.entities.Useror;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class EventsDTO {
    private int idEvent;
    private LocalDate date;
    private String description;

    private int numberParticipant;
    private Ubication idUbication;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /*public Set<Useror> getFollowers() {
        return followers;
    }*/

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberParticipant() {
        return numberParticipant;
    }

    public void setNumberParticipant(int numberParticipant) {
        this.numberParticipant = numberParticipant;
    }

    public Ubication getIdUbication() {
        return idUbication;
    }

    public void setIdUbication(Ubication idUbication) {
        this.idUbication = idUbication;
    }

   /* public void setFollowers(Set<Useror> followers) {
        this.followers = followers;
    }*/

   // private Set<Useror> followers = new HashSet<>();

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }


}
