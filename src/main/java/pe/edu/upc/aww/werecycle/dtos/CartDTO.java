package pe.edu.upc.aww.werecycle.dtos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CartDTO {

    private int idCart;

    private double amountCart;


    public int getIdCart() {
        return idCart;
    }

    public void setIdCart(int idCart) {
        this.idCart = idCart;
    }

    public double getAmountCart() {
        return amountCart;
    }

    public void setAmountCart(double amountCart) {
        this.amountCart = amountCart;
    }
}
