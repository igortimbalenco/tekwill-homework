package com.itimbalenco.homework.homework27052021.ex1;

public abstract class Shape {
    public abstract double area();

    @Override
    public String toString() {
        return "The area is: " + area();
    }
}
