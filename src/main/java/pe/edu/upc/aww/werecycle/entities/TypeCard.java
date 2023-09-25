package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "TypeCard")
public class TypeCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTypeCard;

    @ManyToOne
    @JoinColumn(name = "idPymentMethod")
    private PymentMethod idPymentMethod;
    @Column(name = "cardType", length = 20)
    private String cardType;

    @Column(name="codeCard",nullable = false)
    private int codeCard;

    @Column(name = "codeCip",nullable = false)
    private int codeCip;

    @Column(name = "dueDate",nullable = false)
    private LocalDate dueDate;

    @Column(name="stateCard",nullable = false)
    private boolean stateCard;

    @Column(name = "paymentTerms",nullable = false)
    private int paymentTerms;

    public TypeCard() {
    }

    public TypeCard(int idTypeCard, PymentMethod idPymentMethod, String cardType, int codeCard, int codeCip, LocalDate dueDate, boolean stateCard, int paymentTerms) {
        this.idTypeCard = idTypeCard;
        this.idPymentMethod = idPymentMethod;
        this.cardType = cardType;
        this.codeCard = codeCard;
        this.codeCip = codeCip;
        this.dueDate = dueDate;
        this.stateCard = stateCard;
        this.paymentTerms = paymentTerms;
    }

    public int getIdTypeCard() {
        return idTypeCard;
    }

    public void setIdTypeCard(int idTypeCard) {
        this.idTypeCard = idTypeCard;
    }

    public PymentMethod getIdPymentMethod() {
        return idPymentMethod;
    }

    public void setIdPymentMethod(PymentMethod idPymentMethod) {
        this.idPymentMethod = idPymentMethod;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getCodeCard() {
        return codeCard;
    }

    public void setCodeCard(int codeCard) {
        this.codeCard = codeCard;
    }

    public int getCodeCip() {
        return codeCip;
    }

    public void setCodeCip(int codeCip) {
        this.codeCip = codeCip;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isStateCard() {
        return stateCard;
    }

    public void setStateCard(boolean stateCard) {
        this.stateCard = stateCard;
    }

    public int getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(int paymentTerms) {
        this.paymentTerms = paymentTerms;
    }
}
