package com.company;

import java.util.Scanner;
class Fibo
{

    Fibo(int n)
    {
        int a=0,b=1;
        System.out.print(" fibonacci series ele are="+a+","+b);
        while((n-2)!=0)
        {
            int c=a+b;
            a=b;
            b=c;
            System.out.print(","+c);
            --n;

        }
    }
}
public class J_16_Fibonacci {
    public static void main(String [] args)
    {
        /*
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print(" Fibonacci Series ele are="+a+","+b);

        int m=n;
        while((m-2)!=0)
        {
            int c=a+b;
            a=b;
            b=c;
            System.out.print(","+c);
            --m;
        } */


        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       // Fibo(n);

        Fibo fibo= new Fibo(n);
    }
   /* public static void Fibo(int n)
    {
        int a=0,b=1;
        System.out.print(" fibonacci series ele are="+a+","+b);
        while((n-2)!=0)
        {
            int c=a+b;
            a=b;
            b=c;
            System.out.print(","+c);
            --n;

        }
    }*/
}
