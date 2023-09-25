package pe.edu.upc.aww.werecycle.dtos;

import pe.edu.upc.aww.werecycle.entities.Recurso;

public class TypeRecursoDTO {
    private int idTypeRecurso;
    private String typeRecursotype;
    private Recurso id_Recurso;

    public int getIdTypeRecurso() {
        return idTypeRecurso;
    }

    public void setIdTypeRecurso(int idTypeRecurso) {
        this.idTypeRecurso = idTypeRecurso;
    }

    public String getTypeRecursotype() {
        return typeRecursotype;
    }

    public void setTypeRecursotype(String typeRecursotype) {
        this.typeRecursotype = typeRecursotype;
    }

    public Recurso getId_Recurso() {
        return id_Recurso;
    }

    public void setId_Recurso(Recurso id_Recurso) {
        this.id_Recurso = id_Recurso;
    }
}
