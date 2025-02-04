import java.util.*;
interface A
{
public void Add();
}
class B implements a{
    int a,b,c;
   public void Add()
    {
        a=10;
        b=20;
        c=a+b;
        System.out.println("Add="+c);
    }
}
class println
{
    public static void main(String args[])
    {
        B b=new B();
        b.Add();
    }

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

class p1{
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