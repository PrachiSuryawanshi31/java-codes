import java.util.Scanner;
class factor_for
{
	public static void main(String[] args)
	 {
		int ino;
		int icnt;
		System.out.println("enter value for ino");
		Scanner s1=new Scanner(System.in);
		ino=s1.nextInt();

		for(icnt=1;icnt<=ino/2;icnt++)
		{
			if(ino%icnt==0)
			{
				System.out.println(icnt);
			}
		}
	}
}