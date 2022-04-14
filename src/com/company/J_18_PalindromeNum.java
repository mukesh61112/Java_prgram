package com.company;

import java.util.*;

public class J_18_PalindromeNum {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

      /*  int n=sc.nextInt();

        int m=n;
        int num=0;
        while(m!=0)
        {
            int rem=m%10;
            m=m/10;
            num=num*10+rem;

        }
        if(num==n)
           System.out.println(" the given number is palindrom");
        else
            System.out.println(" the given number is not palindrom");
    }

       */

        String Orignal,Revers="";
        Orignal=sc.nextLine();
        int length=Orignal.length();

        for(int i=length-1;i>=0;i--)
        {
            Revers=Revers +  Orignal.charAt(i);
        }
        if(Revers.equals(Orignal))
            System.out.println(" the given number is palindrom");
        else
            System.out.println(" the given number is not palindrom");
    }

}
