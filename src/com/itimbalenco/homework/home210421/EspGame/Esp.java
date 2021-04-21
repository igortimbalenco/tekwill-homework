package com.itimbalenco.homework.home210421.EspGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Esp {
    public static void main(String[] args) {
        Map<Integer, String> integerStringMap = new TreeMap<>();

        populateMap(integerStringMap);

        Random random = new Random();
        String color = "";
        int counter = 0;
        for (int i = 0; i < 10; i++){
            System.out.print("Please enter the color the computer has selected: ");
            try {
                color = getUsersData();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (color.toLowerCase().equals(integerStringMap.get(random.nextInt(5))))
                counter++;
        }
        System.out.println("User successfully guessed the color " + counter + " times");

    }

    public static void populateMap (Map<Integer, String> integerStringMap){
        integerStringMap.put(0, "red");
        integerStringMap.put(1, "green");
        integerStringMap.put(2, "blue");
        integerStringMap.put(3, "orange");
        integerStringMap.put(4, "yellow");
    }

    public  static String getUsersData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String usersChoise = reader.readLine();
        return usersChoise;
    }




}
