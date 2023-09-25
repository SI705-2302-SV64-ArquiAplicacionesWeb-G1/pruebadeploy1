package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.ProductsPerCart;

import java.util.List;

public interface IProductsPerCartService {
    public void insert(ProductsPerCart productsPerCart);
    public List<ProductsPerCart>list();
    public void delete(int idProductsPerCart);
    Integer sumProductPerCart();

}
