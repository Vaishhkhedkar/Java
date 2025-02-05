class A
{
    int Add(int a,int b)
    {
        int c=a+b;
        return c;
    }
    float Add (float a,float b)
    {
        float c=a+b;
        return c;
    }
}
class b1
{
public static void main(String arg[])
{
    A a=new A();
    int n=a.Add(10,20);
    float m=a.Add(10.20f,40.80f);
    System.out.println("Int="+n+"float="+m);
}
}