package pe.edu.upc.aww.werecycle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.werecycle.entities.TypeRecurso;

@Repository
public interface IUTypeRecursoRepository extends JpaRepository<TypeRecurso,Integer> {
}
