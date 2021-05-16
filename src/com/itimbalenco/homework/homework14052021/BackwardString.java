package com.itimbalenco.homework.homework14052021;

import java.util.Scanner;

public class BackwardString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.println("Please enter the word: ");
        string = scanner.next();
        for (int i = string.length() - 1; i >=0; i--){
            System.out.print(string.charAt(i));
        }
    }
}
