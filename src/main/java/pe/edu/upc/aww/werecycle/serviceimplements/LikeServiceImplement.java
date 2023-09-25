package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.dtos.PublicationLikesDTO;
import pe.edu.upc.aww.werecycle.entities.Likes;
import pe.edu.upc.aww.werecycle.repositories.IlikeRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.ILikeService;

import java.util.List;

@Service
public class LikeServiceImplement implements ILikeService {

    @Autowired
    private IlikeRepository lR;


    @Override
    public void insert(Likes likes) {
        lR.save(likes);
    }

    @Override
    public List<Likes> list() {
        return lR.findAll();
    }

    @Override
    public void delete(int idLike) {
        lR.deleteById(idLike);
    }

    @Override
    public List<String[]> QuantityOfLikeForPublication() {
        return lR.QuantityOfLikeForPublication();
    }



}
