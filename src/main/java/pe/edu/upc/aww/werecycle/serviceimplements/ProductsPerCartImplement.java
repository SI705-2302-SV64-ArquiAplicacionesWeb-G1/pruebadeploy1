package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.ProductsPerCart;
import pe.edu.upc.aww.werecycle.repositories.IProductsPerCartRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IProductsPerCartService;

import java.util.List;

@Service
public class ProductsPerCartImplement implements IProductsPerCartService {
    @Autowired
    private IProductsPerCartRepository ppCR;
    @Override
    public void insert(ProductsPerCart productsPerCart) {
        ppCR.save(productsPerCart);
    }

    @Override
    public List<ProductsPerCart> list() {
        return ppCR.findAll();
    }

    @Override
    public void delete(int idProductsPerCart) {
        ppCR.deleteById(idProductsPerCart);
    }

    @Override
    public Integer sumProductPerCart() {
        return ppCR.sumProductPerCart();
    }
}
