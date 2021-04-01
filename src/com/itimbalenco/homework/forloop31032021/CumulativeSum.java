package com.itimbalenco.homework.forloop31032021;

import java.util.Scanner;

public class CumulativeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, sum;
        System.out.print("Enter your number please: ");
        sum = number = scanner.nextInt();
        System.out.println("The sum of all entered numbers is: " + sum);
        for (int i = 0; number != 0;i++){
            System.out.print("Enter your number please: ");
            number = scanner.nextInt();
            sum += number;
            System.out.println("The sum of all entered numbers is: " + sum);
        }
        System.out.println("Loop terminated");
    }
}
