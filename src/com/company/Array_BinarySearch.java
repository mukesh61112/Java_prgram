package com.company;

import java.util.Scanner;

public class Array_BinarySearch {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int n=sc.nextInt();
            int arr[]=new int [n];
            for(int i:arr)
                 arr[i]=sc.nextInt();
            int k=sc.nextInt();
            ArrayBinarySearch obj=new ArrayBinarySearch();
            System.out.println(obj.arrayBinarySearch(arr,n,k));

            --t;
        }
    }
}
class ArrayBinarySearch{
      int arrayBinarySearch(int arr[],int n,int k)
      {
      /*  for(int i=0;i<n;i++)
        {
            if(arr[i]==k)
                return i;
        }
        return -1;*/
          int l=0,r=n-1;
          for(int i=l;i<=r;i++)
          {
              if(arr[i]==k)
                  return i;
              if(arr[r]==k)
                  return r;
              --r;
          }
          return -1;
      }

}
