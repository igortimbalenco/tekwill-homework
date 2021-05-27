package com.itimbalenco.homework.homework20may;

import java.time.LocalDate;
import java.time.Period;

public class ProgrammersDay {
    public static void main(String[] args) {
        LocalDate programmersDay = LocalDate.ofYearDay(2021, 253);
        System.out.println("Programmers day is: " + programmersDay.getMonth() + " " +
                programmersDay.getDayOfMonth() + " " + programmersDay.getDayOfWeek());

        LocalDate localDate = LocalDate.of(1988, 06, 07);
        Period period = Period.between(localDate, LocalDate.now());
        int days = period.getYears() * 365 + programmersDay.getDayOfYear();
        System.out.println(days);

    }

}
