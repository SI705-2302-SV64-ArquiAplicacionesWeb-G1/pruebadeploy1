package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.TypeRecurso;
import pe.edu.upc.aww.werecycle.repositories.IUTypeRecursoRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUTypeRecursoService;

import java.util.List;

@Service
public class TypeRecursoServiceImplement implements IUTypeRecursoService {
    @Autowired
    private IUTypeRecursoRepository tyR;

    @Override
    public void insert(TypeRecurso typeRecurso) {
        tyR.save(typeRecurso);
    }

    @Override
    public List<TypeRecurso> list() {
        return tyR.findAll();
    }

    @Override
    public void delete(int idTypeRecurso) {
        tyR.deleteById(idTypeRecurso);
    }
}
