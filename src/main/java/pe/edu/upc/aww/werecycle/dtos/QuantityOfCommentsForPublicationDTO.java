package pe.edu.upc.aww.werecycle.dtos;

public class QuantityOfCommentsForPublicationDTO {

    public int QuantityOfComments;

    public String namePublication;

    public int getQuantityOfComments() {
        return QuantityOfComments;
    }

    public void setQuantityOfComments(int quantityOfComments) {
        QuantityOfComments = quantityOfComments;
    }

    public String getNamePublication() {
        return namePublication;
    }

    public void setNamePublication(String namePublication) {
        this.namePublication = namePublication;
    }
}
