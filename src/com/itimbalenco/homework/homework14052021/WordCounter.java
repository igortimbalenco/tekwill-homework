package com.itimbalenco.homework.homework14052021;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.println("Please enter your sentence: ");
        string = scanner.nextLine();
        System.out.println(string.split(" ").length);
    }
}
