package pe.edu.upc.aww.werecycle.dtos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDate;

public class FrequentQuestionsDTO {
    private int idFrequenQuestions;
    private String question;
    private String answer;
    private String category;
    private String dificultYLevel;
    private LocalDate updateDate;
    private String publicationStatus;

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
