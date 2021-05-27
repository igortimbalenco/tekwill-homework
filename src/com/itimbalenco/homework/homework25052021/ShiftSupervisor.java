package com.itimbalenco.homework.homework25052021;

import java.time.LocalDate;

public class ShiftSupervisor extends Employee{
    private int annualSalary;
    private int annualProductionBonus;

    public ShiftSupervisor(String name, String number, LocalDate hireDate, int annualSalary, int annualProductionBonus) {
        super(name, number, hireDate);
        this.annualSalary = annualSalary;
        this.annualProductionBonus = annualProductionBonus;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getAnnualProductionBonus() {
        return annualProductionBonus;
    }

    public void setAnnualProductionBonus(int annualProductionBonus) {
        this.annualProductionBonus = annualProductionBonus;
    }
}
