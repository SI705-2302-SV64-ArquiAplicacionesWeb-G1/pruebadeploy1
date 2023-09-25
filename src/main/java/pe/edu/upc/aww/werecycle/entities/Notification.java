package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNotification;
    @Column(name = "dateNotification",nullable = false)
    private LocalDate dateNotification;
    @Column(name = "typeNotification",nullable = false)
    private String typeNotification;
    @OneToOne
    @JoinColumn(name = "idUser")
    private Useror idUser;

    public Notification() {
    }

    public Notification(int idNotification, LocalDate dateNotification, String typeNotification, Useror idUser) {
        this.idNotification = idNotification;
        this.dateNotification = dateNotification;
        this.typeNotification = typeNotification;
        this.idUser = idUser;
    }

    public int getIdNotification() {
        return idNotification;
    }

    public void setIdNotification(int idNotification) {
        this.idNotification = idNotification;
    }

    public LocalDate getDateNotification() {
        return dateNotification;
    }

    public void setDateNotification(LocalDate dateNotification) {
        this.dateNotification = dateNotification;
    }

    public String getTypeNotification() {
        return typeNotification;
    }

    public void setTypeNotification(String typeNotification) {
        this.typeNotification = typeNotification;
    }

    public Useror getIdUser() {
        return idUser;
    }

    public void setIdUser(Useror idUser) {
        this.idUser = idUser;
    }
}
