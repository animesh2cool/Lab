import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws SQLException {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("************************************");
            System.out.println("Welcome To College Management System");
            System.out.println("************************************");
            System.out.println("Please Press 1 to Register : ");
            System.out.println("PleasePress 2 to log in : ");
            System.out.println("Please press 3 for exit");
            int c = s.nextInt();

            if (c == 1) {
                Random random = new Random();
                long sid = random.nextInt(999999999);
                System.out.println("Welcome! Your log in ID is : " + sid);
                System.out.println("Please Enter a Strong Password : ");
                String passw = s.next();
                while (!Pattern.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}",
                        String.valueOf(passw))) {
                    System.err.println("Please chose a strong password");
                    System.out.println("Please Enter password again");
                    passw = s.next();
                }
                ToRegister.generate(sid, passw);
            } else if (c == 2) {
                System.out.println("Please Enter your Id and Password :");
                long sid = s.nextLong();
                String passw = s.next();
                Details.show(sid, passw);
                Criteria.check(sid, passw);
            } else if (c == 3) {
                break;
            } else {
                System.out.println("Invalid Input please try again");
            }
        }
    }
}