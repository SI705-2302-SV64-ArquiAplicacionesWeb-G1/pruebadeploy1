package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;

@Entity
@Table(name = "Likes")
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLike;

    @ManyToOne
    @JoinColumn(name = "idPublication")
    private Publication idPublication;


    public Likes() {
    }

    public Likes(int idLike, Publication idPublication, int countLikes) {
        this.idLike = idLike;
        this.idPublication = idPublication;
    }

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
