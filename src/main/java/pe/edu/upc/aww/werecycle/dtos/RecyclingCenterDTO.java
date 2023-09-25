package pe.edu.upc.aww.werecycle.dtos;

import pe.edu.upc.aww.werecycle.entities.Ubication;

import javax.persistence.*;
import java.sql.Time;

public class RecyclingCenterDTO {

    private int idRecyclingCenter;
    private String nameRecyclingCenter;
    private String licenseRecyclingCenter;
    private Time openinghourRecyclingCenter;
    private Time closingtimeRecyclingCenter;
    private Ubication idUbication;

    public int getIdRecyclingCenter() {
        return idRecyclingCenter;
    }

    public void setIdRecyclingCenter(int idRecyclingCenter) {
        this.idRecyclingCenter = idRecyclingCenter;
    }

    public String getNameRecyclingCenter() {
        return nameRecyclingCenter;
    }

    public void setNameRecyclingCenter(String nameRecyclingCenter) {
        this.nameRecyclingCenter = nameRecyclingCenter;
    }

    public String getLicenseRecyclingCenter() {
        return licenseRecyclingCenter;
    }

    public void setLicenseRecyclingCenter(String licenseRecyclingCenter) {
        this.licenseRecyclingCenter = licenseRecyclingCenter;
    }

    public Time getOpeninghourRecyclingCenter() {
        return openinghourRecyclingCenter;
    }

    public void setOpeninghourRecyclingCenter(Time openinghourRecyclingCenter) {
        this.openinghourRecyclingCenter = openinghourRecyclingCenter;
    }

    public Time getClosingtimeRecyclingCenter() {
        return closingtimeRecyclingCenter;
    }

    public void setClosingtimeRecyclingCenter(Time closingtimeRecyclingCenter) {
        this.closingtimeRecyclingCenter = closingtimeRecyclingCenter;
    }

    public Ubication getIdUbication() {
        return idUbication;
    }

    public void setIdUbication(Ubication idUbication) {
        this.idUbication = idUbication;
    }
}
