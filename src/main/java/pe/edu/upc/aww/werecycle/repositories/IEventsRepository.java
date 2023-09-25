package pe.edu.upc.aww.werecycle.repositories;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.werecycle.entities.Events;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IEventsRepository extends JpaRepository<Events,Integer>{

    List<Events>findByDate(LocalDate date);
    List<Events> findByTitle(String title);

    @Query(value = "SELECT * FROM Events e JOIN Ubication u ON e.id_ubication = u.id_ubication WHERE u.city_ubication = :cityUbication", nativeQuery = true)
    List<Events> findEventsByUbication(@Param("cityUbication") String cityUbication);

    @Query( value = "SELECT * FROM Events e WHERE e.number_participant <30", nativeQuery = true )
    List<Events> cuposLibres();
}
