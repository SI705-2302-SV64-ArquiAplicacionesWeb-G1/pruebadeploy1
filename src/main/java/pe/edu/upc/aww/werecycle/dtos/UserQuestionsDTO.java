package pe.edu.upc.aww.werecycle.dtos;

import pe.edu.upc.aww.werecycle.entities.FrequentQuestions;
import pe.edu.upc.aww.werecycle.entities.Useror;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class UserQuestionsDTO {
    private int idUserQuestions;
    private FrequentQuestions idFrequenQuestions;

    private Useror idUser;

    public int getIdUserQuestions() {
        return idUserQuestions;
    }

    public void setIdUserQuestions(int idUserQuestions) {
        this.idUserQuestions = idUserQuestions;
    }

    public FrequentQuestions getIdFrequenQuestions() {
        return idFrequenQuestions;
    }

    public void setIdFrequenQuestions(FrequentQuestions idFrequenQuestions) {
        this.idFrequenQuestions = idFrequenQuestions;
    }

    public Useror getIdUser() {
        return idUser;
    }

    public void setIdUser(Useror idUser) {
        this.idUser = idUser;
    }
}
