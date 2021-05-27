package com.itimbalenco.homework.homework27052021.ex2;

public class Clerk extends Employee{
    public Clerk(String name, double age, double hourRate) {
        super(name, age, hourRate);
    }

    @Override
    public double salary(double hours) {
        return hours * this.hourRate;
    }
}
