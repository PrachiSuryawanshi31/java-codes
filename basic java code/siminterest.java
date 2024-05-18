import java .util.Scanner;
class siminterest
{
	public static void main(String[] args) 
	{
		int principle;
		int rate;
		int year;
		int sip;

		System.out.println("enter the value of principle");
		Scanner s1=new Scanner(System.in);

		 principle=s1.nextInt();

		 System.out.println("enter the value of rate");

		 rate=s1.nextInt();

		 System.out.println("enter the value of year");

		 year=s1.nextInt();

		  sip=principle*rate*year/100;

		  	System.out.println("simple interest is="+sip);
	}
}