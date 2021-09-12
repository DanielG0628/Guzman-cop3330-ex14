package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables and create scanner
        double totalAfterTax, orderA, tax;
        String state, WI = "WI";
        Scanner sc = new Scanner(System.in);

        //Prompt user and scan inputs
        System.out.println("What is the order amount?");
        orderA = sc.nextDouble();
        System.out.println("What is the state?");
        state = sc.next();

        //calculations, if statement, and output
        totalAfterTax = orderA;

        if(state.compareTo(WI) == 0){
            tax = orderA * 0.055;
            System.out.println("The subtotal is $" + orderA + ".");
            System.out.println("The tax is $" + tax + ".");
            totalAfterTax = orderA + tax;
        }

        System.out.println("The total is $" + totalAfterTax + ".");

        //close scanner
        sc.close();
    }
}