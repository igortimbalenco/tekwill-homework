package com.itimbalenco.homework.home190421;

import java.util.Scanner;

public class NumberOfUppercase {

    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the string: ");
        string = scanner.nextLine();
        char[] charArray = string.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++){
            if (Character.isUpperCase(charArray[i]))
                counter++;
        }
        System.out.println("The number of uppercase letters in the string is " + counter);
    }
}
