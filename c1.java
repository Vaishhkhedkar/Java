class A 
{
    void display()
    {
        System.out.println("class A");
    }
}
class B extends A
{
    void display()
    {
        System.out.println("class B");
    }
}
class c1
{
    public static void main(String args[])
    {
        B b=new B();
        b.display();
    }
}