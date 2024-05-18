class rev
{
	public static void main(String[] args)
	 {
		int n=1234;
		int a,b,c,d,rev;

        a=n%10;
        n=n/10;

        b=n%10;
        n=n/10;


        c=n%10;
        n=n/10;

        d=n%10;
        n=n/10;

        rev=(a*1000)+(b*100)+(c*10)+(d*1);
        System.out.println("rev ="+rev);
	}
}