package com.itimbalenco.homework.flowcontrol;

import java.util.Scanner;

public class AnymalSound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String anymal, sound;
        System.out.print("Enter the anymal: ");
        anymal = scanner.next();
        if (anymal.equals("Wolf".toLowerCase()))
            sound = "Howl";
        else if (anymal.equals("Sheep".toLowerCase()))
            sound = "Baaaa";
        else
            sound = "Incorrect input";
        System.out.println(sound);
    }


}
