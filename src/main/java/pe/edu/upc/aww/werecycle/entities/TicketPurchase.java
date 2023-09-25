package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "TicketPurchase")
public class TicketPurchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCode;

    @ManyToOne
    @JoinColumn(name = "idCodePurchase")
    private PurchaseRequest idCodePurchase;

    @Column(name = "dateOfBuy",nullable = false)
    private LocalDate dateOfBuy;

    @Column(name = "addressOfClient", length = 100,nullable = false)
    private String addressOfClient;

    @Column(name = "unitPrice",nullable = false)
    private double unitPrice;

    @Column(name = "totalPrice",nullable = false)
    private double totalPrice;

    public TicketPurchase() {
    }

    public TicketPurchase(int idCode, PurchaseRequest idCodePurchase, LocalDate dateOfBuy, String addressOfClient, double unitPrice, double totalPrice) {
        this.idCode = idCode;
        this.idCodePurchase = idCodePurchase;
        this.dateOfBuy = dateOfBuy;
        this.addressOfClient = addressOfClient;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public int getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }

    public PurchaseRequest getIdCodePurchase() {
        return idCodePurchase;
    }

    public void setIdCodePurchase(PurchaseRequest idCodePurchase) {
        this.idCodePurchase = idCodePurchase;
    }

    public LocalDate getDateOfBuy() {
        return dateOfBuy;
    }

    public void setDateOfBuy(LocalDate dateOfBuy) {
        this.dateOfBuy = dateOfBuy;
    }

    public String getAddressOfClient() {
        return addressOfClient;
    }

    public void setAddressOfClient(String addressOfClient) {
        this.addressOfClient = addressOfClient;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
