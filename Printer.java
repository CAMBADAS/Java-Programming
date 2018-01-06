class Printer
{
  int a[]={1,2,3};
    String s[]={"hello","world"}; 
   public void printarray()
   {
       for(int i=0;i<a.length;i++)
       {
           System.out.println(a[i]);
       }
        for(int i=0;i<s.length;i++)
       {
           System.out.println(s[i]);
       }
   }
    public static void main(String args[] )
    {
        Printer p=new Printer();
        p.printarray();
    }
 
}