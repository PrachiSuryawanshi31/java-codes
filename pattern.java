class pattern1
{    
	int n=7;
	int d=1;
	public static void main(String[] args)
	 {
		int i;
		int j;

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=(n/2+1);j++)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     )
			{
				if(j>=d)
				{
   					System.out.print("*");
				}
			    else
			    {
			       System.out.println("");
			    }
			}
			if(i<=n/2)
			{
				d++;
			}
			else
			{
				d--;
			}
		}
	}
}