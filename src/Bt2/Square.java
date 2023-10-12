package Bt2;

public class Square extends Shape implements IColorable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }



    @Override
    public void howToColor() {
        System.out.println("Tô màu bốn phía");
    }
}
