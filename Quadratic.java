package com.Bridgelabz;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Quadratic {

    public static void main(String[] args) {

        System.out.println("Enter the value of A, B, C : ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("The Equation is: " +a+"x*x+"+b+"*x+"+c);
        int delta = b*b - 4*a*c;

        double Root1 = (-b + sqrt(delta))/(2*a);
        double Root2 = (-b - sqrt(delta))/(2*a);

        System.out.println("Root 1 of x: " +Root1);
        System.out.println("Root 2 of x: " +Root2);

    }
}