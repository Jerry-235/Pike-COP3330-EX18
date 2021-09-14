/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 jeremiah pike
 */



import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {


        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter C or F: ");
        String mode = input1.nextLine();

        System.out.println("How many degrees in " + mode);
        double degrees = input1.nextDouble();



        if (Objects.equals(mode.toUpperCase(Locale.ROOT), "C")) {
            double F = (degrees * (1.8) + 32);
            System.out.printf("The temperature in F is: " + F);

        } else {
            double C = (degrees - 32) * (0.556);
            System.out.printf("The temperature in C is: "+ C);





        }
    }
    
}
