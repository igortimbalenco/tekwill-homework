package com.itimbalenco.homework.homework27052021.ex2;

public abstract class Employee {
    String name;
    double age;
    double hourRate;

    public abstract double salary(double hours);

    public Employee(String name, double age, double hourRate) {
        this.name = name;
        this.age = age;
        this.hourRate = hourRate;
    }

    public Employee(String name, double age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hourRate=" + hourRate +
                '}';
    }
}
