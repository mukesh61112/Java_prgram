package com.company;
import java.util.Scanner;
public class J_4_VariousBitwiseOperator {
    public static void main(String[] args)
    {
        int m,n,x,a;
        Scanner s=new Scanner(System.in);
        System.out.print("enter first number");
        m=s.nextInt();
        System.out.print("enter second number:");
        n=s.nextInt();
        while(true)
        {
            System.out.println("");
            System.out.println("press 1 for Right shift by 2");
            System.out.println(" press 2 for Lest shift by 2");
            System.out.println("press 3 for Bitwise AND");
            System.out.println("press 4 for Bitwise Or by 2");
            System.out.println("Press 5 for Bitwise Exclusive OR:");
            System.out.println("Press 6 for Bitwise NOT:");
            System.out.println("Press 7 to Exit:");
            System.out.println("");
            System.out.print("Option:");
            x = s.nextInt();
            switch(x)
            {
                case 1:
                    a = m << 2;
                    System.out.println("Result after left shift by 2:"+a);
                    break;

                case 2:
                    a = n >> 2;
                    System.out.println("Result after right shift by 2:"+a);
                    break;

                case 3:
                    a = m & n;
                    System.out.println("Result after bitwise AND:"+a);
                    break;

                case 4:
                    a = m | n;
                    System.out.println("Result after bitwise OR:"+a);
                    break;

                case 5:
                    a = m ^ n;
                    System.out.println("Result after bitwise Exclusive OR:"+a);
                    break;

                case 6:
                    a = ~ m;
                    System.out.println("Result after bitwise NOT:"+a);
                    break;

                case 7:
                    System.exit(0);
            }

        }
    }

}
