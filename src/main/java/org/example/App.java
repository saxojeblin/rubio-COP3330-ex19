/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        double height = 0, weight = 0, bmi;
        boolean check;
        DecimalFormat fm = new DecimalFormat("0.#");

        do   {
            System.out.print("Please enter your height in inches: ");

            if(input.hasNextInt())  {
                height = input.nextDouble();
                check = true;
            }
            else {
                System.out.print("You did not enter a numeric value. \n");
                check = false;
                input.next();
            }
        } while(!(check));

        do   {
            System.out.print("Please enter your weight in pounds: ");

            if(input.hasNextInt())  {
                weight = input.nextDouble();
                check = true;
            }
            else {
                System.out.print("You did not enter a numeric value. \n");
                check = false;
                input.next();
            }
        } while(!(check));

        bmi = (weight / (height * height)) * 703;

        System.out.printf("Your BMI is %s.\n", fm.format(bmi));

        if (bmi > 25) {
            System.out.println("You are overweight. You should see your doctor.");
        }
        else if(bmi < 18.5) {
            System.out.println("You are underweight. You should see your doctor.");
        }
        else {
            System.out.println("You are within the ideal weight range.");
        }

    }
}
