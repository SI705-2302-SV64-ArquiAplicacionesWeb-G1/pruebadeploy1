package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.Roles;
import pe.edu.upc.aww.werecycle.repositories.ITypeUserRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.ITypeUserService;

import java.util.List;

@Service
public class TypeUserServiceImplement implements ITypeUserService {
    @Autowired
    private ITypeUserRepository tR;
    @Override
    public void insert(Roles roles) {
        tR.save(roles);
    }

    @Override
    public List<Roles> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int idTypeUser) {
        tR.deleteById(idTypeUser);
    }

}
