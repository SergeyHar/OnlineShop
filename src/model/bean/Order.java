package model.bean;

/**
 * Created by Sergo on 06-Sep-16.
 */
public class Order {

    private LineItem lineItem;
    private Card card;
    private Cost totalPrice;

    public LineItem getLineItem() {
        return lineItem;
    }

    public void setLineItem(LineItem lineItem) {
        this.lineItem = lineItem;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Cost getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Cost totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Order(LineItem lineItem, Card card, Cost totalPrice) {
        this.lineItem = lineItem;
        this.card = card;
        this.totalPrice = totalPrice;
    }
}
