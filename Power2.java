package com.Bridgelabz;

import java.util.Scanner;

public class Power2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int TempNum = 0, FactNum = 2, Result = 1;
        System.out.print("Enter the Power : ");
        int n = input.nextInt();
        if (n > 0 && n < 32) {
            while (TempNum < n) {
                Result *= FactNum;
                TempNum += 1;
                System.out.println(Result);
            }
        }
        else
            System.out.println("Invalid Input !! ");
    }
}