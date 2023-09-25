package pe.edu.upc.aww.werecycle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.werecycle.entities.ProductsPerCart;

@Repository
public interface IProductsPerCartRepository extends JpaRepository<ProductsPerCart,Integer> {

    @Query(value = "SELECT SUM(c.amount_cart) AS monto_total\n" +
            "FROM cart AS c\n" +
            "INNER JOIN products_per_cart AS pc ON c.id_cart = pc.id_cart", nativeQuery = true)
    Integer sumProductPerCart();

}
