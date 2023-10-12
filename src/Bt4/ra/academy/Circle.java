package Bt4.ra.academy;

public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
