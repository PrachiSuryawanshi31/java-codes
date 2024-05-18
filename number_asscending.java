import java.util.Scanner;
class number_asscending
{
	public static void main(String[] args)
	 {
		int ino1;
		int ino2;

		System.out.println("enter a first value for ino1");
		Scanner s1=new Scanner(System.in);
		ino1=s1.nextInt();


		System.out.println("enter a last value for ino2");
		ino2=s1.nextInt();

		while(ino1<=ino2)
		{
			System.out.println(ino1 \t);
			ino1++;
		}

	}
}