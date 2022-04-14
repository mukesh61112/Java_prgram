package com.company;

import java.util.Scanner;

public class J_17_PrimeNumber {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean p=true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0) {
                p=false;
                System.out.println(" the num is not prime");
                break;
            }
        }
        if(p==true)
            System.out.println(" the num is prime");
    }
}
