package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.FrequentQuestions;
import pe.edu.upc.aww.werecycle.repositories.IFrequentQuestionsRepository;
import pe.edu.upc.aww.werecycle.repositories.ITypeUserRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IFrequentQuestionsService;

import java.util.List;

@Service
public class FrequentQuestionsServiceImplement implements IFrequentQuestionsService {
    @Autowired
    private IFrequentQuestionsRepository fqR;

    @Override
    public void insert(FrequentQuestions frequentQuestions) {
        fqR.save(frequentQuestions);

    }

    @Override
    public List<FrequentQuestions> list() {
        return fqR.findAll();
    }

    @Override
    public void delete(int idFrequenQuestions) {
fqR.deleteById(idFrequenQuestions);
    }

    @Override
    public List<FrequentQuestions> findBycategory(String category) {
        return fqR.findBycategory(category);
    }


}
