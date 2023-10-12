package ra.models.impl;

import ra.models.IUser;

public class Student implements IUser,IStudent {
    public void display() {
        System.out.println("hien thi voi nguoi dung la " + name);
    }

    public void learn (){
        System.out.println("learning");
    }
}
