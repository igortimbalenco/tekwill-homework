package com.itimbalenco.homework.home190421;

import java.util.Scanner;

public class ISBN13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean value = true;
        System.out.println("Please enter the 12 digit book identifier");
        while (value){
            String book = scanner.nextLine();
            if (book.toCharArray().length != 12){
                System.out.println(book + " is an invalid input!");
                continue;
            }
            value = false;
        }

    }
}
