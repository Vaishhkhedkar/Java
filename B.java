import java.util.*;
class A
{
    
    public void Add()
    {
        int v,a,i;
        Scanner s=new Scanner(System.in);
        System.out.println("enter value of v:");
        v=s.nextInt();
        
        System.out.println("enter value of a:");
        a=s.nextInt();
        i=v+a;

        System.out.println("Add="+i);
    }
        public void display(String Name,int id)
        {
        System.out.println("Id="+id+"Name="+Name);

        
    }
}
 class B
 {
    public static void main(String args[])
 {
 A s=new A();
 s.Add();
 s.display("vaishu",1506);
 }
 }}
