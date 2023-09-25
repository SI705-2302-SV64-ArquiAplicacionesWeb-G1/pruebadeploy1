package pe.edu.upc.aww.werecycle.dtos;

public class QuantityOfLikeForPublicationDTO {
    public int QuantityOfLikes;

    public String namePublication;

    public int getQuantityOfLikes() {
        return QuantityOfLikes;
    }

    public void setQuantityOfLikes(int quantityOfLikes) {
        QuantityOfLikes = quantityOfLikes;
    }

    public String getNamePublication() {
        return namePublication;
    }

    public void setNamePublication(String namePublication) {
        this.namePublication = namePublication;
    }
}
