class string_buff_demo
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer();
		
		System.out.println("empty bffer: "+sb);
		System.out.println(sb.capacity());//16

		sb=sb.append("welcome");
		System.out.println("after append:"+sb);
		
		sb=sb.append("to Java");
		System.out.println("after append:"+sb);
			
		
		System.out.println("insert method:         "+sb.insert(5,"-------------"));

		//System.out.println("reverse :   "+sb.reverse());
		StringBuffer sb5=new StringBuffer("abcdefghij");
		System.out.println("replace  :   "+sb5.replace(4,6,"ooooppp"));
		
		System.out.println("char At :   "+sb.charAt(6));
		
		StringBuffer sb1=new StringBuffer("Hello");		
		sb1.setCharAt(4,'z');	//setCharAt(int index,char c)

		System.out.println(sb1);	
	}


}