package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String adj1;
        String pluralNoun1;
        String pluralNoun2;
        String color;
        String number1;
        String verb;
        String typeOfLiquid;
        String adj2;
        String pluralNoun3;
        String number2;
        String adj3;
        String noun1;
        String sillyWord;
        String place;
        String adj4;
        String noun2;
        String verbEndingING;
        String partOfBodyPlural;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an adjective.");
        adj1 = scanner.nextLine();
        System.out.println("Enter a plural noun.");
        pluralNoun1 = scanner.nextLine();
        System.out.println("Enter another plural noun.");
        pluralNoun2 = scanner.nextLine();
        System.out.println("Enter a color.");
        color = scanner.nextLine();
        System.out.println("Enter a number.");
        number1 = scanner.nextLine();
        System.out.println("Enter a verb.");
        verb = scanner.nextLine();
        System.out.println("Enter a type of liquid.");
        typeOfLiquid = scanner.nextLine();
        System.out.println("Enter an adjective.");
        adj2 = scanner.nextLine();
        System.out.println("Enter a plural noun.");
        pluralNoun3 = scanner.nextLine();
        System.out.println("Enter a number.");
        number2 = scanner.nextLine();
        System.out.println("Enter an adjective.");
        adj3 = scanner.nextLine();
        System.out.println("Enter a noun.");
        noun1 = scanner.nextLine();
        System.out.println("Enter a silly word.");
        sillyWord = scanner.nextLine();
        System.out.println("Enter a place.");
        place = scanner.nextLine();
        System.out.println("Enter an adjective.");
        adj4 = scanner.nextLine();
        System.out.println("Enter a noun.");
        noun2 = scanner.nextLine();
        System.out.println("Enter a verb ending in 'ing'.");
        verbEndingING = scanner.nextLine();
        System.out.println("Enter a part of the body (plural).");
        partOfBodyPlural = scanner.nextLine();
        System.out.println("\n\n\n");
        System.out.println("While most eggs need " + adj1 + " love and care for the " + pluralNoun1 + " inside to survive, dragon eggs thrive on danger!\n" +
                "In fact, the " + pluralNoun2 + " of " + color + " dragon require a/an " + number1 + "-foot drop in order to " + verb + " open.\n" +
                "Eggs of " + typeOfLiquid + " dragons depend on " + adj2 + " lava from underwater " + pluralNoun3 + " to heat the shells to temperatures of " + number2 + " degrees or more.\n" +
                "Only then can the "+adj3+" dragonets inside finally hatch.\n" +
                "But the "+noun1+" of the skies, the "+sillyWord+" dragon of (the) "+place+", is the most "+adj4+" "+noun2+"-layer of them all!\n"+
                "They have been spotted "+verbEndingING+" int the "+partOfBodyPlural+" of hungry predators, hoping to be swallowed.\n"+
                "Once they hatch, they cause quite a bellyache!");
    }
}
