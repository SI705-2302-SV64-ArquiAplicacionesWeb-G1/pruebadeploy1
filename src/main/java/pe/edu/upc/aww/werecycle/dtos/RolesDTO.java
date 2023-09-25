package pe.edu.upc.aww.werecycle.dtos;


import pe.edu.upc.aww.werecycle.entities.Useror;

public class RolesDTO {


    private int idTypeUser;

    private String typeAccount;

    private boolean stateType;

    private Useror useror;


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


}