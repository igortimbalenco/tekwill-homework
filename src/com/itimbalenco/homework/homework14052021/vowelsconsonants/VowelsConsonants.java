package com.itimbalenco.homework.homework14052021.vowelsconsonants;

import java.util.Scanner;

public class VowelsConsonants {
    public String object;
    public static Scanner scanner = new Scanner(System.in);
    private static String vowels = "aeiouy";
    private static String consonants = "bcdfghjklmnpqrstvwxz";

    public VowelsConsonants(String object) {
        this.object = object;
    }

    public VowelsConsonants() {
    }

    public int countVowels(String string){
        int counter = 0;
        char[] array = string.toCharArray();
        for (int i = 0; i < string.length(); i++){
            if (vowels.contains(Character.toString(array[i])))
                counter++;
        }
        return counter;
    }
    public int countConsonants(String string){
        int counter = 0;
        char[] array = string.toCharArray();
        for (int i = 0; i < string.length(); i++){
            if (consonants.contains(Character.toString(array[i])))
                counter++;
        }
        return counter;
    }

    public String displayMenu(){
        System.out.println("a. Count the number of vowels in the string");
        System.out.println("b. Count the number of consonants in the string");
        System.out.println("c. Count both the vowels and consonants in the string");
        System.out.println("d. Enter another string");
        System.out.println("e. Exit program");
        return scanner.next();
    }

    public void runProgram(){
        while (true){
            System.out.println("Please enter the string: ");
            System.out.println();
            this.object = scanner.nextLine();
            System.out.println();
            String userChoise = displayMenu();
            switch (userChoise){
                case "a":
                    System.out.println("String contains " + countVowels(object) + " of vowels");
                    break;
                case "b":
                    System.out.println("String contains " + countConsonants(object) + " of consonants");
                    break;
                case "c":
                    System.out.println("String contains " + countVowels(object) + " of vowels");
                    System.out.println("String contains " + countConsonants(object) + " of vowels");
                    break;
                case "d":
                    continue;
                case "e":
                    return;
                default:
                    System.out.println("Incorect option selected. Please do the whole procedure from the start");
                    continue;
            }
        }


    }


}
