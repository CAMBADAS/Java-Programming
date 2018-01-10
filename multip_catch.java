public class throw_demo {

	public static void main(String[] args)
	{
			try
			{
						int n1=0,n2=0,f=0;
						n1=Integer.parseInt(args[0]);
						n2=Integer.parseInt(args[1]);
						System.out.println(n1/n2);
		
			}
			catch(ArithmeticException e)
			{
				System.out.println("denominator value is invalid");			
			}
			catch(NumberFormatException e)
			{
				System.out.println(args[0]+" or "+args[1]+" is not a number");			
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("two numbers are needed for division");			
			}
	}

}
