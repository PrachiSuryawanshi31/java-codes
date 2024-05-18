import java.util.Scanner;

class sum
{
	public static void main(String args[])
	{
		int sum;
		int n=123;
		int a,b,c;

		a=n%10;
		n=n%10;

		b=n%10;
		n=n%10;

		c=n%10;
		n=n%10;

		sum=a+b+c;

		System.out.println("sum of the number="+sum);

		//sum using scanner

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