//import java.nio.file.Paths;
 //import java.nio.file.Path;
import java.nio.file.*;
public class Resolv_path
{ 
public static void main(String[] args) 
{ 
		Path p1 = Paths.get("C:\\users\\java"); 
		Path p2 = Paths.get("\\oracle\\python"); 
		Path p3 = p1.resolve(p2);	// add  the unexisting  path into p1 
		Path p4 = p2.resolve(p1);	//removes the path from p1 if existing
		
	
		Path p5 = Paths.get("d:\\Test");
		Path p6= p1.resolve(p2);				

	
		System.out.println(p3); 
		System.out.println(p4);
		System.out.println(p6);
}//end of method main 
}//end of class RelativizePaths
