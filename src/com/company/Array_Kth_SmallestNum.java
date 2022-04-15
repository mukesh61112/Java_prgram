package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Array_Kth_SmallestNum {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                 arr[i]=sc.nextInt();
            int k=sc.nextInt();
            Solution2 obj=new Solution2();
              int ans=obj.kthSmallestNum(arr,0,n-1,k);
              System.out.println(ans);
            --t;
        }
    }

}
class Solution2
{
    int kthSmallestNum(int arr[] ,int l,int r,int k)
    {
        int brr[]=new int [r+1];
          Arrays.sort(arr);
        int ans=0;
        while(k!=0)
        {

            int sml=arr[l];
            for(int i=l;i<=r;i++)
            {
                if(arr[i]<sml && arr[i]!=-1)
                {
                    sml=arr[i];
                    arr[i]=-1;
                }
            }
            ans=sml;
            --k;
        }
        return ans;
    }
}