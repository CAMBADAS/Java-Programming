//import java.nio.file.Path;
import java.nio.file.*;
public class Relat_path
{ 
public static void main(String[] args) 
{ 
Path p1 = Paths.get("C:\\users"); 
		Path p2 = Paths.get("C:\\java\\examples"); 
		Path p3 = Paths.get("data.txt"); 
		Path p4 = Paths.get("blueJ.pdf"); 
		
	
		Path p5 = p1.relativize(p2);//		..\..\java\\examples 
		Path p6= p2.relativize(p1);//		

		Path p7 = p3.relativize(p4); 
	
		System.out.println(p5); 
System.out.println(p6);System.out.println(p7);
}//end of method main 
}//end of class RelativizePaths 
