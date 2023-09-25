package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.PurchaseRequest;
import pe.edu.upc.aww.werecycle.repositories.IPurchaseRequestRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IPurchaseRequestService;

import java.util.List;

@Service
public class PurchaseRequestServiceImplement implements IPurchaseRequestService {
    @Autowired
    private IPurchaseRequestRepository prR;


    @Override
    public void insert(PurchaseRequest purchaseRequest) {
        prR.save(purchaseRequest);
    }

    @Override
    public List<PurchaseRequest> list() {
        return prR.findAll();
    }

    @Override
    public void delete(int idCodePurchase) {
        prR.deleteById(idCodePurchase);
    }
}
