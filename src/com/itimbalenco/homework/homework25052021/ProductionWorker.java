package com.itimbalenco.homework.homework25052021;

import java.time.LocalDate;

public class ProductionWorker extends Employee{

    private int shift;
    private double payRate;

    public ProductionWorker(String name, String number, LocalDate hireDate) {
        super(name, number, hireDate);
    }

    public ProductionWorker(String name, String number, LocalDate hireDate, int shift, double payRate) throws Exception {
        super(name, number, hireDate);
        if (shift == 1 || shift == 2){
            this.shift = shift;
        } else {
            throw new Exception("Shift should be either 1 (day) or 2 (night)");
        }
        this.payRate = payRate * shift;
    }
}
