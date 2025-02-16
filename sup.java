class A
{
    A()
    {
        System.out.println("welcome to parent");
    }
}

class B extends A
{
    B()
    {
        super();
        System.out.println("welcome to child");
    }
}

class sup
{
    public static void main(String args[])
    {
        B b=new B();
    }
}