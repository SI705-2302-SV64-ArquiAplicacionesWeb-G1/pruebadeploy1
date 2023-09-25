package pe.edu.upc.aww.werecycle.dtos;

import pe.edu.upc.aww.werecycle.entities.RecyclableMaterial;
import pe.edu.upc.aww.werecycle.entities.Useror;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class PurchaseRequestDTO {

    private int idCodePurchase;
    private RecyclableMaterial idRecyclableMaterial;
    private Useror idUser;

    public int getIdCodePurchase() {
        return idCodePurchase;
    }

    public void setIdCodePurchase(int idCodePurchase) {
        this.idCodePurchase = idCodePurchase;
    }

    public RecyclableMaterial getIdRecyclableMaterial() {
        return idRecyclableMaterial;
    }

    public void setIdRecyclableMaterial(RecyclableMaterial idRecyclableMaterial) {
        this.idRecyclableMaterial = idRecyclableMaterial;
    }

    public Useror getIdUser() {
        return idUser;
    }

    public void setIdUser(Useror idUser) {
        this.idUser = idUser;
    }
}
