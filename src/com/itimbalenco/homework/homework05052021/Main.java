package com.itimbalenco.homework.homework05052021;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.color = Car.Colors.BLACK;
        c1.volume = 2.0;
        System.out.println("\nBrand: " + c1.brand + "\nColor: " + c1.color + "\nVolume: " + c1.volume);

        Car c2 = new Car();
        c2.setBrand("Seat");
        c2.setColor(Car.Colors.BLACK);
        c2.setVolume(1.9);
        System.out.println("\nBrand: " + c2.getBrand() + "\nColor: " + c2.getColor() + "\nVolume: " + c2.getVolume());

        Car c3 = new Car("Renault", Car.Colors.GREY, 1.4);
        System.out.println("\nBrand: " + c3.getBrand() + "\nColor: " + c3.getColor() + "\nVolume: " + c3.getVolume());


    }

}
