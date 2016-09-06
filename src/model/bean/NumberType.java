package model.bean;

/**
 * Created by Sergo on 06-Sep-16.
 */
public enum NumberType {
    Home(1),
    Work(2),
    MOBILE(3)
    ;
    int id;

    public int getId() {
        return id;
    }

    NumberType(int id) {
        this.id = id;
    }
}
