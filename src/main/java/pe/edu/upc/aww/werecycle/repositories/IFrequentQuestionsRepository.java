package pe.edu.upc.aww.werecycle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.werecycle.entities.FrequentQuestions;

import java.util.List;

@Repository
public interface IFrequentQuestionsRepository extends JpaRepository<FrequentQuestions,Integer> {

    List<FrequentQuestions> findBycategory(String category);
}
