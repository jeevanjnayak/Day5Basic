package com.Bridgelabz;

import java.util.Scanner;

public class NumSwap {

    public static void main(String[] args) {

        System.out.println("Enter A's value : ");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        System.out.println("Enter B's value : ");
        Scanner ac = new Scanner(System.in);
        int B = ac.nextInt();

        int C = A;
        A = B;
        B = C;

        System.out.println("the new value of A & B are "+A+ " & " +B);

    }
}