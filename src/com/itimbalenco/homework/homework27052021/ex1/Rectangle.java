package com.itimbalenco.homework.homework27052021.ex1;

import com.itimbalenco.homework.homework27052021.ex2.Printable;

public class Rectangle extends Shape implements Printable {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double area() {
        return 2 * (side1 + side2);
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
