package pe.edu.upc.aww.werecycle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.werecycle.entities.RecyclableMaterial;

import java.util.List;

@Repository
public interface IURecyclableMaterialRepository extends JpaRepository<RecyclableMaterial,Integer> {
    List<RecyclableMaterial>findRecyclableMaterialByNameRecyclableMaterial(String NameRecyclableMaterial);

    List<RecyclableMaterial>findRecyclableMaterialByTypeRecyclableMaterial(String TypeRecyclableMaterial);
}
