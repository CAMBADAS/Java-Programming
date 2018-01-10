//design of exception

import java.lang.*;
class TaskException extends Exception
{
	public TaskException(String s)
	{
		super(s);		
	}
	public String toString()
	{
		return "Exception in thread \"main\" TaskException:"+getMessage();
	} 



	public static void main(String[] args)
	{
			try
			{
				throw new TaskException("testing exception");
			}
			catch(TaskException e)
			{
				System.out.println(e);			
			}
	}

}
