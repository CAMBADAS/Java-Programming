class string_intro
{
	public static void main(String args[])
	{
	String s1=new String("welcome to java");
	String s6="Hello world";
	System.out.println("substring demo:"+s6.substring(2,6));
		
	


	String s2=" hello";
	System.out.println(s1+s2);
	
	System.out.println("length() of s1:	"+s1.length());
		
	for(int i=0;i<s1.length();i++)
	{
		System.out.println("char at "+i+" :       "+s1.charAt(i));
	
	}

	System.out.println("after concat:  "+s1.concat(s2));

	System.out.println("substring after index 5	:"+s1.substring(5));

	System.out.println("substring	:"+s1.substring(0,7));

	String s3="HELLO";// s2 has "hello"
	String s4="Hello"; 
	System.out.println("equals() 	"+s1.equals(s3)); //returns false

	System.out.println("equals ignore() 	"+s3.equalsIgnoreCase(s4)); 

	String ob="done";
		System.out.println("to string "+ob.toString());

		

	if (s1 == s3)
	 {
		System.out.println(" s1 and s2 have the same reference");
	}
	System.out.println("compared:"+s1.compareTo(s2));



	if (s1.compareTo(s2) > 0) 
	{
			 System.out.println("s1 is greater than s2");
	}
	
	String p="My name is Java";
	String p1="     Java has oops    ";
	System.out.println(p.toLowerCase());
	System.out.println(p.toUpperCase());
	System.out.println("after trim  :"+p1.trim());

	System.out.println("index of ():	"+p.indexOf('M'));
	System.out.println("index of  meth2():	"+p.indexOf("name"));
	
	System.out.println("index of ():	"+p.indexOf('n',1));	

	String q="OOPS";
	System.out.println(p.replace(p,q));
	System.out.println(p.replace('a','A'));

		
	
	
	}
}