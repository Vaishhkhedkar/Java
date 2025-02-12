class A
{
    String name="vaishu";

}
class B extends A
{
    String name="vicky";
    void display()
    {
        System.out.println("Name="+super.name);
     System.out.println("Name="+name);

    }
}

class ke{
    public static void main(String args [])
    {
        B b=new B();
        b.display();
    }
}