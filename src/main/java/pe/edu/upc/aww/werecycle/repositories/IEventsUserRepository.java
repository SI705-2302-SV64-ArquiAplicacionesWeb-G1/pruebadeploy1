package pe.edu.upc.aww.werecycle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.werecycle.entities.EventUser;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IEventsService;

@Repository
public interface IEventsUserRepository extends JpaRepository<EventUser,Integer> {


}
