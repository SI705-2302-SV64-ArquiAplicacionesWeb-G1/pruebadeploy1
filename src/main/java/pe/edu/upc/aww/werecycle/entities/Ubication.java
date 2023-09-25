package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Ubication")
public class Ubication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUbication;
    @Column(name = "ubicationDate", nullable = false)
    private LocalDate ubicationDate;
    @Column(name = "addressUbication", nullable = false, length = 50)
    private String addressUbication;
    @Column(name = "cityUbication", nullable = false, length = 50)
    private String cityUbication;
    @Column(name = "contactUbication", nullable = false, length = 9)
    private int contactUbication;
    @Column(name = "typeUbication", nullable = false, length = 15)
    private String typeUbication;
    @Column(name = "descUbication", nullable = false, length = 50)
    private String descUbication;

    public Ubication() {
    }

    public Ubication(int idUbication, LocalDate ubicationDate, String addressUbication, String cityUbication, int contactUbication, String typeUbication, String descUbication) {
        this.idUbication = idUbication;
        this.ubicationDate = ubicationDate;
        this.addressUbication = addressUbication;
        this.cityUbication = cityUbication;
        this.contactUbication = contactUbication;
        this.typeUbication = typeUbication;
        this.descUbication = descUbication;
    }

    public int getIdUbication() {
        return idUbication;
    }

    public void setIdUbication(int idUbication) {
        this.idUbication = idUbication;
    }

    public LocalDate getUbicationDate() {
        return ubicationDate;
    }

    public void setUbicationDate(LocalDate ubicationDate) {
        this.ubicationDate = ubicationDate;
    }

    public String getAddressUbication() {
        return addressUbication;
    }

    public void setAddressUbication(String addressUbication) {
        this.addressUbication = addressUbication;
    }

    public String getCityUbication() {
        return cityUbication;
    }

    public void setCityUbication(String cityUbication) {
        this.cityUbication = cityUbication;
    }

    public int getContactUbication() {
        return contactUbication;
    }

    public void setContactUbication(int contactUbication) {
        this.contactUbication = contactUbication;
    }

    public String getTypeUbication() {
        return typeUbication;
    }

    public void setTypeUbication(String typeUbication) {
        this.typeUbication = typeUbication;
    }

    public String getDescUbication() {
        return descUbication;
    }

    public void setDescUbication(String descUbication) {
        this.descUbication = descUbication;
    }
}
