package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;

@Entity
@Table(name = "Recurso")
public class Recurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Recurso;
    @Column(name = "Recursotitulo", length = 20, nullable = false)
    private String RecursoTitulo;
    @Column(name = "Recursodescripcion", length = 70, nullable = false)
    private String Recursodescripcion;
    @Column(name = "Recursorutas", length = 20, nullable = false)
    private String Recursorutas;

    public Recurso() {
    }

    public Recurso(int id_Recurso, String recursoTitulo, String recursodescripcion, String recursorutas) {
        this.id_Recurso = id_Recurso;
        RecursoTitulo = recursoTitulo;
        Recursodescripcion = recursodescripcion;
        Recursorutas = recursorutas;
    }

    public int getId_Recurso() {
        return id_Recurso;
    }

    public void setId_Recurso(int id_Recurso) {
        this.id_Recurso = id_Recurso;
    }

    public String getRecursoTitulo() {
        return RecursoTitulo;
    }

    public void setRecursoTitulo(String recursoTitulo) {
        RecursoTitulo = recursoTitulo;
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
