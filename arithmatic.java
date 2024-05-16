/*
write a code to calculate following operations between two numbers
Addition
substraction
multiplication
division
modulus
Every operation should be carried out in a separate method
*/

/*class Arithmatic
{
	int n1,
	int n2;
	
	void add()
	{
		System.out.println("Addition="+(n1+n2));
	}
	void sub()
	{
		System.out.println("Substraction="+(n1-n2));
	}
	void mul()
	{
		System.out.println("Multiplication="+(n1*n2));
	}
	void div()
	{
		System.out.println("Division="+(n1/n2));
	}
	void mod()(
		{
			System.out.println("Modulus="+(n1%n2));
		}
		
	public static void main(String[] arg){
			Arithmatic a=new Arithmatic();
			a.n1=10;
			a.n2=2;
			a.add();
			a.sub();
			a.mul();
			a.div();
			a.mod();
		}
	}
	//or
	*/
	import java.util.Scanner;
	class Arithmatic
	{
		static int ino1;
		static int ino2;
		static int ino3;

		
	
	void add()
	{
		ino3=ino1+ino2;
		System.out.println("Addition="+ino3);
	}
	void sub()
	{
		ino3=ino1-ino2;
		System.out.println("Substraction="+ino3);
	}
	void mul()
	{ 
		ino3=ino1*ino2;
		System.out.println("Multiplication="+ino3);
	}
	void div()
	{   
		ino3=ino1/ino2;
		System.out.println("Division="+ino3);
	}
	void mod()
	{   
		ino3=ino1%ino2;
		System.out.println("Modulus="+ino3);
	}
	
public static void main(String[] arg)
{       
	System.out.println("enter value of ino1 and ino2");
			Scanner s1=new Scanner(System.in);
		ino1=s1.nextInt();
		ino2=s1.nextInt();
		System.out.println("-----------------------------------------");
		Arithmatic a=new Arithmatic();
		
		a.add();
		a.sub();
		a.mul();
		a.div();
		a.mod();
		System.out.println("--------------------------------------");
	}
}

