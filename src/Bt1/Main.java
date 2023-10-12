package Bt1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.2);
        shapes[1] = new Rectangle(25, 35);
        shapes[2] = new Square(40);
        for (Shape shape : shapes) {
            double percent = Math.round(Math.random() * 99) + 1;
            shape.resize(percent);
            System.out.println(shape);
        }
    }
}
