package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Events")
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvent;

    @Column(name = "title", length = 100,nullable = false)
    private String title;
    @Column(name = "date",nullable = false)
    private LocalDate date;
    @Column(name = "description",nullable = false,length = 200)
    private String description;

    @Column(name = "numberParticipant", nullable = false)
    private int numberParticipant;

    @OneToOne
    @JoinColumn(name = "idUbication")
    private Ubication idUbication;

    /*@ManyToMany(mappedBy = "followedEvents")
    private Set<Useror> followers = new HashSet<>();*/

    public Events(int idEvent, String title, LocalDate date, String description, int numberParticipant, Ubication idUbication) {
        this.idEvent = idEvent;
        this.title = title;
        this.date = date;
        this.description = description;
        this.numberParticipant = numberParticipant;
        this.idUbication = idUbication;
       // this.followers = followers;
    }
    /*public Set<Useror> getFollowers() {
        return followers;
    }

    public void setFollowers(Set<Useror> followers) {
        this.followers = followers;
    }*/

    public Events() {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

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
}

