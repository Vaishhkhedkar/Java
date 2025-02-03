import java.util.*;
class P{
    int a,b;
    float x,y;
}
class A  extends P
{
    void Intvalue()
    {
        a=10;
        b=20;
    }
    void FloatValue()
{
    x=10.20f;
    y=30.40f;
}
}


class B extends A
{
    void IntAdd()
    {
    int c;
    c=a+b;
    System.out.println("Add="+c);
    }
}


class C extends A
{
    void FloatAdd()
    {
        Float c1=x+y;
        System.out.println("Add="+c1);
    }
}

class d2{
    public static void main( String args[])
    {
        B b=new B();
        b.Intvalue();
        b.IntAdd();

        C c=new C();
        c.FloatValue();
        c.FloatAdd();
    }
    
}