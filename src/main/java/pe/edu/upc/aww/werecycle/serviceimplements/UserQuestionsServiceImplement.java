package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.UserQuestions;
import pe.edu.upc.aww.werecycle.repositories.IUserQuestionsRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUserQuestionsService;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class UserQuestionsServiceImplement implements IUserQuestionsService {
    @Autowired
    private IUserQuestionsRepository uR;

    @Override
    public void insert(UserQuestions userQuestions) {
        uR.save(userQuestions);
    }

    @Override
    public List<UserQuestions> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int idUserQuestions) {
        uR.deleteById(idUserQuestions);

    }
}
