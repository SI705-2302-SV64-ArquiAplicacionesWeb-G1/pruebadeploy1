package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "FrequenQuestions")
public class FrequentQuestions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFrequenQuestions;

    @Column(name = "question", nullable = false, length = 200)
    private String question;

    @Column(name = "answer", nullable = false, length = 200)
    private String answer;
    @Column(name = "category", nullable = false, length = 100)
    private String category;
    @Column(name = "dificultyLevel", nullable = false, length = 250)
    private String dificultYLevel;
    @Column(name = "updateDate", nullable = false)
    private LocalDate updateDate;
    @Column(name = "publicationStatus", nullable = false, length = 250)
    private String publicationStatus;

    public FrequentQuestions() {
    }

    public FrequentQuestions(int idFrequenQuestions, String question, String answer, String category, String dificultYLevel, LocalDate updateDate, String publicationStatus) {
        this.idFrequenQuestions = idFrequenQuestions;
        this.question = question;
        this.answer = answer;
        this.category = category;
        this.dificultYLevel = dificultYLevel;
        this.updateDate = updateDate;
        this.publicationStatus = publicationStatus;
    }

    public int getIdFrequenQuestions() {
        return idFrequenQuestions;
    }

    public void setIdFrequenQuestions(int idFrequenQuestions) {
        this.idFrequenQuestions = idFrequenQuestions;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDificultYLevel() {
        return dificultYLevel;
    }

    public void setDificultYLevel(String dificultYLevel) {
        this.dificultYLevel = dificultYLevel;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public String getPublicationStatus() {
        return publicationStatus;
    }

    public void setPublicationStatus(String publicationStatus) {
        this.publicationStatus = publicationStatus;
    }
}
