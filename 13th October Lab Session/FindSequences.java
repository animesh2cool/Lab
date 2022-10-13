//Q. 3 Write a Java program to find sequences of lowercase letters joined with a underscore.

import java.util.regex.*;

public class FindSequences {
    public static String Find(String input) {
        if (input.matches("[a-z]+_[a-z]+")) {
            return "match found";
        }
        else {
            return "match not found";
        }
    }
    public static void main(String s[]) {
        System.out.println(Find("animesh_manna"));
        System.out.println(Find("animesh"));
        System.out.println(Find("Animesh_Manna"));
}
}