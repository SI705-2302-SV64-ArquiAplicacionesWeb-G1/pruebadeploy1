package pe.edu.upc.aww.werecycle.dtos;

import pe.edu.upc.aww.werecycle.entities.Roles;
import pe.edu.upc.aww.werecycle.entities.Ubication;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

public class UserDTO {

    private int idUser;

    private String userName;

    private String userPassword;

    private String userEmail;

    private LocalDate userAge;

    private Boolean enabled;

    private Ubication ubicationUser;

    private int idEvent;
    public int getIdEvent() {
        return idEvent;
    }
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public LocalDate getUserAge() {
        return userAge;
    }

    public void setUserAge(LocalDate userAge) {
        this.userAge = userAge;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Ubication getUbicationUser() {
        return ubicationUser;
    }

    public void setUbicationUser(Ubication ubicationUser) {
        this.ubicationUser = ubicationUser;
    }

    public void setIdEvent(int idEvent)
    {
        this.idEvent=idEvent;
    }
}
