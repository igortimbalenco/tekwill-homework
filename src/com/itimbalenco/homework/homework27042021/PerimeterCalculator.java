package com.itimbalenco.homework.homework27042021;

public class PerimeterCalculator {

    public static int calculatePerimeter(int a, int b, int c){
        return (a + b + c);
    }

    public static int calculatePerimeter(int a){
        return 4 * a;
    }

    public static int calculatePerimeter(int a, int b){
        return 4 * (a + b);
    }

    public static int calculatePerimeter(int a, int b, int c, int d){
        return (a + b + c + d);
    }

    public static double calculatePerimeter(double r){
        return 2 * Math.PI * r;
    }

}
