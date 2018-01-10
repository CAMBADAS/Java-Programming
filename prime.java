class prime
{
	public static void main(String args[])throws ArithmeticException
	{
		int n=5;
		int c=0,i=1;
			while(i<=n)
			{
				if(n%i==0)
				{
					c++;
				}

				i++;
			}
			
			if( c==2)
				System.out.println("prime");
			else
				System.out.println("not prime");		
	
	}



}