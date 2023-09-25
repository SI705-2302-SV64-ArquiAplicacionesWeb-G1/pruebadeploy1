package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.Likes;

import java.util.List;

public interface ILikeService {
    public void insert(Likes likes);

    public List<Likes>list();
    public void delete(int idLike);

    List<String[]>QuantityOfLikeForPublication();
}
