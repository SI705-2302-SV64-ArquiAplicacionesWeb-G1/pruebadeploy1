package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.Comment;
import pe.edu.upc.aww.werecycle.repositories.ICommentRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.ICommentService;

import java.util.List;

@Service
public class CommentServiceImplement implements ICommentService {
    @Autowired
    private ICommentRepository cR;
    @Override
    public void insert(Comment comment) {
        cR.save(comment);
    }

    @Override
    public List<Comment> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idComment) {
        cR.deleteById(idComment);
    }

    @Override
    public List<String[]> QuantityOfCommentsForPublication() {
        return cR.QuantityOfCommentsForPublication();
    }
}
