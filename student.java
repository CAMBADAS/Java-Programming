class student
{
	String name;
	int roll;
	String crs;int age;
	
	student()
	{
		roll=1234;
		name="roy";
		crs="Bsc";
	}
	student(int x,String y,String z)
	{
		roll=x;
		name=y;
		crs=z;
	}
	student(int roll,String name,String crs,int age)
	{
		this.roll=roll;
		name=name;
		crs=crs;
		age=age;
	}
	
	
	public static void main(String args[])
	{
		student s1=new student();
		student s2=new student(1007,"radha","BCOM");
		student s3=new student(1010,"krish","BZC",22);
		System.out.println(s1.roll+" "+s1.name+" "+s1.crs);
		System.out.println(s2.roll+" "+s2.name+" "+s2.crs);
			System.out.println(s3.roll+" "+s3.name+" "+s3.crs+" "+s3.age);
	}


}