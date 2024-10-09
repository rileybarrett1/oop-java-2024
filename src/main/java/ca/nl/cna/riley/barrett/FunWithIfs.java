package src.main.java.ca.nl.cna.riley.barrett;

import java.util.Scanner;

public class FunWithIfs {
    public static void main(String[] args) {
        System.out.println("Fun with arithmetic operators");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements you wish to enter: ");

        int y = input.nextInt();
        System.out.println("Enter the number of elements you wish to enter: ");
        int x = input.nextInt();

        if(x==y){
            System.out.printf("%d ==%d",x,y);
    }
        if(x!=y){
            System.out.printf("%d !=%d",x,y);
        }
        if(x<y){
            System.out.printf("%d < %d",x,y);
        }
        if(x>y){
            System.out.printf("%d > %d",x,y);
        }
}

}
