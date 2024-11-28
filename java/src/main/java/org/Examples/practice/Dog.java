package org.Examples.practice;

import java.util.Scanner;

public class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println(name + " says...\n you fucking pussy");
    }


    public static void main(String[] args) {

        Dog dog = new Dog("Dog", 20);
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want the dog to do?");
        System.out.println("1. Speak");
        System.out.println("2. Walk");
        System.out.println("3. add");
        System.out.println("4. subtract");
        System.out.println("5. exit");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println();
        }
    }
}
