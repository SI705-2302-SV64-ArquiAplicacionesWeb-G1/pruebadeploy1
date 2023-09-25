package pe.edu.upc.aww.werecycle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.werecycle.entities.Comment;

import java.util.List;

@Repository
public interface ICommentRepository extends JpaRepository<Comment,Integer> {
    @Query(value = "SELECT COUNT(*) as Cantidad_de_comentarios, p.title from comment \n" +
            "INNER JOIN publication p on comment.id_publication = p.id_publication\n" +
            "GROUP BY p.id_publication",nativeQuery = true)
    List<String[]> QuantityOfCommentsForPublication();
}
