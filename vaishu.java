class A
{
    void display( A e)
    {
        System.out.println("welcome to display");
    }
    void value()
    {
        display(this);
        System.out.println("value");
    }
}
class vaishu
{
    public static void main(String args[])
    {
        A e=new A();
        e.value();
    }
}