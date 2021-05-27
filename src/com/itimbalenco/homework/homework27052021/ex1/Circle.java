package com.itimbalenco.homework.homework27052021.ex1;

public class Circle extends Shape{
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(r, 2);
    }

}
