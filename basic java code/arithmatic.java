import java .util.Scanner;
class arithmatic
{
    public static void main(String args[])
    {
        int a;
        int b;
        int c;

        System.out.println("enter valu for a ");
        Scanner s1=new Scanner(System.in);

        a=s1.nextInt();
        b=s1.nextInt();

        c=a+b ;

        System.out.println("addition of a and b="+c);

        c=a-b;
        System.out.println("substraction of a and b="+c);

        c=a*b;
        System.out.println("multipiction of a and b="+c);
        
        c=a/b;
        System.out.println(" division of a and b="+c);

        c=a%b;
        System.out.println("modulo of a and b="+c);
        

         
    }
}