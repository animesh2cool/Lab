//Q.3 Write a Java program to find the longest word in a text file.

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileLongestWord {
     public static void main(String [ ] args) throws FileNotFoundException {
              new FileLongestWord().findLongestWords();
         }

     public String findLongestWords() throws FileNotFoundException {
       String longest_word = "";
       String current;
       Scanner sc = new Scanner(new File("C:/Users/Animesh/Desktop/Java/File/file1.txt"));

       while (sc.hasNext()) {
          current = sc.next();
           if (current.length() > longest_word.length()) {
             longest_word = current;
           }

       }
         System.out.println("\n"+longest_word+"\n");
            return longest_word;
            }
}