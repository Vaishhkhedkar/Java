import java .util.*;
class scan
{
    public static void main(String args[])
    {
        String name ;
        Scanner s = new Scanner (System.in);
        System.out.println("Enter name=");
        name=s.next();
        System.out.println("Name="+name);

        int n;
         System.out.println("Enter Id=");
         n=s.nextInt();
         System.out.println("Id="+n);

         float f;
         System.out.println("Enter Id=");
         f=s.nextFloat();
         System.out.println("Id="+f);
        
         char v;
         System.out.println("Enter character=");
         v=s.next().charAt(0);
         System.out.println("Id="+v);
        
        
        double k;
         System.out.println("Enter value=");
         k=s.nextDouble();
         System.out.println("Id="+k);
    }
}