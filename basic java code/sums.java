import java.util.Scanner;

class sums
{
	public static void main(String args[])
	{
		int sum1;
		int m;
		int p,q,r;

		System.out.println("Enter the value=");
		Scanner s1=new Scanner(System.in);
		p=s1.nextInt();
		q=s1.nextInt();
		r=s1.nextInt();

		sum1=p+q+r;

		System.out.println("sum of the number="+sum1);


	}
}