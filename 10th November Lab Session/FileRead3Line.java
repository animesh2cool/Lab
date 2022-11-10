//Q.2 Write a Java program to read first 3 lines from a file

import java.io.FileNotFoundException;
import java.io.LineNumberReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
 
public class FileRead3Line {
        public static void main(String[] args){
        String strLine = "";
        try {
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("C:/Users/Animesh/Desktop/Java/File/file1.txt"), "UTF-8"));        // reading file
             while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 3){                // logic for reading three line
                System.out.println(strLine);
            }
           reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");               // catching file not found Exception
        } catch (IOException e) {
            System.err.println("Unable to read the file.");     // catching invalid file Exception
        }
     }
}