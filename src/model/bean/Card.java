package model.bean;

/**
 * Created by Sergo on 06-Sep-16.
 */
public class Card {
    private int id;
    private CardType cardType;
    private int serialNumber;
    private String securityCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public Card(int id, CardType cardType, int serialNumber, String securityCode) {
        this.id = id;
        this.cardType = cardType;
        this.serialNumber = serialNumber;
        this.securityCode = securityCode;
    }
}
