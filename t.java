class ThrowsDemo 
{
	static void throwOne() throws ArithmeticException 
	{
		System.out.println("Inside throwOne.");
		throw new ArithmeticException("demo");
	}
	public static void main(String args[]) 
	{
		try {
			throwOne();
			}
		 catch (ArithmeticException e) 
		{
			System.out.println("Caught " + e);
		}
	}
}