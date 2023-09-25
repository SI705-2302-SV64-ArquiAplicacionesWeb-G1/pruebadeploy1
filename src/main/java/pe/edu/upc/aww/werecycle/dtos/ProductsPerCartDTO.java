package pe.edu.upc.aww.werecycle.dtos;

import pe.edu.upc.aww.werecycle.entities.Cart;
import pe.edu.upc.aww.werecycle.entities.RecyclableMaterial;


public class ProductsPerCartDTO {

    private int idProducsPerCart;

    private RecyclableMaterial idRecyclableMaterial;


    private Cart idCart;



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
