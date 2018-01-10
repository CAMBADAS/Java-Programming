import java.util.Scanner;
class name_to_uni
{
	public static void main(String args[])
	{
		try{
			Scanner in=new Scanner(System.in);
			System.out.println("enter you name:");
			String nm=in.next();
			int i=0,j=0;
			String s;
			System.out.println(nm.length());
			System.out.println("char value"+(char)66);
		
			while(i<=nm.length())
			{
				if((int)(nm.charAt(i))<100)
				{
					
				}
				System.out.println(nm.charAt(i)+" --"+(int)(nm.charAt(i)));
				i++;		
			}
			System.out.println("enter unocode value:");
			int uc=in.nextInt();
			
		}
		catch(Exception e)
		{
		
		}
	}


}