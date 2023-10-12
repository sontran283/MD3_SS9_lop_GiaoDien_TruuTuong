package Bt1;

public class Square extends Rectangle implements Resizeable {
    // Không có thêm thuộc tính nào so với lớp cha.
    // Không có phương thức khởi tạo nào sử dụng đối số dầu vào width và length, thay vào đó là đối số side.
    // Phương thức khởi tạo mà không cần đối số đầu vào sẽ đặt giá trị mặc định cho width và height (side) là 1.0.
    // Có getter và setter cho side.
    // Cài đè phương thức setWidth và getWidth để chúng thay đổi giá trị của cả width và height, để bảo toàn tính “vuông”.
    // Được cài đè phương thức toString trả về chuỗi ký tự theo mẫu "A Square with side=xxx,
    // which is a subclass of yyy".Trong đó yyy là kết quả thực thi từ phương thức toString của lớp Rectangle.

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    public void setHeight(double height) {
        setSide(height);
    }

    public String toString() {
        return "Hình vuông có cạnh = "
                + getSide()
                + ", đó là một lớp con của "
                + super.toString();
    }
}
