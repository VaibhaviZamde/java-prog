
import java.io.*;   
class WriteToFile 
{  
        public static void main(String[] args) 
        {  
          
		try 
		{  
			 FileWriter fwrite = new FileWriter("WriteFile.txt");  
			 fwrite.write("Performing write operation to file");   
		       
			  fwrite.close();   
			  System.out.println("Content is successfully wrote to the file.");  
		} 
		catch (IOException e) 
		{  
			    System.out.println("Unexpected error occurred");  
			    e.printStackTrace();  
		}  
	}  
}  
