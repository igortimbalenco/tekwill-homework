package com.itimbalenco.homework.home210421.game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        try {
            game.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
