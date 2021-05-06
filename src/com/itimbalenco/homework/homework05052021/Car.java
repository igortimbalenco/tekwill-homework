package com.itimbalenco.homework.homework05052021;

public class Car {

    enum Colors {GREEN, BLUE, RED, BLACK, PINK, GREY}
    String brand;
    Colors color;
    Double volume;

    public Car() {
        this.brand = "Ford";
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, Colors color) {
        this(brand);
        this.color = color;
    }

    public Car(String brand, Colors color, Double volume) {
        this(brand, color);
        this.volume = volume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    void run (){
        System.out.println("Car is running?...");
    }

}
