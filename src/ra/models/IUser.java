package ra.models;

public interface IUser {
    final int count = 0;
    final String name = "Student";

    default void login(String name) {
        if (this.name.equals(name)) {
            System.out.println("dang nhap thanh cong!");
            this.display();
        } else {
            System.out.println("dang nhap that bai");
        }
    }

    void display();

    public static void noti() {
        System.out.println("thong bao cho tat ca nguoi dung");
    }

}
