package ra.models;

public abstract class Animal {
    // abstract _ trừu tượng
    private String name;

    public void eat() {
        System.out.println("anima1 is eating");
    }

    public abstract void makeNoise();

    public static void noti() {
        System.out.println("abc");
    }


}
