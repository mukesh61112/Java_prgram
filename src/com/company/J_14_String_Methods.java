package com.company;

import java.util.Scanner;

public class J_14_String_Methods {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        J_14_String_Methods sm=new J_14_String_Methods();
        sm.stringMethod(s);
    }
    void stringMethod(String s)
    {
        String p="Jodhpur";
         System.out.println("String length is="+s.length());
         System.out.println(" char at index i in string= "+s.charAt(2));
         System.out.println(" sub string at index i="+s.substring(3));
         System.out.println("sub string from i to j"+s.substring(3,8));
         System.out.println("add two string = "+s.concat(p));
         System.out.println(" remove start and end  spaces="+s.trim());
         System.out.println(s.chars());

    }
}
