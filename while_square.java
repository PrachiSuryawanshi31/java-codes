import java.util.Scanner;
class while_square
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

		while(ino1<=ino2)
		{
			System.out.println(ino1*ino1);
			ino1++;
		}
	}
}