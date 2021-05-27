package com.itimbalenco.homework.homework27052021.ex2;

public class Manager extends Employee implements Printable{


    @Override
    public double salary(double hours) {
        return this.hourRate * hours;
    }

    public Manager(String name, double age) {
        super(name, age);
    }

    public Manager(String name, double age, double hourRate) {
        super(name, age, hourRate);
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
