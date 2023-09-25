package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.Cart;

import java.util.List;

public interface ICartService {
    public void insert(Cart cart);
    public List<Cart>list();
    public void delete(int idCart);
}
