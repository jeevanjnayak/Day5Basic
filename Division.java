package com.Bridgelabz;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        System.out.println("Enter The Dividend Number : ");
        Scanner sc = new Scanner(System.in);
        int Dividend = sc.nextInt();

        System.out.println("Enter The Divisor Number : ");
        Scanner ac = new Scanner(System.in);
        int Divisor = ac.nextInt();

        int Quotient = Dividend / Divisor;

        int Remainder = Dividend % Divisor;

        System.out.println("the quotient and remainder are " +Quotient+ " & " +Remainder);
    }
}