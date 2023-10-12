package Bt2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(4, 5);
        shapes[1] = new Square(2.5);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Dien tich: " + shapes[i].getArea());
            if (shapes[i] instanceof IColorable) {
                ((IColorable) shapes[i]).howToColor();
            }
        }
    }
}
