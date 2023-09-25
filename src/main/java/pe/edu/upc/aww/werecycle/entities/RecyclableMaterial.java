package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;

@Entity
@Table(name = "RecyclableMaterial")
public class RecyclableMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecyclableMaterial;
    @Column(name = "nameRecyclableMaterial",nullable = false,length = 35)
    private String nameRecyclableMaterial;
    @Column(name = "descriptionRecyclableMaterial",nullable = false,length = 50)
    private String descriptionRecyclableMaterial;
    @Column(name = "typeRecyclableMaterial",nullable = false,length = 35)
    private String typeRecyclableMaterial;

    @Column(name= "cost", nullable = false)
    private int costMaterial;

    public RecyclableMaterial(int idRecyclableMaterial, String nameRecyclableMaterial, String descriptionRecyclableMaterial, String typeRecyclableMaterial, int costMaterial) {
        this.idRecyclableMaterial = idRecyclableMaterial;
        this.nameRecyclableMaterial = nameRecyclableMaterial;
        this.descriptionRecyclableMaterial = descriptionRecyclableMaterial;
        this.typeRecyclableMaterial = typeRecyclableMaterial;
        this.costMaterial = costMaterial;
    }

    public int getCostMaterial() {
        return costMaterial;
    }

    public void setCostMaterial(int costMaterial) {
        this.costMaterial = costMaterial;
    }

    public RecyclableMaterial() {
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
