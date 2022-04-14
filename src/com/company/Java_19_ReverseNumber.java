package com.company;

import java.util.Scanner;

class  Reverse{
    Reverse(int n)
    {
        int m=n,revNum=0;
        while(m!=0)
        {
            int rem=m%10;
            m=m/10;
            revNum=revNum*10+rem;
        }
            System.out.println(revNum);

    }

        }
public class Java_19_ReverseNumber {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Reverse reverse=new Reverse(n);
    }
}
