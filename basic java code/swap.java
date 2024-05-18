class swap
{
	public static void main(String[] args)
	 {
		int a=10;
		int b=50;

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("your swapping of a"+a);
		System.out.println("your swapping of b"+b);


		int x=100;
		int y=500;
		int z;


		z=x;
		x=y;
		y=z;

		System.out.println("your swapping of x"+x);
		System.out.println("your swapping of y"+y);

	}
}