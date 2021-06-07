package com.itimbalenco.homework.homework28052021;

public class CruiseShip extends Ship{
    private int maxNumberOfPassangers;

    public CruiseShip(String name, String year, int maxNumberOfPassangers) {
        super(name, year);
        this.maxNumberOfPassangers = maxNumberOfPassangers;
    }

    public CruiseShip(String name, String year) {
        super(name, year);
    }

    @Override
    public String toString() {
        return "CruiseShip{" +
                "name= " + this.getName() +
                " maxNumberOfPassangers=" + this.maxNumberOfPassangers +
                '}';
    }

    public int getMaxNumberOfPassangers() {
        return maxNumberOfPassangers;
    }

    public void setMaxNumberOfPassangers(int maxNumberOfPassangers) {
        this.maxNumberOfPassangers = maxNumberOfPassangers;
    }
}
