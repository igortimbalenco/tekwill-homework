package com.itimbalenco.homework.homework28052021;

public class CargoShip extends Ship{
    private int capacity;

    public CargoShip(String name, String year) {
        super(name, year);
    }

    public CargoShip(String name, String year, int capacity) {
        super(name, year);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "CargoShip{" +
                "name=" + this.getName() +
                " capacity=" + capacity +
                '}';
    }
}
