package com.company;

import java.util.Scanner;

class FindFactorial
{
       public void findFactorial(int x)
       {
           int fact=1;
           for(int i=x;i>=1;--i)
           {
               fact=fact*i;
           }
           System.out.println("factorial="+fact);
       }
}
public class J_8_Find_Fatorial {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        FindFactorial ff=new FindFactorial();
        ff.findFactorial(a);
    }
}
