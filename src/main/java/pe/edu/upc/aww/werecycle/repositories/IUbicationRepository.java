package pe.edu.upc.aww.werecycle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.werecycle.entities.Ubication;

@Repository
public interface IUbicationRepository extends JpaRepository<Ubication,Integer> {
}
