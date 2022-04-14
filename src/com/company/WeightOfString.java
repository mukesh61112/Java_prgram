package com.company;

import java.util.Scanner;

public class WeightOfString {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        WeightOfString ws=new WeightOfString();
        int i= sc.nextInt();
        ws.weightOfString(s,i);
    }
   void  weightOfString(String s,int i)
    {
        int n=s.length();
        int sum=0;
        for(int j=0;j<n;j++)
        {
            switch(s.charAt(j))
            {
                case 'a' ,'A':
                  if(i==0)
                      sum=sum+0;
                  else
                      sum=sum+1;
                    break;
                case'b','B':
                    sum=sum+2;
                    break;
                case 'c','C':
                    sum=sum+3;
                    break;
                case 'd','D':
                    sum=sum+4;
                    break;
                case 'e','E':
                    if(i==0)
                        sum=sum+0;
                    else
                        sum=sum+5;
                    break;
                case 'f','F':
                    sum=sum+6;
                    break;
                case 'g','G':
                    sum=sum+7;
                    break;
                case 'h','H':
                    sum=sum+8;
                    break;
                case 'i'+'I':
                    if(i==0)
                        sum=sum+0;
                    else
                        sum=sum+9;
                    break;
                case 'j','J':
                     sum=sum+10;
                    break;
                case 'k','K':
                    sum=sum+11;
                    break;
                case 'l','L':
                    sum=sum+12;
                    break;
                case 'm','M':
                    sum=sum+13;
                    break;
                case 'n','N':
                    sum=sum+14;
                    break;
                case 'o','O':
                    if(i==0)
                        sum=sum+0;
                    else
                        sum=sum+15;
                    break;
                case 'p','P':
                    sum=sum+16;

                case 'q','Q':
                    sum=sum+17;

                case 'r','R':
                    sum=sum+18;
                    break;
                case 's','S':
                    sum=sum+19;
                    break;
                case 't','T':
                    sum=sum+20;
                    break;
                case 'u','U':
                    if(i==0)
                        sum=sum+0;
                    else
                        sum=sum+21;
                    break;
                case 'v','V':
                    sum=sum+22;
                    break;
                case 'w','W':
                    sum=sum+23;
                    break;
                case 'x','X':
                    sum=sum+24;
                    break;
                case 'y' ,'Y':
                    sum=sum+25;
                    break;
                case 'z'+'Z':
                    sum=sum+26;
                    break;
                case ' ':
                    break;
            }
        }
        System.out.println(sum);
    }
}
