package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.TypeRecurso;

import java.util.List;

public interface IUTypeRecursoService {
    public void insert(TypeRecurso typeRecurso);
    public List<TypeRecurso>list();
    public void delete(int idTypeRecurso);
}
