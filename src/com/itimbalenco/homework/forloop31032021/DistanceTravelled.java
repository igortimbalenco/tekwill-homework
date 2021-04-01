package com.itimbalenco.homework.forloop31032021;

import java.util.Scanner;

public class DistanceTravelled {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed, hours;
        System.out.print("Please enter the speed: ");
        speed = scanner.nextInt();
        System.out.print("Please enter time travelled: ");
        hours = scanner.nextInt();
        System.out.println("HOURS          DISTANCE TRAVELLED");
        System.out.println("---------------------------------");
        for (int i  = 1; i <= hours; i++){
            System.out.println(i + "                " + (speed * i));
        }

    }

}
