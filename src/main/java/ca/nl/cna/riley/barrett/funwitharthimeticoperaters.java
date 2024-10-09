package src.main.java.ca.nl.cna.riley.barrett;

import java.util.Scanner;

public class funwitharthimeticoperaters {
    public static void main(String[] args) {
        System.out.println("Fun with arthimetic operaters");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements you wish to enter: ");

        int y = input.nextInt();
        System.out.println("Enter the number of elements you wish to enter: ");
        int x = input.nextInt();

        System.out.printf("\n %d + %d = %d ",x , y, x+y);

        System.out.printf("\n %d * %d = %d ",x , y, x*y);

        System.out.printf("\n %d / %d = %d ",x , y, x/y);

        System.out.printf("\n %d - %d = %d ",x , y, x-y);

    }
}
