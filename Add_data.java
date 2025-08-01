package files;
						//3. Add_data into a file 
import java.io.File;
import java.util.Formatter;

public class Add_data {
	
	Formatter f;

// create, open file and store file in a variable
	public void Create_open_file()
	{
		try {   // taskz
			  f =	new Formatter("C:\\altek4\\z.txt"); // creates new file
			System.out.println("file created n opened..");
		}
		catch(Exception e) // Exception= error
		{
			 e.printStackTrace();
			System.out.println("Error: hai..u got an error");
		}
	}
// adding data in file
	
	public void add_data()
	{
		
		String name = "ram";
		
		f.format("%d %s %s ",04, name, "java");
		
		System.out.println(" data stored..");
	}
	
// closing File	
	public void close_file()
	{
		f.close();
		
		System.out.println("file closed..");
	}

	
	
	
	
}
