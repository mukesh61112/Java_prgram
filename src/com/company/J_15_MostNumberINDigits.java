package com.company;
import java.util.*;

class Anse{
    Anse(int arr[])
    {
        for(int i=0;i<4;i++)
        {
            int n=i;
            ArrayList<Integer> arrayList=new ArrayList<>();
            while(n!=0)
            {
                int rem=n%10;
                arrayList.add(rem);
                n/=10;
            }
            int c1=0,n1=0;
            for(int j:arrayList)
            {
                int count=0,num=0,change=0;
                for(int k:arrayList)
                {

                    if(arrayList.get(j)==arrayList.get(k))
                    {
                        count++;
                        num=arrayList.get(i);
                    }
                }
            }
        }
    }
}
public class J_15_MostNumberINDigits {
    public  static  void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[4];

        for(int i:arr)
             arr[i]=sc.nextInt();
        Anse anse=new Anse(arr);
    }
}
