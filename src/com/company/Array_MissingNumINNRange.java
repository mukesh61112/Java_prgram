package com.company;

import java.util.Scanner;

public class Array_MissingNumINNRange {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n-1];
        for(int i=0;i<(n-1);i++)
             arr[i]=sc.nextInt();
        FindMissingNum obj=new FindMissingNum();
           int ans=obj.findMissingNum(arr,n);
           System.out.println(ans);


    }
}
class FindMissingNum{
    int findMissingNum(int[] arr,int n)
    {
         /*   int brr[]=new int [n];
            for(int j=0;j<n;j++)
                 brr[j]=j+1;

            for(int i=0;i<(n-1);i++)
            {
                for(int j=0;j<n;j++) {
                    if(brr[j]==arr[i])
                    {

                        brr[j]=-1;
                        break;
                    }
                }
            }

            for(int j=0;j<n;j++)
            {

                 if(brr[j]!=-1)
                     return brr[j];

        }
        return -1;  */
        int brr[]=new int [n];
        int sum1=0,sum2=0;
        for(int j=1;j<=n;j++)
             sum1=sum1+j;
        for(int i=0;i<(n-1);i++)
            sum2=sum2+arr[i];
        return sum1-sum2;
    }
}
