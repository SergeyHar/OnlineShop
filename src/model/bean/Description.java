package model.bean;

/**
 * Created by Sergo on 06-Sep-16.
 */
public class Description {
    private String width;
    private String height;
    private String color;
    private String weight;

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Description{" +
                "width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
