import java.util.Scammer;
class for_leap_year_reverse
{
	public static void main(String[] args)
	 {
		int i;
		int first_year;
		int year;
		System.out.println("enter first year ");
		Scanner s1=new Scanner(System.in);
		first_year=s1.nextInt();

		System.out.println("enter last year");
		year=s1.nextInt();

		for(i=first_year;i>=year;i=i-4)
		{
			System.out.println(i);
		}
	}
}