class A
{
    void display()
    {
        System.out.println("welcome to display");
    }
    void value()
    {
        this.display();
        System.out.println("value");
    }
}
class v
{
    public static void main(String args[])
    {
        A e=new A();
        e.value();
    }
}