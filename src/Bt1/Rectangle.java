package Bt1;

public class Rectangle extends Shape implements Resizeable {
    // Có thêm hai thuộc tính là width và length (double).
    // Có ba phương thức khởi tạo. Phương thức khởi tạo mà không cần đối số đầu
    // vào sẽ đặt giá trị mặc định cho width và length là 1.0.
    // Có các getter và setter cho tất cả các thuộc tính.
    // Có phương thức getArea và getPerimeter trả về diện tích và chu vi của hình.
    // Được cài đè phương thức toString trả về chuỗi ký tự
    // theo mẫu "A Rectangle with width=xxx and length=zzz, which is a subclass of yyy".
    // Trong đó yyy là kết quả thực thi từ phương thức toString của lớp Shape.
    // Có một lớp con là lớp Square.

    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(double side, double v, String color, boolean filled) {
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void resize(double percent) {
        width += width * (percent / 100);
        length += length * (percent / 100);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width * this.length);
    }

    @Override
    public String toString() {
        return " Một hình chữ nhật có chiều rộng "
                + getWidth()
                + " and length "
                + getLength()
                + " đó là một lớp con của "
                + super.toString();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
