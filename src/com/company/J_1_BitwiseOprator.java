package com.company;
import java.util.Scanner;
public class J_1_BitwiseOprator {
    public static void main(String [] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        int mul=n<<2;
        System.out.println("ans"+mul);
    }
}
