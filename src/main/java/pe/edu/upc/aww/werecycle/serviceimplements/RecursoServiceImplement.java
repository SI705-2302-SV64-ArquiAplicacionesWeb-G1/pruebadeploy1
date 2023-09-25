package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.Recurso;
import pe.edu.upc.aww.werecycle.repositories.IURecursoRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IURecursoService;

import java.util.List;

@Service
public class RecursoServiceImplement implements IURecursoService {
    @Autowired
    private IURecursoRepository rE;

    @Override
    public void insert(Recurso recurso) {
        rE.save(recurso);
    }

    @Override
    public List<Recurso> list() {
        return rE.findAll();
    }

    @Override
    public void delete(int id_Recurso) {
        rE.deleteById(id_Recurso);
    }
}
