package pe.edu.upc.aww.werecycle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.werecycle.entities.UserQuestions;

@Repository
public interface IUserQuestionsRepository extends JpaRepository<UserQuestions,Integer> {


}
