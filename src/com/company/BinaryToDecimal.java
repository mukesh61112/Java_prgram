package com.company;

import java.util.Scanner;

class Binarydecimal
{
    int rem=0;
    int p=0;
    int binaryNum=0;

    public Binarydecimal(int n) {
        while(n!=0)
        {
            rem=n%10;
            n=n/10;
            int twoP=1;
            int power=p;
            while(power!=0)
            {
                twoP=twoP*2;
                --power;
            }
            binaryNum=binaryNum+twoP*rem;
            ++p;
        }
        System.out.println(binaryNum);
    }
}
public class BinaryToDecimal {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Binarydecimal bd=new Binarydecimal(n);
    }
}
