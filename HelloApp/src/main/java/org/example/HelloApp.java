package org.example;

public class HelloApp {
    public static void main(String[] args) {

        // Case 1: No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // StringBuilder to build names list
        StringBuilder nameBuilder = new StringBuilder();

        // Enhanced for loop
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove trailing ", "
        if (nameBuilder.length() > 0) {
            String names = nameBuilder.substring(0, nameBuilder.length() - 2);
            System.out.println("Hello, " + names + "!");
        }
    }
}