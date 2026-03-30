package org.example;

public class HelloApp {
    public static void main(String[] args) {

        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Enhanced for loop to process multiple names
        for (String name : args) {
            System.out.println("Hello, " + name + "!");
        }
    }
}