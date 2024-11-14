package org.example;

import java.util.Scanner;

public class Homework {

    public static void homework1(String[] args) {
        String question = "Which is the capital of Georgia?";
        String correctAnswer = "Tbilisi";
        Scanner scanner = new Scanner(System.in);
        String userAnswer = "";


        while (!userAnswer.equals(correctAnswer)) {
            System.out.println(question + " " + "Type Your Answer" + ":");
            userAnswer = scanner.nextLine();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Your Answer is Correct!");
                break; };



        }
    }
}





