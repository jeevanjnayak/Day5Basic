package com.Bridgelabz;

import java.util.Scanner;
import java.io.PrintWriter;

public class TwoDArray {

    public static void main(String[] args) {
        System.out.println("Enter the Array length :  ");
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        s
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int numSet = 0;
        for (int i=0; i<n-2; i++)
        {
            for (int j=i+1; j<n-1; j++)
            {
                for (int k=j+1; k<n; k++)
                {
                    if (arr[i]+arr[j]+arr[k] == 0)
                    {
                        System.out.print(arr[i]);
                        System.out.print(" ");
                        System.out.print(arr[j]);
                        System.out.print(" ");
                        System.out.print(arr[k]);
                        System.out.print("\n");
                        numSet++;
                    }
                }
            }
        }

        // If no triplet with 0 sum found in array
        if (numSet == 0)
            System.out.println(" not exist ");


    }
}