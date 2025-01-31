import java .util.*;
import java.util.regex.*;
class mail
{
    public static void main(String args[])
    {
        String mail ;
        Scanner s = new Scanner (System.in);
        System.out.println("Enter mail=");
        mail=s.next();
        System.out.println(Pattern.matches("[a-zA-Z0-9&&[^#$%!]]{6,}@gmail.com",mail));
    }
}



