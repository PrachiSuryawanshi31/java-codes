import java.util.Scanner;
class for_odd_number
{
	public static void main(String[] args) {
		int i;
		int ino1;
		 int ino2;

		 System.out.println("enter first number for ino1");
         Scanner s1=new Scanner(System.in);
         ino1=s1.nextInt();

         System.out.println("enter last number for ino2");
         ino2=s1.nextInt();

         for(i=ino1;i>=ino2;i=i-2)
         {
         	System.out.println(i);
         }

	}
}