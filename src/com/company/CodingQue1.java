package com.company;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

class Ans{
      Ans(int m,int n,int o)
      {
          int sum=0;
          int nextWeight=n;
          for(int i=1;i<=m;i++)
          {
              for(int j=1;j<=i;j++)
              {

                  if(i==1)
                  {
                      sum=sum+nextWeight;
                      System.out.print(sum);
                  }
                  else{
                      int a=nextWeight;
                      sum=sum+nextWeight;
                      System.out.print(" " +a+" ");
                  }
              }

              nextWeight=nextWeight+o;
              System.out.println();
          }
          System.out.println(sum);
      }
}

public class CodingQue1 {
    public static  void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);

        int totalheight=sc.nextInt();
        int weightofHeadlevel=sc.nextInt();
        int IncreaseInweight=sc.nextInt();
        Ans ans=new Ans(totalheight,weightofHeadlevel,IncreaseInweight);

    }
}
