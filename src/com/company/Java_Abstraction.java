package com.company;
abstract  class A
{
   abstract  void psm();
}
/*class B extends A{
    void psm()
    {
        System.out.println("asjdkfjklsdjfksdjkfasd");
    }
}*/
class C extends A
{
     void psm(){
          System.out.println(" psm from C ");
     }
}
class D extends A
{

    void psm(){
        System.out.println(" psm from D ");
    }
}
public class Java_Abstraction {
    public static void main(String [] args)
    {
      /* B b=new B();
       b.psm();*/

//        D d=new D();
//        d.psm();


//        C c=new C();
//        c.psm();

//
//        A a=new D();
//        a.psm();

//          A a=new C();
//          a.psm();


    }
}
