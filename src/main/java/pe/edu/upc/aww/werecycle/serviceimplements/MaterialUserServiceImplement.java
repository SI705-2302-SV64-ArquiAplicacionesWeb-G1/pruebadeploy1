package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.MaterialUser;
import pe.edu.upc.aww.werecycle.repositories.IUMaterialUserRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUMaterialUser;

import java.util.List;

@Service
public class MaterialUserServiceImplement implements IUMaterialUser{
   @Autowired
    private IUMaterialUserRepository mU;
    @Override
    public void insert(MaterialUser materialUser) {
        mU.save(materialUser);
    }

    @Override
    public List<MaterialUser> list() {
        return mU.findAll();
    }

    @Override
    public void delete(int idMaterialUser) {
    mU.deleteById(idMaterialUser);
    }
}
