package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.FrequentQuestions;
import pe.edu.upc.aww.werecycle.entities.UserQuestions;

import java.util.List;

public interface IFrequentQuestionsService {
    public void insert(FrequentQuestions frequentQuestions);

    public List<FrequentQuestions> list();

    public void delete(int idFrequenQuestions);

    List<FrequentQuestions> findBycategory(String category);


}
