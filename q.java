import java.util.*;
class P
{
    int a,b;
    void value()
    {
        a=10;
        b=20;
    }
}


class B extends P
{
    int c;
    void Add()
    {
        c=a+b;
        System.out.println("Add="+c);
    }
}


class q{
    public static void main(String args[])
    {
        B b1=new B();
        b1.value();
        b1.Add();
    }
}