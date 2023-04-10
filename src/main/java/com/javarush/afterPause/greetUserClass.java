package com.javarush.afterPause;

import java.util.Scanner;

public class greetUserClass {
    public static void main(String[] args) {
        greetUser();
    }

    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

}
