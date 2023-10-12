import ra.models.Animal;
import ra.models.IUser;
import ra.models.impl.Dog;
import ra.models.impl.Student;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeNoise();

        Animal doggo = new Dog();
        doggo.makeNoise();
        Dog.noti();

        IUser user = new Student();
        user.login("Student");

        IUser.noti();
    }
}