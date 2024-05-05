import java.io.*;
import java.util.*;   
   
class ReadFromFile 
{  
    public static void main(String[] args) 
    {  
        try 
        {  
            File f1 = new File("WriteFile.txt");    
            Scanner dataReader = new Scanner(f1);  
            
            while (dataReader.hasNextLine()) 
	    {  
                String fileData = dataReader.nextLine();  
                System.out.println(fileData);  
            }  
            dataReader.close();  
        } 
        catch (FileNotFoundException exception) 
        {  
            System.out.println("Unexcpected error occurred!");  
            exception.printStackTrace();  
        }  
    }  
}  
