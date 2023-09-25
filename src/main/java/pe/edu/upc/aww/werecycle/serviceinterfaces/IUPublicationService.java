package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.dtos.PublicationLikesDTO;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.aww.werecycle.entities.Publication;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public interface IUPublicationService {
    public void insert(Publication publication);
    public List<Publication> list();
    public void delete(int idPublication);

    List<Publication> findBydatePublication(LocalDate datePublication);
    List<Publication> findBytitle(String title);
    public List<Publication> findByPublicationByType(@Param("type") String typeRecursotype);
    Integer CountPublicationByType();
    public List<PublicationLikesDTO>findPublicationsWithMostLikes();
}
