package com.itimbalenco.homework.home190421;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.print("Please enter the number: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Numbers in the reverse order");
        for (int i = 9; i >= 0; i--){
            System.out.print(array[i] + " ");
        }

        System.out.println();
        List<Integer> myArray = Arrays.asList(array);
        Collections.reverse(myArray);
        System.out.println(myArray);

    }
}
