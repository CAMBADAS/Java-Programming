class assert_demo
{
	void check(int x)
	{
		assert x>0:"must be positive";
		System.out.println("val of x is:"+x);
		
	}
	public static void main(String args[])
	{
	assert_demo ad=new assert_demo();
		ad.check(Integer.parseInt(args[0]));
	}

}