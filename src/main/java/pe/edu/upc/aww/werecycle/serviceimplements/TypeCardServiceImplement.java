package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.TypeCard;
import pe.edu.upc.aww.werecycle.repositories.ITypeCardRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.ITypeCardService;

import java.util.List;

@Service
public class TypeCardServiceImplement implements ITypeCardService {
    @Autowired
    private ITypeCardRepository tcR;

    @Override
    public void insert(TypeCard typeCard) {
        tcR.save(typeCard);
    }

    @Override
    public List<TypeCard> list() {
        return tcR.findAll();
    }

    @Override
    public void delete(int idTypeCard) {
        tcR.deleteById(idTypeCard);
    }

}
