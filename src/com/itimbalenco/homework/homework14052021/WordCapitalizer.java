package com.itimbalenco.homework.homework14052021;

import java.util.Scanner;

public class WordCapitalizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.println("Please enter your sentence: ");
        string = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(capitalize(string, stringBuilder));

    }

    public static String capitalize(String string, StringBuilder builder){
        String[] strArray = string.split("\\. ");

        for (int i = 0; i < strArray.length; i++){
            strArray[i] = String.valueOf(strArray[i].charAt(0)).toUpperCase() + strArray[i].substring(1);
            builder.append(strArray[i]).append(". ");
        }
        return builder.toString();
    }
}
