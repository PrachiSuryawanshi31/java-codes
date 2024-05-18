import java.util.Scanner;
class for_printname
{
	public static void main(String[] args) 
	{
		int i;
		int a;
		int b;

		System.out.println("enter first value for a");
		Scanner s1=new Scanner(System.in);

		a=s1.nextInt();
		System.out.println("enter value for b");
		b=s1.nextInt();

		for(i=a;i<=b;i++)
		{
			System.out.println(i);

		}
	}
}