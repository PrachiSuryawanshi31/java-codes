import java.util.Scanner;
class while_leap
{ 
	public static void main(String[] args) 
 {
		
	
	int year;
	int last_year;
	System.out.println(" enter first year");
	Scanner s1=new Scanner(System.in);
   year=s1.nextInt();

	System.out.println("enter last year ");
	last_year=s1.nextInt();

	while(year<=last_year)
	{
		System.out.println(year);
		year=year+4;
	}
    
  }
}