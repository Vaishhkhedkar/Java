class A
{
    int id;
    String name;
    A(int id,String name)
    {
        this ();
        System.out.println("Id="+id+"Name="+name);

    }
    A()
    {
        System.out.println("welcome");
    }
}

class e
{
    public static void main(String args[])
    {
        A e=new A(101,"vaishu");
        
    }
}