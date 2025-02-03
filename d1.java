import java.util.*;
class A
{
    int a,b;
    void value()
    {
        a=10;
        b=20;
    }
}


class B extends A
{
    int c;
    void Add()
    {
        c=a+b;
        System.out.println("Add="+c);
    }
}


class C extends B
{
int d; 
void sub()
{
    d=20;
    d=c-d;
    System.out.println("sub="+d);
    }
}

class d1{
    public static void main( String args[])
    {
        C z=new C();
        z.value();
        z.Add();
        z.sub();
    }
    
}