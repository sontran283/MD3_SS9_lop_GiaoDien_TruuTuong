package Bt4.ra.academy;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayData() {
        System.out.println(
                "Shape{" +
                        "color='" + color + '\'' +
                        '}'
        );
    }

    public abstract void setWidth(double width);

    public abstract double getArea();
}
