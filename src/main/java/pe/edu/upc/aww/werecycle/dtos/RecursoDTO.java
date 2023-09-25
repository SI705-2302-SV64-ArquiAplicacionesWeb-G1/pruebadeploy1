package pe.edu.upc.aww.werecycle.dtos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class RecursoDTO {


    private int id_Recurso;

    private String Recursotitulo;

    private String Recursodescripcion;

    private String Recursorutas;

    public int getId_Recurso() {
        return id_Recurso;
    }

    public void setId_Recurso(int id_Recurso) {
        this.id_Recurso = id_Recurso;
    }

    public String getRecursotitulo() {
        return Recursotitulo;
    }

    public void setRecursotitulo(String recursotitulo) {
        Recursotitulo = recursotitulo;
    }

    public String getRecursodescripcion() {
        return Recursodescripcion;
    }

    public void setRecursodescripcion(String recursodescripcion) {
        Recursodescripcion = recursodescripcion;
    }

    public String getRecursorutas() {
        return Recursorutas;
    }

    public void setRecursorutas(String recursorutas) {
        Recursorutas = recursorutas;
    }
}
