class perfect
{
	public static void main(String args[])throws ArithmeticException
	{
		int n=6;
		int i=1,f=0;
	while(i<=n)
	{
		if(n%i==0)
		{
			f=f+i;
				
		}
		i++;
	}

	System.out.println(f);
	if(f==2*n)
		System.out.println("perfect");
	else	
		System.out.println("not perfect");
		
	}



}