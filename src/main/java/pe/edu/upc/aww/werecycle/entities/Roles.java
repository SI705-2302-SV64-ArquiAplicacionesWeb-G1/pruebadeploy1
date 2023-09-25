package pe.edu.upc.aww.werecycle.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Roles", uniqueConstraints = { @UniqueConstraint(columnNames = { "idUser", "typeAccount" }) })
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTypeUser;
    @Column(name = "typeAccount", length = 20, nullable = false)
    private String typeAccount;
    @Column(name = "stateType", nullable = false)
    private boolean stateType;

    @ManyToOne()
    @JsonIgnore
    @JoinColumn(name = "idUser")
    private Useror useror;

    public Roles() {
    }

    public Roles(int idTypeUser, String typeAccount, boolean stateType, Useror useror) {
        this.idTypeUser = idTypeUser;
        this.typeAccount = typeAccount;
        this.stateType = stateType;
        this.useror = useror;
    }

    public int getIdTypeUser() {
        return idTypeUser;
    }

    public void setIdTypeUser(int idTypeUser) {
        this.idTypeUser = idTypeUser;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public boolean isStateType() {
        return stateType;
    }

    public void setStateType(boolean stateType) {
        this.stateType = stateType;
    }

    public Useror getUseror() {
        return useror;
    }

    public void setUseror(Useror useror) {
        this.useror = useror;
    }
}