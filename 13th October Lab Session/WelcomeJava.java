//Q.1
import java.util.StringTokenizer;

public class WelcomeJava {
    public static void main(String s[]) {

        //Problem Statement 1:
        String sentence = "Welcome to Java World";
        System.out.println(sentence.charAt(5));            // character at 5th position 
        String w = sentence.substring(0,7);
        System.out.println(sentence.compareToIgnoreCase(w));     //Compare lexicographically
        String con = "- Let us learn";
        System.out.println(sentence.concat(con));                //Concatenate
        System.out.println(sentence.indexOf("a"));          //position of the first occurrence of character ‘a’
        System.out.println(sentence.replace("a", "e"));   //replace of "a" with "e"
        System.out.println(sentence.substring(4,11));    //Returns string between 4th and 10th 
        System.out.println(sentence.toLowerCase());                           //Returns the lowercase 

        //Problem Statement 2:
        StringBuffer sbf = new StringBuffer("This is StringBuffer");
        System.out.println(sbf.append("- This is a sample program"));     //add string
        System.out.println(sbf.replace(14, 20, "Builder"));    //replace string
        System.out.println(sbf.insert(21,"Object"));              //Inserts string
        System.out.println(sbf.reverse());                                    //reverse string
        
        //Problem Statement 3:
        String ibm = "C:/IBM/DB2/PROGRAM/DB2COPY1.EXE";
        StringTokenizer st = new StringTokenizer(ibm);
        System.out.println("Drive: " + st.nextToken("/"));
        System.out.println("Folders: " + st.nextToken("/") + " || " + st.nextToken("/") +" || " + st.nextToken("/"));
        System.out.println("File: " + st.nextToken("/"));


    }
}
