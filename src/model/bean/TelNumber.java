package model.bean;

/**
 * Created by Sergo on 06-Sep-16.
 */
public class TelNumber {

    private NumberType type;
    private String number;

    public NumberType getType() {
        return type;
    }

    public void setType(NumberType type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
