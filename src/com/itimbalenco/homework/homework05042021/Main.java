package com.itimbalenco.homework.homework05042021;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String customerString = "";
    public static void main(String[] args) {
        customerInfo();
    }

    public static void customerInfo(){
        System.out.print("Please enter one of the following choises: \n");
        System.out.print("c) carnivore               p) pianist\nt) tree                    g) game\n");
        do {
            System.out.print("Please enter a c, p, t or g: ");
            customerString = scanner.next();
            switch (customerString){
                case "c":
                    System.out.println("A maple is a carnivore");
                    break;
                case "p":
                    System.out.println("A maple is a pianist");
                    break;
                case "t":
                    System.out.println("A maple is a tree");
                    break;
                case "g":
                    System.out.println("A maple is a game");
                    break;
                default:
            }
        } while (!(customerString.equals("c")
                || customerString.equals("p")
                || customerString.equals("t")
                || customerString.equals("g")));

    }

}
