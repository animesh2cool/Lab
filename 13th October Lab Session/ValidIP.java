//Q.2

import java.util.regex.*;

public class ValidIP {
    public static boolean validate(String ip) {
        String ZeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
        String regex = ZeroTo255 + "\\." + ZeroTo255 + "\\." + ZeroTo255 + "\\." + ZeroTo255;
        Pattern p = Pattern.compile(regex);
        if (ip == null) {
            return false;
        }
        Matcher m = p.matcher(ip);
        return m.matches();
     }

    public static void main(String s[]) {
        System.out.println("Output: " + validate("000.12.12.034"));
        System.out.println("Output: " + validate("23.45.12.56"));
        System.out.println("Output: " + validate("000.12.234.23.23"));
        System.out.println("Output: " + validate(".213.123.23.32"));
    }
    
}