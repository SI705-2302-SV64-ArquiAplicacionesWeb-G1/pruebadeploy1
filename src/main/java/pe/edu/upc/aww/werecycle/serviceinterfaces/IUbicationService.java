package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.Ubication;

import java.util.List;

public interface IUbicationService {
    public void insert(Ubication ubication);
    public List<Ubication>list();
    public void delete(int idUbication);
}
