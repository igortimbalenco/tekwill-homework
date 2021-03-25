package com.itimbalenco.homework.flowcontrol;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 number: ");
        int maxNumber, number = scanner.nextInt();
        maxNumber = number;
        for (int i = 1; i < 3; i++){
            System.out.print("Enter " + (1+i) + " number: ");
            number = scanner.nextInt();
            if (number > maxNumber){
                maxNumber = number;
            }
        }
        System.out.println("Max number is " + maxNumber);
    }
}
