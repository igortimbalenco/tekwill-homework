package com.itimbalenco.homework.forloop31032021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheSumOfIntegersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = new ArrayList<>();
        int from, to, sum = 0;
        System.out.print("Enter start integer number: ");
        from = scanner.nextInt();
        System.out.print("Enter end integer number: ");
        to = scanner.nextInt();
        for(int i = from; i <= to; i++){
            integers.add(i);
            sum += i;
        }
        Integer sum2 = integers.stream().reduce(0, (a, b) -> (a + b));
        System.out.println("The sum of numbers in the given range is: " + sum);
        System.out.println("The sum of numbers in the given range is: " + sum2 + "\nJust experimenting \uD83D\uDE00");
    }
}
