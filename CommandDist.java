package com.Bridgelabz;


import static java.lang.Math.sqrt;


class CommandDist {

    public static void main(String[] args){
        int Dist;
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        Dist = (int) sqrt(x * x + y * y);
        System.out.println("distance is: " +Dist);
    }
}