package pe.edu.upc.aww.werecycle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.werecycle.entities.RecyclingCenter;
import pe.edu.upc.aww.werecycle.entities.Ubication;

import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface IURecyclingCenterRepository extends JpaRepository<RecyclingCenter, Integer> {
    List<RecyclingCenter>findRecyclingCenterByNameRecyclingCenter(String NameRecyclingCenter);

    List<RecyclingCenter>findRecyclingCenterByIdUbication(Ubication idUbication);

    List<RecyclingCenter>findRecyclingCenterByOpeninghourRecyclingCenter(Time openinghourRecyclingCenter);
    List<RecyclingCenter>findRecyclingCenterByClosingtimeRecyclingCenter(Time closingtimeRecyclingCenter);
}
