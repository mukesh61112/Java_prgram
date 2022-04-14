package com.company;
import java.util.Scanner;
public class jhghgjgg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T!=0)
        {
            int N=sc.nextInt();
            int D=sc.nextInt();
            int arr[]=new int[N];
            for(int i=0;i<N;i++)
                arr[i]=sc.nextInt();
            int brr[]=new int[N];
            int j;
            for(j=0;j<N-D ;j++)
            {
                brr[j]=arr[D+j];
            }
            for(int k=0;k<D;k++)
            {
                brr[N-D+k]=arr[k];
            }
            for(int l=0;l<N;l++)
                System.out.print(brr[l]+" ");
            System.out.println();
        }
    }
}
