package model.bean;

/**
 * Created by Sergo on 06-Sep-16.
 */
public enum CardType {
    MASTER(1),
    MAESTRO(2),
    VISA(3),
    VISAELECTRON(4);
    int id;

    public int getId() {
        return id;
    }

    CardType(int id) {
        this.id = id;
    }
}
