package files;            // Files
                         // 1. Check file
					
import java.io.File;

public class Check_file {

	public static void main(String[] args) {
		
		File  x = new File("C:\\altek\\z.txt"); // any path/server path/table address/url
		
		// con(add)
		 
	
		if( x.exists()  ) // boolean cond
		{
			System.out.println("file existed");
		}
		else
		{
			System.out.println("file doesn't existed");
		}
			
	}

}
