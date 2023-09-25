package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.TicketPurchase;

import java.util.List;

public interface ITicketPurchaseService {

    public void insert(TicketPurchase ticketPurchase);

    public List<TicketPurchase> list();

    public void delete(int idCodePurchase);
}
