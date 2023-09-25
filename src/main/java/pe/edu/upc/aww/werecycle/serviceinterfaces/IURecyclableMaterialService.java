package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.RecyclableMaterial;

import java.util.List;

public interface IURecyclableMaterialService {
    public void insert(RecyclableMaterial recyclableMaterial);
    public List<RecyclableMaterial>list();
    public void delete(int idRecyclableMaterial);
    List<RecyclableMaterial>findRecyclableMaterialByNameRecyclableMaterial(String NameRecyclableMaterial);
    List<RecyclableMaterial>findRecyclableMaterialByTypeRecyclableMaterial(String TypeRecyclableMaterial);
}
