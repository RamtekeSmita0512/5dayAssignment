package com.Bridgelabz.Day5Assigment;
import java.util.Scanner;
public class Power2 {

    public static void main(String[] args) {

        // INITIALIZATION
        int n, p, result = 1;
        System.out.println("Enter Number ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        System.out.println("Enter Power ");
        p = r.nextInt();

        for (int i = 1; i <= p; i++) {
            result = n * result;
        }
        System.out.println("Power " + result);
    }
}


