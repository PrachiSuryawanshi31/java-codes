import java.util.Scanner;
class while_odd_number
{
	public static void main(String[] args)
	 {
		int ino1;
		int ino2;

		System.out.println("enter first number for ino1");
		Scanner s1=new Scanner(System.in);
		ino1=s1.nextInt();

		System.out.println("enter last number for ino2");
		ino2=s1.nextInt();

		while(ino1<=ino2)
		{
			System.out.println(ino1);
			ino1=ino1+2;
		}
	}
}