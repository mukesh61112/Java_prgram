package com.company;
import java.util.Scanner;
public class J_2_ChackBitPosition {
    public static void main(String[] args)
    {
        int n,m;
        String x="";
        Scanner s=new Scanner(System.in);
        System.out.println("enter any Demical Number :");
        n=s.nextInt();
        while(n>0)
        {
            int a=n%2;
            x=a+x;
            n=n/2;
        }
        System.out.println("enter the position where you want chack");
        int l=x.length();
        m=s.nextInt();
        if((l-m)>=0 && (x.charAt(l-m)=='1'))
              System.out.println(" 1 is present");
        else
             System.out.println((" 0 is present"));
    }
}
