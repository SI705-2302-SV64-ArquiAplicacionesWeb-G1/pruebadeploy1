package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.PurchaseRequest;
import pe.edu.upc.aww.werecycle.entities.Useror;

import java.util.List;

public interface IPurchaseRequestService {
    public void insert(PurchaseRequest purchaseRequest);
    public List<PurchaseRequest> list();
    public void delete(int idCodePurchase);
}
