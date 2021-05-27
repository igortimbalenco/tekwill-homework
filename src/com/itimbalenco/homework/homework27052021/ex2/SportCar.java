package com.itimbalenco.homework.homework27052021.ex2;

public class SportCar implements Printable{
    private String name;
    private int number;

    public SportCar(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
