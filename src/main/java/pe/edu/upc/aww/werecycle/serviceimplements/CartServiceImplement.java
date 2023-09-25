package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.Cart;
import pe.edu.upc.aww.werecycle.repositories.ICart;
import pe.edu.upc.aww.werecycle.serviceinterfaces.ICartService;

import java.util.List;


@Service
public class CartServiceImplement implements ICartService {
    @Autowired
    public ICart cR;
    @Override
    public void insert(Cart cart) {
        cR.save(cart);
    }

    @Override
    public List<Cart> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idCart) {
        cR.deleteById(idCart);
    }
}
