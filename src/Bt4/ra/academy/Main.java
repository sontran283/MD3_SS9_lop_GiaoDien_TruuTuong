package Bt4.ra.academy;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("red", 2, 3);
        Shape circle = new Circle("yellow", 4);

        rectangle.displayData();
        System.out.println("hinh chu nhat: " + rectangle.getArea());

        circle.displayData();
        System.out.println("hinh tron: " + circle.getArea());
    }
}
