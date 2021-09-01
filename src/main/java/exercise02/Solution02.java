/*
   UCF COP3330 Fall 2021 Assignment 1 Solution
   Copyright 2021 Jonathan Caques
 */
package exercise02;

import java.util.Scanner;

public class Solution02 {
    /*
       Print "What is the input string?"
       Use a scanner to read the user input
       String name = input.next()
       Print name + "has " + name.length "characters."
     */
    public static void main(String[] args) {
        System.out.println("What is the input string?");

        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.println(name + " has " + name.length() + " characters.");
    }
}
