package com.Bridgelabz;

import java.util.Scanner;

public class Harmonic {

    public static void main(String[] args) {
        float Harmonic = 1;
        System.out.println("Enter The Nth Number :: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 2; i <= N; i++) {
            Harmonic += (float) 1 / i;
            System.out.println(i+"th harmonic is "+Harmonic);
        }

    }
}