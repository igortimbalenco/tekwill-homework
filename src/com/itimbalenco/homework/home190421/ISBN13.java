package com.itimbalenco.homework.home190421;

import java.util.Scanner;
import java.util.stream.Stream;

public class ISBN13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean value = true;
        System.out.println("Please enter the 12 digit book identifier");
        String book = scanner.nextLine();
        char[ ]charArray = book.toCharArray();
        while (value){
            if (charArray.length != 12){
                System.out.println(book + " is an invalid input!");
                continue;
            }
            value = false;

        }

        int[] intArray = new int[book.toCharArray().length];
        int sum = 0;
        for (int i = 0; i < intArray.length; i++){
            sum += intArray[i] = Character.getNumericValue(charArray[i]);
        }
        int isbn13 = 10 - sum % 10;

        System.out.println("isbn13 = " + isbn13);

    }
}
