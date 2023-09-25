package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;

@Entity
@Table(name = "Comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComment;

    @ManyToOne
    @JoinColumn(name = "idPublication")
    private Publication idPublication;

    @Column(name = "description",length = 255,nullable = false)
    private String description;

    public Comment() {
    }

    public Comment(int idComment, Publication idPublication, String description) {
        this.idComment = idComment;
        this.idPublication = idPublication;
        this.description = description;
    }

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public Publication getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(Publication idPublication) {
        this.idPublication = idPublication;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
