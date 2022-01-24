package com.Bridgelabz;

import java.util.Scanner;

public class LargestNum {

    public static void main(String[] args) {

        System.out.println("Enter First number : ");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        System.out.println("Enter second number : ");
        Scanner ac = new Scanner(System.in);
        int B = ac.nextInt();

        System.out.println("Enter 3rd number : ");
        Scanner cc = new Scanner(System.in);
        int C = cc.nextInt();

        int temp= Math.max(A, B);
        int largest= Math.max(C, temp);
        System.out.println("The largest number is: "+largest);

    }
}