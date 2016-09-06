package model.bean;

/**
 * Created by Sergo on 06-Sep-16.
 */
public class UserContactInfo {
    private int id;
    private Address address;
    private TelNumber telNumber;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public TelNumber getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(TelNumber telNumber) {
        this.telNumber = telNumber;
    }
}
