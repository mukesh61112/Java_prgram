package com.company;
class StaticMethod
{
    public static int  sum (int a,int b) {
        return (a + b);
    }
}
public class J_6_StaticMethod {
      public static void main(String [] args)
      {
          int x=564;
          int y=987;
          int z=StaticMethod.sum(x,y);
          System.out.println(z);
      }
}
