class A
{
    void value()
    {
        System.out.println("welcome to parent");
    }
}
 
 class B extends A
 {
    void value()
    {
        super.value();
        System.out.println("welcome to child");

    }
 }

 class v2
 {
    public static void main(String args[])
    {
        B b=new B();
        b.value();
    }
 }