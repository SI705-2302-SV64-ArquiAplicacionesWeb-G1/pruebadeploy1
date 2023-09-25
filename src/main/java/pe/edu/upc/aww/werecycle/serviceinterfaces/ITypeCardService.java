package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.TypeCard;

import java.util.List;

public interface ITypeCardService {

    public void insert(TypeCard typeCard);
    public List<TypeCard> list();
    public void delete(int idTypeCard);

}
