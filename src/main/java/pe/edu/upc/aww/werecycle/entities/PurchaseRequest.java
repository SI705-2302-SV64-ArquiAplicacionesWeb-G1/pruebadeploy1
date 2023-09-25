package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;

@Entity
@Table(name = "PurchaseRequest")
public class PurchaseRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCodePurchase;
    @OneToOne
    @JoinColumn(name = "idCart")
    private Cart idCart;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private Useror idUser;

    public PurchaseRequest() {
    }

    public PurchaseRequest(int idCodePurchase, Cart idCart, Useror idUser) {
        this.idCodePurchase = idCodePurchase;
        this.idCart = idCart;
        this.idUser = idUser;
    }

    public int getIdCodePurchase() {
        return idCodePurchase;
    }

    public void setIdCodePurchase(int idCodePurchase) {
        this.idCodePurchase = idCodePurchase;
    }

    public Cart getIdCart() {
        return idCart;
    }

    public void setIdCart(Cart idCart) {
        this.idCart = idCart;
    }

    public Useror getIdUser() {
        return idUser;
    }

    public void setIdUser(Useror idUser) {
        this.idUser = idUser;
    }
}
