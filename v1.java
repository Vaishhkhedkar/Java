class A 
{
    void display()
    {
        System.out.println("class A");
    }
}
class B extends A
{
    void display();
    Supper.display();
    {
        
        System.out.println("class B");
    }
}
class v1
{
    public static void main(String args[])
    {
        A b=new B();
        b.display();
    }
}