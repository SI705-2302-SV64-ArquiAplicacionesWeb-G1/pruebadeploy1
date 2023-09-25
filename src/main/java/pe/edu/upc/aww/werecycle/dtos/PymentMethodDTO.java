package pe.edu.upc.aww.werecycle.dtos;

import pe.edu.upc.aww.werecycle.entities.PurchaseRequest;
import pe.edu.upc.aww.werecycle.entities.PymentMethod;
import pe.edu.upc.aww.werecycle.entities.TypeCard;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class PymentMethodDTO {
    public int idPymentMethod;

    public PurchaseRequest idCodePurchase;

    public TypeCard idTypeCard;

    public int getIdPymentMethod() {
        return idPymentMethod;
    }

    public void setIdPymentMethod(int idPymentMethod) {
        this.idPymentMethod = idPymentMethod;
    }

    public PurchaseRequest getIdCodePurchase() {
        return idCodePurchase;
    }

    public void setIdCodePurchase(PurchaseRequest idCodePurchase) {
        this.idCodePurchase = idCodePurchase;
    }

    public TypeCard getIdTypeCard() {
        return idTypeCard;
    }

    public void setIdTypeCard(TypeCard idTypeCard) {
        this.idTypeCard = idTypeCard;
    }
}
