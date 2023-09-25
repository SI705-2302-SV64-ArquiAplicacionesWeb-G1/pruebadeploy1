package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.PymentMethod;
import pe.edu.upc.aww.werecycle.repositories.IPymentMethodRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IPymentMethodService;

import java.util.List;

@Service
public class PymentMethodServiceImplement implements IPymentMethodService {
   @Autowired
   private IPymentMethodRepository pmR;

    @Override
    public void insert(PymentMethod pymentMethod) {
        pmR.save(pymentMethod);
    }

    @Override
    public List<PymentMethod> list() {
        return pmR.findAll();
    }
}
