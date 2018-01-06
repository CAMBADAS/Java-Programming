class t123
{
 public static void main(String args[])
 {
	 int num=10,count=0;
	 for(int i=1;i<=num;i++)
	 {
		 for(int j=1;j<=i;j++)
		 {
			 if(i%j==0)
			 {
				 count++;
			}
		  }
		 if(count==2)
			 System.out.println(i);
		
	 }

 }
}