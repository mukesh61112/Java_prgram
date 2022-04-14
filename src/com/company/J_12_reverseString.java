package com.company;

import java.util.Scanner;

public class J_12_reverseString {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        J_12_reverseString rs=new J_12_reverseString();
        rs.reverseString(s);
    }
    void reverseString(String s)
    {
        String rs="";
        int length=s.length();
         for(int i=(length-1);i>=0;i--)
         {
             rs=rs+s.charAt(i);
         }
         System.out.println(rs);
    }
}
