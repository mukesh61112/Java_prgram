package com.company;

import java.util.Scanner;

public class J_10_MergeTwoArray {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr1[]=new int[m];
        int arr2[] =new int[n];
        for(int i=0;i<m;i++)
             arr1[i]=sc.nextInt();
        for (int j=0;j<n;j++)
              arr2[j]=sc.nextInt();
        J_10_MergeTwoArray mta=new J_10_MergeTwoArray();
        mta.mergeTwoArray(m,n,arr1,arr2);
    }
    void mergeTwoArray(int m,int n,int arr1[],int arr2[])
    {
        int arr3[]=new int[m+n];
        int j=0,k=0;
        for(int l=0;l<(m+n);l++)
        {

            if(l<m)
            {
                arr3[l]=arr1[j];
                j++;
            }
            else
            {
                arr3[l]=arr2[k];
                k++;
            }
        }
        for(int o=0;o<(m+n);o++)
             System.out.println(arr3[o]);
    }
}
