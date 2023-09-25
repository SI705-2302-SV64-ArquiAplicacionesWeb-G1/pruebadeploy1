package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;

@Entity
@Table(name = "Cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCart;
    @Column(name = "amountCart",nullable = false)
    private double amountCart;

    public Cart() {
    }

    public Cart(int idCart, double amountCart) {
        this.idCart = idCart;
        this.amountCart = amountCart;
    }

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
