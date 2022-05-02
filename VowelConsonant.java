package com.Bridgelabz.Day5Assigment;


import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter any Character ");
        Scanner r=new Scanner(System.in);
        ch= r.next().charAt(0);
        if(ch=='a' || ch=='o' || ch=='i' || ch=='e' || ch=='u' )
        {
            System.out.println("Vowel ");
        }
        else

        {
            System.out.println("Consonant");
        }
    }

}
