package com.company;

import java.util.Scanner;

public class J_20_autoMorphicNUm {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Automorphic(n);
    }
    public static void Automorphic(int n) {


        String s = "" + n;
        int length = s.length();
       // System.out.print(s);
        int square = n * n;
        String q = "" + square;
        int newLength = q.length();
       // System.out.print(q);
        String newSquaur = q.substring((newLength - length), (newLength));

        if (newSquaur.equals(s)) {
            System.out.print(" num is autoMorphic");
        }
        else
        {
            System.out.print(" num is not automorphic");
        }

    }
}
