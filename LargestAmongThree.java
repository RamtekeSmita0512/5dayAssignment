package com.Bridgelabz.Day5Assigment;

import java.util.Scanner;

public class LargestAmongThreeNumber {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter Three Number");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        c=r.nextInt();
        if (a>b)
        {
            if(a>c) {
                System.out.println("a");
            } else
                System.out.println("c");

        }else
        {
            if(b>c)
                System.out.println("b");
            else
                System.out.println("c");
        }
    }

}
