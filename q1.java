interface A
{
    public void Add();
}
interface b{
    public void display();
}
class C implements A,b{
    int a,b,c;
    public void Add()
    {
        a=9;
        b=20;
        c=a+b;
        System.out.println("Add="+c);
    }
    public void display()
    {
        System.out.println("second interface method");
    }
}
class q1
{
    public static void main(String args[])
    {
        C e=new C ();
        e.Add();
        e.display();
    }
}