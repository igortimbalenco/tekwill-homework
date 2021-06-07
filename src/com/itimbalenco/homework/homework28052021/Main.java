package com.itimbalenco.homework.homework28052021;

public class Main {
    public static void main(String[] args) {
        Ship shipArray[] = {new CargoShip("CargoShip_1", "1983-12-12", 1800),
                new CruiseShip("CruiseShip_1", "1998-12-12", 900),
                new CargoShip("CargoShip_2", "20016-12-12", 1400)};
        for (Ship ship : shipArray) {
            System.out.println(ship);
        }

    }
}
