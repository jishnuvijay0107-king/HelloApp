package org.example;

public class HelloApp {
    public static void main(String[] args) {

        // Case 1: No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Use String.join() to concatenate names
        String names = String.join(", ", args);

        // Print final greeting
        System.out.println("Hello, " + names + "!");
    }
}