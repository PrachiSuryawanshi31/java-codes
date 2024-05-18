import java.util.Scanner;
class swapping
{
	public static void main(String[] args)
	 {
		int a;
		int b;

		System.out.println("enter value of a and b");
		Scanner s1=new Scanner(System.in);

		a=s1.nextInt();
		b=s1.nextInt();

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("swapping of a="+a);
		System.out.println("swapping of b="+b);

		//using three variable

		int x;
		int y;
		int z;

		System.out.println("enter value for x and y");
		Scanner s2=new Scanner(System.in);

		x=s2.nextInt();
		y=s2.nextInt();

		z=x;
		x=y;
		y=z;

		System.out.println("swapping of x="+x);
		System.out.println("swapping of y="+y);


	}
}