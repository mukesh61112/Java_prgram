package com.company;

import java.util.Scanner;

public class J_9_EleDeleteInArray {
    public static  void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] array=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        int deleteEle=sc.nextInt();
        J_9_EleDeleteInArray ed=new J_9_EleDeleteInArray();
        ed.deleteEle(array,size,deleteEle);
    }
    public void  deleteEle(int arr[],int size,int deleteEle)
    {
        int count=0;

        for(int i:arr)
        {
            if(arr[i]==deleteEle)
            {
                for(int j=i;j<size-1;j++)
                {
                    arr[j]=arr[j+1];
                }
                count++;
                break;
            }

        }
        if(count!=0)
             System.out.println(" ele deleted............");
        for(int i=0;i<(size-1);i++)
             System.out.println(arr[i]);
    }
}
