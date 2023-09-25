package pe.edu.upc.aww.werecycle.dtos;

import pe.edu.upc.aww.werecycle.entities.RecyclableMaterial;
import pe.edu.upc.aww.werecycle.entities.Useror;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class MaterialUserDTO {

    private int idMaterialUser;
    private RecyclableMaterial idRecyclableMaterial;
    private Useror idUser;

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
