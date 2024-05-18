import java.util.Scanner;
class alphabet_loop
{
	public static void main(String[] args)
	 {
		char a;
		char b;

		System.out.println("enter first alphabet");
		Scanner s1=new Scanner(System.in);

		a=s1.next().charAt(0);
		System.out.println("eneter last alphabet");
		b=s1.next().charAt(0);

		while(a<=b)
		{
			System.out.println(a);
			a++;
		}
	}
}