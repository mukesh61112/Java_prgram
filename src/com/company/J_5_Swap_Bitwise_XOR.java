package com.company;
import java.util.Scanner;
public class J_5_Swap_Bitwise_XOR {
    public static void main(String [] args)
    {
        int m, n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        m = s.nextInt();
        System.out.print("Enter the second number:");
        n = s.nextInt();
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        System.out.println("After Swapping");
        System.out.println("First number:"+m);
        System.out.println("Second number:"+n);
    }
}
