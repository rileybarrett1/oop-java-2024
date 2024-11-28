package org.Examples.practice;

import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("You are older than 18 years!");
        }

        else {
            System.out.println("You are grater than 18 years!");
        }
    }
}
