package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;

@Entity
@Table(name = "MaterialUser")
public class MaterialUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMaterialUser;
    @OneToOne
    @JoinColumn(name ="idRecyclableMaterial")
    private RecyclableMaterial idRecyclableMaterial;
    @OneToOne
    @JoinColumn(name = "idUser")
    private Useror idUser;

    public MaterialUser() {
    }

    public MaterialUser(int idMaterialUser, RecyclableMaterial idRecyclableMaterial, Useror idUser) {
        this.idMaterialUser = idMaterialUser;
        this.idRecyclableMaterial = idRecyclableMaterial;
        this.idUser = idUser;
    }

    public int getIdMaterialUser() {
        return idMaterialUser;
    }

    public void setIdMaterialUser(int idMaterialUser) {
        this.idMaterialUser = idMaterialUser;
    }

    public RecyclableMaterial getIdRecyclableMaterial() {
        return idRecyclableMaterial;
    }

    public void setIdRecyclableMaterial(RecyclableMaterial idRecyclableMaterial) {
        this.idRecyclableMaterial = idRecyclableMaterial;
    }

    public Useror getIdUser() {
        return idUser;
    }

    public void setIdUser(Useror idUser) {
        this.idUser = idUser;
    }
}
