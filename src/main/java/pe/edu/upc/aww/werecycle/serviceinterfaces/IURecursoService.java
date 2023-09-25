package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.Recurso;

import java.util.List;

public interface IURecursoService {
    public void insert(Recurso recurso);
    public List<Recurso>list();
    public void delete(int idRecurso);
}
