package com.Bridgelabz;

import java.util.Scanner;

public class CoinFlip {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int Flip = 0, TempFlip = 1, Head = 0, Tail = 0;

        System.out.print("Enter the number you want to toss: ");
        float FlipNum = input.nextInt();

        while (Flip < FlipNum) {
            Double FlipReslt = Math.floor(Math.random() * 10) % 2;
            Flip += 1;

            if (FlipReslt == TempFlip)
                Head += 1;
            else
                Tail += 1;
        }

        float PerHead = ( Head * 100 / FlipNum);
        float PerTail = ( Tail * 100 / FlipNum);

        System.out.println("Number of HEAD is "+Head);
        System.out.println("Number of TAIL is "+Tail);

        System.out.println("Head percentage is "+PerHead+" %");
        System.out.println("Tail percentage is "+PerTail+" %");
    }
}
