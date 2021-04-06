package com.itimbalenco.homework.homework05042021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsScore {
    public static void main(String[] args) {
//        List<Student> studentList = new ArrayList<>();
        int score;
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        Student maxScoreStudent = new Student("", 0);
        for (int i = 0; i < numberOfStudents; i++){
            System.out.print("Please enter student's name: ");
            name = scanner.next();
            System.out.print("Please enter student's score: ");
            score = scanner.nextInt();
            Student student = new Student(name, score);
            if(maxScoreStudent.score < student.score)
                maxScoreStudent = student;

        }
        System.out.println("The best student's name is: " + maxScoreStudent.name);
    }

}
