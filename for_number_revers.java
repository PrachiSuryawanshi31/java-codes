import java.util.Scanner;
class for_number_revers
{
	public static void main(String[] args)
	 {
		int ino1;
		int ino2;
		int i;


		System.out.println("enter a  first value for ino1");
		Scanner s1=new Scanner(System.in);

		ino1=s1.nextInt();
		System.out.println("enter last number for ino2");
		ino2=s1.nextInt();

		for(i=ino1; i>=ino2; i--)
		{
			System.out.println(i);
		}
	}
}