class A
{
    void Add(int a,int b)
    {
        int c=a+b;
        System.out.println("Add="+c);
    }
    void Add (int a, int b, int c)
    {
        int d=a+b+c;
        System.out.println("Add="+d);
    }
}

class b1
{
    public static void main(String args[])
    {
        A a=new A();
        a.Add(10,20);
        a.Add(20,40,10);
    }
}