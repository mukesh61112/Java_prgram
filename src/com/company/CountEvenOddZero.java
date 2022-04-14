package com.company;

import java.util.Scanner;

public class CountEvenOddZero {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        CountEvenOddZero cc=new CountEvenOddZero();
        cc.countEvenOddZero(n);
    }
    public  void countEvenOddZero(int n)
    {
        int rem=0;
        int countZero=0;
        int countOdd=0;
        int countEven=0;
        while(n!=0)
        {
            rem=n%10;
            n=n/10;
            if(rem==0)
                countZero++;
            else if(rem%2==0)
                  countEven++;
            else if(rem%2!=0)
                  countOdd++;
        }
        System.out.println(" zero="+countZero+ " even="+countEven+" odd ="+countOdd);
    }
}
