package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *Copyright 2021 Daniela Gomez-Dugan
 */
public class PizzaParty
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("How manny people in your party? ");
        int num_people = input.nextInt();

        System.out.print("How many pizzas do you have? ");
        int num_pizzas = input.nextInt();

        System.out.print("How many slices per pizza? ");
        int num_slices = input.nextInt();

        int total_slices = (num_slices * num_pizzas);
        System.out.println(num_people + " people with " + num_pizzas + " pizzas (" + total_slices + " slices)");

        int slices_per_person = total_slices / num_people;

        if (slices_per_person == 1)
            System.out.println("Each person gets " + slices_per_person + " piece of pizza.");
        else
            System.out.println("Each person gets " + slices_per_person + " pieces of pizza.");

        System.out.println("There are " + (total_slices % num_people) + " leftover pieces.");
    }
}
