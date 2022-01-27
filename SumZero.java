package com.Bridgelabz;

import java.util.Scanner;

public class SumZero {

    public static void main(String[] args) {
        
        System.out.println("Enter the Array length :  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int numSet = 0;
        
        System.out.println("Enter the values of the Array");
        int[] arr =new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i=0; i<n-2; i++)
        {
            for (int j=i+1; j<n-1; j++)
            {
                for (int k=j+1; k<n; k++)
                {
                    if (arr[i]+arr[j]+arr[k] == 0)
                    {
                        System.out.print(arr[i]+ ", " +arr[j]+ ", " +arr[k]);
                        System.out.print("\n");
                        numSet++;
                    }
                }
            }
        }
        if (numSet == 0)
            System.out.println("Doesn't exist ");
    }
}