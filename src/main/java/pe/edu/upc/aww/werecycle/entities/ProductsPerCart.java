package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;

@Entity
@Table(name = "ProductsPerCart")
public class ProductsPerCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducsPerCart;
    @ManyToOne
    @JoinColumn(name = "idRecyclableMaterial")
    private RecyclableMaterial idRecyclableMaterial;

    @ManyToOne
    @JoinColumn(name = "idCart")
    private Cart idCart;

    public ProductsPerCart() {
    }

    public ProductsPerCart(int idProducsPerCart, RecyclableMaterial idRecyclableMaterial, Cart idCart) {
        this.idProducsPerCart = idProducsPerCart;
        this.idRecyclableMaterial = idRecyclableMaterial;
        this.idCart = idCart;
    }

    public int getIdProducsPerCart() {
        return idProducsPerCart;
    }

    public void setIdProducsPerCart(int idProducsPerCart) {
        this.idProducsPerCart = idProducsPerCart;
    }

    public RecyclableMaterial getIdRecyclableMaterial() {
        return idRecyclableMaterial;
    }

    public void setIdRecyclableMaterial(RecyclableMaterial idRecyclableMaterial) {
        this.idRecyclableMaterial = idRecyclableMaterial;
    }

    public Cart getIdCart() {
        return idCart;
    }

    public void setIdCart(Cart idCart) {
        this.idCart = idCart;
    }
}
