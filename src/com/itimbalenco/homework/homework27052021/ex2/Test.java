package com.itimbalenco.homework.homework27052021.ex2;

public class Test {
    public static void main(String[] args) {
        Employee vec[] = {new Manager("John", 52, 104), new Clerk("Moshe", 26, 110),
        new Manager("Christoffer", 42, 120), new Manager("Johansson", 34, 120)};

        double hours[] = {140, 150, 130, 180};
        double total = 0;

        for (int i = 0; i < vec.length; i++) {
            total += vec[i].salary(hours[i]);
            System.out.println(vec[i]);
        }

        System.out.println("The total payment of the employees is: " + total);
    }
}
