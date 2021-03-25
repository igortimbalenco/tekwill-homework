package com.itimbalenco.homework.flowcontrol;

import java.util.Scanner;

public class WeekdayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day number: ");
        int dayNumber = scanner.nextInt();
        switch (dayNumber){
            case 1:
                System.out.print("The day is: Monday");
                break;
            case 2:
                System.out.print("The day is: Tuesday");
                break;
            case 3:
                System.out.print("The day is: Wednesday");
                break;
            case 4:
                System.out.print("The day is: Thursday");
                break;
            case 5:
                System.out.print("The day is: Friday");
                break;
            case 6:
                System.out.print("The day is: Saturday");
                break;
            case 7:
                System.out.print("The day is: Sunday");
                break;
            default:
                System.out.print("Incorrect number entered");
        }

    }
}
