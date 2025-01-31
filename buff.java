import java.io.*;
class buff
{
    public static void main(String args[])throws Exception
    {
        int n;
        BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter no=");
        n=Integer.parseInt(b.readLine());
        System.out.println("No="+n);
        String s;
        s=b.readLine();
        System.out.println("N="+s);
    }
}