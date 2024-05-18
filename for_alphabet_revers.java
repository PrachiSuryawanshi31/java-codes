import java.util.Scanner;
class for_alphabet_revers
{
	public static void main(String[] args) {
		char a ;
		char b ;
		char i;
		System.out.println("enter first alphabet");
		Scanner s1=new Scanner(System.in);
		a=s1.next().charAt(0);

		System.out.println("enter last alphabet");
		b=s1.next().charAt(0);


		for(i=a;i>=b;i--)
		{
			System.out.println(i);
		}
	}
}