//Problem: 2.   Wite a program in Java to create a file in Java using Exception Handling.

import java.io.File;
import java.io.IOException;
public class FileCreation {  
public static void main(String[] args) {     
    File file = new File("C:\\Users\\Animesh\\Desktop\\Java\\newfile.txt");     //initialize File object and passing path 
    boolean result;  
    try {  
        result = file.createNewFile();              // creates a new file  
        if(result)                                  // if file created
            {  
                System.out.println("file created at location "+file.getCanonicalPath());         //return the path 
            }  
        else  
            {  
                System.out.println("File already exist at location: "+file.getCanonicalPath());  // if already exist return path
            }  
        }   
    catch (IOException e)   
        {  
            e.printStackTrace();                //print exception
        }         
    }  
}