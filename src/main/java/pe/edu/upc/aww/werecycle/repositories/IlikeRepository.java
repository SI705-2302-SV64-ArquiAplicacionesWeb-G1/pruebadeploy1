package pe.edu.upc.aww.werecycle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.werecycle.entities.Likes;

import java.util.List;

@Repository
public interface IlikeRepository extends JpaRepository<Likes,Integer> {

    @Query(value = "SELECT COUNT(*) as Cantidad_de_likes, p.title from likes \n" +
            "INNER JOIN publication p on likes.id_publication = p.id_publication\n" +
            "GROUP BY p.id_publication", nativeQuery = true)
    List<String[]>QuantityOfLikeForPublication();
}
