import java.io.*;
public class Buf_demo 
{

	public static void main(String[] args) 
	{
	try
	{			
		int n1,n2,res=0;
		
		InputStreamReader d=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(d);
		
		System.out.println("Enter the 1st number: ");
		n1=Integer.parseInt(br.readLine());
	
		System.out.println("Enter the 2nd number: ");
		n2=Integer.parseInt(br.readLine());
		
		res=n1+n2;
		
		System.out.println("The sum of "+n1+ "  and "+n2+" is :"+res);

	}
		
		catch(Exception e)
		{
			System.out.print(e);
			System.out.println("hello");
		}
		
		
		
	}

}
