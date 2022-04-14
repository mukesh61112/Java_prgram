package com.company;

import java.util.Scanner;

class Swap
{

    public void swapWithC(int x,int y)
    {
        int c=x;
        x=y;
        y=c;
        System.out.println("a="+x+"b="+y);
    }
    public void swapWithOutC(int x,int y)
    {
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("a="+x+"b="+y);
    }
}
public class J_7_SwapTwoNumber {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input a=");
        int a=sc.nextInt();
        System.out.println("input b=");
        int b=sc.nextInt();
        Swap swap=new Swap();
        swap.swapWithC(a,b);
        swap.swapWithOutC(a,b);
    }
}
