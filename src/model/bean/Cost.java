package model.bean;

/**
 * Created by Sergo on 06-Sep-16.
 */
public class Cost {

    private double cost;
    private String currency;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Cost(double cost, String currency) {
        this.cost = cost;
        this.currency = currency;
    }
}
