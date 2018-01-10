class Test_break
{
	public static void main(String args[])
	{

		int i=1;
		while(i<5)
		{
			System.out.println("Square of "+ i +"is "+(i*i));
			i++;
			if(i<4) 
				continue;
			System.out.println("done .......");
		}		
	}

}