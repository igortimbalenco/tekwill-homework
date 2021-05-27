package com.itimbalenco.homework.homework27052021.ex2;

import com.itimbalenco.homework.homework27052021.ex1.Rectangle;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable vec[] = {new Rectangle(200, 100), new SportCar("Fiat", 7892321),
        new Rectangle(34, 32), new Manager("Joseph", 32), new SportCar("Audi TT", 4322344),
        new SportCar("Mazda", 4322343), new Manager("Moshe", 2222222)};

        for (int i = 0; i < vec.length; i++) {
            vec[i].print();
        }

    }
}
