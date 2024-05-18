
import java.util.Scanner;
class for_square_reverse
{
	public static void main(String[] args)
	 {  
	 	int i;
		int ino1;
		int ino2;
		System.out.println("enter first number ");
		Scanner s1=new Scanner(System.in);
		ino1=s1.nextInt();

		System.out.println("enter last number");
		ino2=s1.nextInt();

		for(i=ino1;i>=ino2;i--)
		{
			System.out.println(i*i);
			
		}
	}
}