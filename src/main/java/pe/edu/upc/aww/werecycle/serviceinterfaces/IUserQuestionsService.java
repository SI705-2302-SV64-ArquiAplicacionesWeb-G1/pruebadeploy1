package pe.edu.upc.aww.werecycle.serviceinterfaces;


import pe.edu.upc.aww.werecycle.entities.RecyclingCenter;
import pe.edu.upc.aww.werecycle.entities.UserQuestions;

import java.util.List;

public interface IUserQuestionsService {
    public void insert(UserQuestions userQuestions);
    public List<UserQuestions> list();
    public void delete(int idUserQuestions);
}
