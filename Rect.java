class Rect
{
	int length,breadth;
	
	Rect(int x,int y)
	{
		length=x;
		breadth=y;
		
	}
	
	public void AREA()
	{
		System.out.println("the area is :"+(length*breadth));
	}
	
	public int PERIM()
	{
		return 2*(length+breadth);
	
	}
}
class use
{
	public static void main(String args[])
	{
		Rect r1=new Rect(20,50);
		r1.AREA();
		System.out.println("THE PERIMETER IS :"+r1.PERIM());	
	
	}	
	
	
}