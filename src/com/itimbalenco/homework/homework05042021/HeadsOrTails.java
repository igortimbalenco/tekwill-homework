package com.itimbalenco.homework.homework05042021;

import java.security.SecureRandom;

public class HeadsOrTails {
    public static void main(String[] args) {
        int heads = 0, tails = 0;
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < 1000000; i++){
            if (random.nextBoolean()){
                heads++;
            } else {
                tails++;
            }
        }
        System.out.println("Heads = " + heads + "\nTails = " + tails);
    }
}
