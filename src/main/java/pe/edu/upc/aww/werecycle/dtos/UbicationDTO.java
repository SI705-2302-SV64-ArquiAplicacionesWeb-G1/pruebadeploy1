package pe.edu.upc.aww.werecycle.dtos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

public class UbicationDTO {

    private int idUbication;

    private LocalDate ubicationDate;

    private String addressUbication;

    private String cityUbication;

    private int contactUbication;

    private String typeUbication;

    private String descUbication;

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
