package pe.edu.upc.aww.werecycle.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.Useror;
import pe.edu.upc.aww.werecycle.repositories.IUserRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUserService;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private IUserRepository uR;

    //private EventsRepository eR;
    @Override
    public void insert(Useror user) {
        uR.save(user);
    }

    @Override
    public List<Useror> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int idUser) {
        uR.deleteById(idUser);
    }

    @Override
    public List<Useror> findByUserName(String userName)
    {
        return uR.findByUserName(userName);
    }

    @Override
    public Useror findById(int id) {
        return uR.findById(id).orElse(new Useror());
    }

}
