package pe.edu.upc.aww.werecycle.entities;
import pe.edu.upc.aww.werecycle.entities.Recurso;
import javax.persistence.*;

@Entity
@Table(name = "TypeRecurso")
public class TypeRecurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTypeRecurso;
    @Column(name = "TypeRecursotype")
    private String typeRecursotype;
    @OneToOne
    @JoinColumn(name = "id_Recurso")
    private Recurso id_Recurso;

    public TypeRecurso() {
    }

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
