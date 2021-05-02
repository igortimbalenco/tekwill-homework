package com.itimbalenco.homework.home210421.game;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {

    private Map<Integer, String> map = new HashMap<>();
    private SecureRandom random = new SecureRandom();
    private Scanner scanner = new Scanner(System.in);

    public Game() {
        populateMap();
    }

    private void populateMap(){
        map.put(1, "Rock");
        map.put(2, "Paper");
        map.put(3, "Scissors");
    }

    public String getComputerValue(){
        return  map.get(1+random.nextInt(3));
    }

    public String getHumanValue(){
        System.out.println("Human being, please tell me what is your choise: (1: Rock; 2: Paper; 3: Scissors)");
        int value = scanner.nextInt();
        String str = "";
        while (!(value >= 1 && value <= 3)){
            System.out.println("Oh.. human being... Please enter the value from 1 to 3");
            value = scanner.nextInt();
        }
        return map.get(value);
    }

    public String compare(String computersChoise, String humansChoise) throws Exception {
        if (computersChoise.equals("Rock")) {
            switch (humansChoise) {
                case "Rock":
                    return "Please play again";
                case "Paper":
                    return "Congratulations! You win!";
                case "Scissors":
                    return "Sorry ma'an! Yuo loose!";
            }
        } else if (computersChoise.equals("Paper")) {
            switch (humansChoise) {
                case "Paper":
                    return "Please play again";
                case "Scissors":
                    return "Congratulations! You win!";
                case "Rock":
                    return "Sorry ma'an! Yuo loose!";
            }
        } else/*(computersChoise == "Scissors")*/ {
            switch (humansChoise) {
                case "Scissors":
                    return "Please play again";
                case "Rock":
                    return "Congratulations! You win!";
                case "Paper":
                    return "Sorry ma'an! Yuo loose!";
            }
        }
        throw new Exception("Something broken");
    }
    public void play() throws Exception {
        String result = compare(getComputerValue(), getHumanValue());
        System.out.println(result);
        if (result.equals("Please play again")){
            play();
        }
    }
}
