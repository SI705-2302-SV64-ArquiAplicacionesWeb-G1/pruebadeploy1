package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.MaterialUser;

import java.util.List;

public interface IUMaterialUser {

    public void insert(MaterialUser materialUser);
    public List<MaterialUser>list();
    public void delete(int idMaterialUser);
}
