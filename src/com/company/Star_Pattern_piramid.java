package com.company;

import javax.script.ScriptContext;
import java.util.Scanner;

public class Star_Pattern_piramid {
    public  static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=5;
       /*
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        */
     /*   for(int i=0;i<n;i++)
        {
            for(int k=0;k<(n-i);k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        */
        for(int i=0;i<n;i++)
        {
            for(int k=n-i;k>1;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
