package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class J_11_FiindNonRepeatedNumInDigit {
    public static  void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        J_11_FiindNonRepeatedNumInDigit fnrn=new J_11_FiindNonRepeatedNumInDigit();
        fnrn.FindNonRNumber(n);
    }
    void FindNonRNumber(int n)
    {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();

        while(n!=0)
        {
            int rem=n%10;
            n=n/10;
            arrayList.add(rem);
        }
        int m=arrayList.size();
        int count=0;
        for(int j=0;j<m;j++)
        {
            int flag=0;
            for(int k=0;k<m;k++)
            {
                if(arrayList.get(j)==arrayList.get(k))
                {
                    flag++;
                }
            }
            if(flag==1)
            {
                System.out.print(" "+arrayList.get(j));
                count++;
            }
        }
        System.out.println("\n"+count);
    }
}
