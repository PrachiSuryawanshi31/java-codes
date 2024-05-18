import java.util.Scanner;
class while_printname
{
	public static void main(String[] args)
	 {  
	 	int a;
	 	int b;
	 	System.out.println("enter first number");
	 	Scanner s1=new Scanner(System.in);
	 	a=s1.nextInt();

	 	System.out.println("enter last number");
        b=s1.nextInt();

        while(a<=b)
        {
	    System.out.println("Prachi Dhanaraj Suryawanshi");
	    a++;
	    }	
	}
}