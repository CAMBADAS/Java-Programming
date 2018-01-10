class Topper
{
		String name;
		int total,avgper;

		public void  setName(String nm)
		{
			name=nm;	
		}
		public void  setTotal(int t)
		{
			total=t;	
		}
		public void  setAvgPer(int ap)
		{
			avgper=ap;
		}
		public String  getName()
		{
			return name;
		}
		public int  getTotal()
		{
			return total;
		}
		public int  getAvgPer()
		{
			return avgper;
		}
}
	
class Result
{	
	public static void main(String args[])
	{
		Topper s1=new Topper();
		s1.setName("Anjali");
		s1.setTotal(545);
		s1.setAvgPer(75);

		Topper s2=new Topper();
		s2.setName("Aruna");
		s2.setTotal(580);
		s2.setAvgPer(60);
		
		System.out.println(s1.getName());
		System.out.println(s1.getTotal());
		System.out.println(s1.getAvgPer());

		
		System.out.println(s2.getName());
		System.out.println(s2.getTotal());
		System.out.println(s2.getAvgPer());

		if(s1.getTotal()>s2.getTotal())
		{
			if(s1.getAvgPer()>s2.getAvgPer())
				
				System.out.println(s1.getName()+" is Topper");	
	
		}
		else 
		{	
			System.out.println(s2.getName()+" is Topper");
			
		}
	}
}