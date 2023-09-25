package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "UserQuestions")
public class UserQuestions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUserQuestions;
    @ManyToOne
    @JoinColumn(name = "idFrequenQuestions")
    private FrequentQuestions idFrequenQuestions;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private Useror idUser;

    public UserQuestions() {
    }

    public UserQuestions(int idUserQuestions, FrequentQuestions idFrequenQuestions, Useror idUser) {
        this.idUserQuestions = idUserQuestions;
        this.idFrequenQuestions = idFrequenQuestions;
        this.idUser = idUser;
    }

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
