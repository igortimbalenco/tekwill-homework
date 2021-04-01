package com.itimbalenco.homework.forloop31032021;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        System.out.print("Please enter first number: ");
        number1 = scanner.nextInt();
        System.out.print("Please enter second number: ");
        number2 = scanner.nextInt();
        for (int i  = 1; i <= number2; i++){
            System.out.println(number1 + " X " + i + " = " + (number1 * i));
        }

    }
}
