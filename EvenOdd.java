package com.Bridgelabz;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        System.out.println("Enter A's value : ");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        if(A % 2 == 0)
            System.out.println(A+" is even");

        else
            System.out.println(A+" is odd");
    }
}