package pe.edu.upc.aww.werecycle.dtos;


import pe.edu.upc.aww.werecycle.entities.Publication;



public class LikeDTO {
    private int idLike;


    private Publication idPublication;



    public int getIdLike() {
        return idLike;
    }

    public void setIdLike(int idLike) {
        this.idLike = idLike;
    }

    public Publication getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(Publication idPublication) {
        this.idPublication = idPublication;
    }

}
