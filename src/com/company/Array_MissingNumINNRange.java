package com.company;

import java.util.Scanner;

public class Array_MissingNumINNRange {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=1;i<=(n-1);i++)
             arr[i]=sc.nextInt();
        FindMissingNum obj=new FindMissingNum();
           int ans=obj.findMissingNum(arr,n);
           System.out.println(ans);


    }
}
class FindMissingNum{
    static int findMissingNum(int arr[],int n)
    {

        for(int i=1;i<=n;i++)
        {
            int k=0;
            for(int j=1;j<=(n-1);j++)
            {
                if(arr[j]==i)
                {
                    k=1;
                    break;
                }
            }
            if(k==0)
            {
                return i;

            }
        }
        return -1;
    }
}
