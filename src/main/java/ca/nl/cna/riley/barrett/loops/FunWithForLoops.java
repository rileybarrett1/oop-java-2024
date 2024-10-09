package src.main.java.ca.nl.cna.riley.barrett.loops;

import java.util.Scanner;

public class FunWithForLoops {

    public static void main(String[] args) {
        System.out.println("Fun with loops");

        Scanner input = new Scanner(System.in);

        System.out.print("How many wya's do you want? : ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("What are yah at der budddy? \n");
        }
    }
}
