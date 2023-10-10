package com.pluralsight;

import java.util.*;
public class FullNameApp {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        String welcome = (" Please enter your name ");
        System.out.println(welcome);

        System.out.print(" First Name: ");
        String first = myScanner.nextLine();

        System.out.print(" Middle Name: ");
        String middle = myScanner.nextLine();

        System.out.print(" Last Name: ");
        String last= myScanner.nextLine();

        System.out.print(" Suffix: ");
        String suffix = myScanner.nextLine();

        System.out.println(" Full Name: " + first + " " + middle + " " +last + suffix);







    }
}
