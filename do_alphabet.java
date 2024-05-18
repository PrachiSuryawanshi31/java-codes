import java.util.Scanner;
class do_alphabet
{
	public static void main(String[] args)
	 { 
	 	
	 	char a;
	 	char b;

	 	System.out.println("enter first alphabet");
	 	Scanner s1=new Scanner(System.in);
        a=s1.next().charAt(0);
	 	System.out.println("enter last alphabet");
	 	b=s1.next().charAt(0);
	 	do
	 	{
	 		System.out.println(a);
	 		a++;
	 	}
	 	while(a<=b);
		
	}
}