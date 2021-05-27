package com.itimbalenco.homework.homework25052021;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
    private Pattern pattern = Pattern.compile("[0-9]{3}-[A-M]");
    private Matcher matcher;
    private String name;
    private String number;
    private LocalDate hireDate;

    public Employee(String name, String number, LocalDate hireDate) {
        this.name = name;
        this.matcher = pattern.matcher(number);
        if (matcher.matches()){
            this.number = number;
        } else {
            System.err.println("Employee number should match the following pattern: [0-9]{3}-[A-M]");
        }
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) throws Exception {
        if (matcher.matches()){
            this.number = number;
        } else {
            throw new Exception("Employee number should match the following pattern: [0-9]{3}-[A-M]");
        }
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}
