package com.itimbalenco.homework.forloop31032021;

public class ProductOfOddNumbers {
    public static void main(String[] args) {
        int number = 1;
        for (int i = 1; i <=15; i++){
            if (i % 2 != 0)
                number *= i;
        }
        System.out.println("The product of odd integers is: " + number);
    }
}
