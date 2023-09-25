package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.Ubication;
import pe.edu.upc.aww.werecycle.repositories.IUbicationRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUbicationService;

import java.util.List;

@Service
public class UbicationServiceImplement implements IUbicationService {
    @Autowired
    private IUbicationRepository uR;
    @Override
    public void insert(Ubication ubication) {
        uR.save(ubication);
    }

    @Override
    public List<Ubication> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int idUbication) {
        uR.deleteById(idUbication);
    }
}
