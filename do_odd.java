import java.util.Scanner;
class do_odd
{
	public static void main(String[] args) {
		int ivalue1;
		int ivalue2;
		System.out.println("enter first number");
		Scanner s1=new Scanner(System.in);
		ivalue1=s1.nextInt();

		System.out.println("enter last value ");
		ivalue2=s1.nextInt();

		do
		{
			System.out.println(ivalue1);
			ivalue1=ivalue1+2;
		}
		while(ivalue1<=ivalue2);
	}
}