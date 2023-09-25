package pe.edu.upc.aww.werecycle.dtos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class RecyclableMaterialDTO {

    private int idRecyclableMaterial;
    private String nameRecyclableMaterial;
    private String descriptionRecyclableMaterial;
    private String typeRecyclableMaterial;
    private int costMaterial;

    public int getCostMaterial() {
        return costMaterial;
    }

    public void setCostMaterial(int costMaterial) {
        this.costMaterial = costMaterial;
    }

    public int getIdRecyclableMaterial() {
        return idRecyclableMaterial;
    }

    public void setIdRecyclableMaterial(int idRecyclableMaterial) {
        this.idRecyclableMaterial = idRecyclableMaterial;
    }

    public String getNameRecyclableMaterial() {
        return nameRecyclableMaterial;
    }

    public void setNameRecyclableMaterial(String nameRecyclableMaterial) {
        this.nameRecyclableMaterial = nameRecyclableMaterial;
    }

    public String getDescriptionRecyclableMaterial() {
        return descriptionRecyclableMaterial;
    }

    public void setDescriptionRecyclableMaterial(String descriptionRecyclableMaterial) {
        this.descriptionRecyclableMaterial = descriptionRecyclableMaterial;
    }

    public String getTypeRecyclableMaterial() {
        return typeRecyclableMaterial;
    }

    public void setTypeRecyclableMaterial(String typeRecyclableMaterial) {
        this.typeRecyclableMaterial = typeRecyclableMaterial;
    }
}
