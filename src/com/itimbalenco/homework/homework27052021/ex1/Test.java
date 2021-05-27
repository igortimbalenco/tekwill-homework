package com.itimbalenco.homework.homework27052021.ex1;

public class Test {
    public static void main(String[] args) {
        Shape vec[] = {new Circle(3), new Rectangle(4, 5), new Circle(4), new Circle(8)};

        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }
    }
}
