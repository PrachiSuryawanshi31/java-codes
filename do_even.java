import java.util.Scanner;
class do_even
{
	public static void main(String[] args)
	 {
		int ino1;
		int ino2;

		System.out.println("enter first number ");
		Scanner s1=new Scanner(System.in);
         ino1=s1.nextInt();

		System.out.println("enter last number");
		ino2=s1.nextInt();

		do
		{
			System.out.println(ino1);
			ino1=ino1+2;
		}
		while(ino1<=ino2);
	}
}