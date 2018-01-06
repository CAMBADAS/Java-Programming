class Student 
{
	public int marks=0;
	
	public void  set_marks(int x)
	{
		marks=x;	
	}
	public int  get_marks( )
	{
		return marks;	
	}
	
	public static void main(String[] args) 
	{
	
		try{
			
			//Student s=new Student();
		
			Student students[] = new Student[5];
			students[0] = new Student(); // 
			students[1] = new Student(); // 
			students[2] = new Student(); // 
			students[3] = new Student(); //
			students[4] = new Student(); //
		
		
			for(int i=0;i<students.length;i++)
			{
				//System.out.println(students[i].marks);
				students[i].set_marks(i);
			}
			for(int i=0;i<students.length;i++)
			{
				System.out.println(students[i].get_marks());
			}
		}
		catch(Exception e)
		{
			System.out.println("ee");
		}
	}
}
