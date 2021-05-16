package com.itimbalenco.homework.homework14052021;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^(?=.{6,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).*$");
        System.out.println("Please enter your password: ");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        if (matcher.matches()){
            System.out.println("Password ok");
        } else {
            System.out.println("Password doesn't match the pattern");
        }
    }
}
