package com.Bridgelabz.Day5Assignment2;
import java.util.Scanner;
public class WindChill {

            public static void main(String[] args) {

            WindChill windChill = new WindChill();
            windChill.calculateWindChill();
        }

        void calculateWindChill() {
            double t, v, windchill;
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter temperature and speed of the air: ");
            t = sc.nextInt();
            v = sc.nextInt();

            sc.close();

            if(t > 50) {
                System.out.println("temperature should not be greater than 50");
                calculateWindChill();
                return;
            }
            if((v > 120) || (v < 3)) {
                System.out.println("velocity should be greater than 3 and less than 120");
                calculateWindChill();
                return;
            }


            windchill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * (Math.pow(v, 0.16));

            System.out.println("Windchill : " + windchill);
        }
    }

