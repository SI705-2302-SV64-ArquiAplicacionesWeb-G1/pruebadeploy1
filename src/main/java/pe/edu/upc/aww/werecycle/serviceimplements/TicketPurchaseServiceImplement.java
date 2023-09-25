package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.TicketPurchase;
import pe.edu.upc.aww.werecycle.repositories.ITicketPurchaseRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.ITicketPurchaseService;

import java.util.List;

@Service
public class TicketPurchaseServiceImplement implements ITicketPurchaseService {
    @Autowired
    private ITicketPurchaseRepository tpR;


    @Override
    public void insert(TicketPurchase ticketPurchase) {
        tpR.save(ticketPurchase);
    }

    @Override
    public List<TicketPurchase> list() {
        return tpR.findAll();
    }

    @Override
    public void delete(int idCodePurchase) {
        tpR.deleteById(idCodePurchase);
    }
}
