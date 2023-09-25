package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.Roles;

import java.util.List;

public interface ITypeUserService {
    public void insert(Roles roles);

    public List<Roles>list();
    public void delete(int idTypeUser);
}
