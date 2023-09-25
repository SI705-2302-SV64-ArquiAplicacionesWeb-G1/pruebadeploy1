package pe.edu.upc.aww.werecycle.dtos;

import pe.edu.upc.aww.werecycle.entities.TypeRecurso;
import pe.edu.upc.aww.werecycle.entities.Useror;

import javax.persistence.*;
import java.time.LocalDate;

public class PublicationDTO {

    private int idPublication;
    private String title;
    private LocalDate datePublication;

    private TypeRecurso id_TypeRecurso;

    private Useror idUser;

    public int getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(int idPublication) {
        this.idPublication = idPublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(LocalDate datePublication) {
        this.datePublication = datePublication;
    }

    public TypeRecurso getId_TypeRecurso() {
        return id_TypeRecurso;
    }

    public void setId_TypeRecurso(TypeRecurso id_TypeRecurso) {
        this.id_TypeRecurso = id_TypeRecurso;
    }

    public Useror getIdUser() {
        return idUser;
    }

    public void setIdUser(Useror idUser) {
        this.idUser = idUser;
    }
}
