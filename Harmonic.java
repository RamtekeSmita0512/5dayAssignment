package com.Bridgelabz.Day5Assigment;
import java.util.Scanner;
public class  HarmonicNumber {

    public static void main(String[] args) {


        // INITIALIZATION
        double result = 0, num = 0, i;
        int n;
        Scanner r = new Scanner(System.in);

        // INPUT DATA
        System.out.print("Enter the Harmonic No. you want to find: ");
        n = r.nextInt();


        // COMPUTATION
        for (i = 1; i <= n; i++)
        {
          num = num + (1 / i);
         result = num;
        }
        System.out.println("The value of Harmonic no. " + n + " is: " + result);//

        }

    }



