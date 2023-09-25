package pe.edu.upc.aww.werecycle.dtos;

import pe.edu.upc.aww.werecycle.entities.PurchaseRequest;

import javax.persistence.*;
import java.time.LocalDate;

public class TicketPurchaseDTO {


    private int idCode;


    private PurchaseRequest idCodePurchase;

    private LocalDate dateOfBuy;

    private String addressOfClient;

    private double unitPrice;

    private double totalPrice;



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
