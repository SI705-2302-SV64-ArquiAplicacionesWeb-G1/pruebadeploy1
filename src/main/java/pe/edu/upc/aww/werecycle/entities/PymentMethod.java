package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;

@Entity
@Table(name = "PymentMethod")
public class PymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idPymentMethod;

    @ManyToOne
    @JoinColumn(name = "idCodePurchase")
    public PurchaseRequest idCodePurchase;


    public PymentMethod() {
    }

    public PymentMethod(int idPymentMethod, PurchaseRequest idCodePurchase) {
        this.idPymentMethod = idPymentMethod;
        this.idCodePurchase = idCodePurchase;
    }

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
}