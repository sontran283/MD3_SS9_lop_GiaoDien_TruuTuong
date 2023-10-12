package Bt1;

public class Circle extends Shape implements Resizeable {
    // Có thêm thuộc tính radius (double).
    // Có ba phương thức khởi tạo. Phương thức khởi tạo mà không cần đối số đầu vào sẽ đặt giá trị mặc định cho radius là 1.0.
    // Có các getter và setter cho cả ba phương thức.
    // Có phương thức getArea và getPerimeter trả về diện tích và chu vi của hình.
    // Được cài đè phương thức toString trả về chuỗi ký tự theo mẫu "A Circle with radius=xxx,
    // which is a subclass of yyy". Trong đó yyy là kết quả thực thi từ phương thức toString của lớp Shape.
    private double radius = 1.0;

    public Circle() {

    }

    @Override
    public void resize(double percent) {
        this.radius += this.radius * (percent / 100);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        this.radius = radius;
    }

    // tinh chu vi va dien tich __________
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    // ___________________________________

    @Override
    public String toString() {
        return "Một đường tròn có bán kính "
                + getRadius()
                + " đó là một lớp con của "
                + super.toString();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
