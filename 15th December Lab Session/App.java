import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.lang.Exception;

public class App {
        static {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");   // registering my sql driver
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        public static Connection con() throws SQLException {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip", "root",                                "Khanki4u@");
        }
        public static void main(String[] args) throws Exception {
            Scanner s = new Scanner(System.in);

            while (true) {
            System.out.println("**********************************");
			System.out.println("Welcome To College management System");
			System.out.println("**********************************");
            System.out.println("press 1 for New user Registration");
		    System.out.println("press 2 Login account with Id");
		    System.out.println("press 3 for Admission");
		    System.out.println("press 4 for Display details");
		    System.out.println("press 5 for update details");
		    System.out.println("press 6 for Log out");
            int c = s.nextInt();

            if (c == 1) {
                CollegeOperation.Registration();
            }
            else if (c == 2) {
                CollegeOperation.login();
            }
            else if (c == 3) {
                CollegeOperation.admission();
            }
            else if (c == 4) {
                CollegeOperation.display();
            }
            else if (c == 5) {
                CollegeOperation.update();
            }
            else if (c == 6) {
                break;
            }
            else {
                    System.out.println("Invalid Input please try again");
            }
            }
        }
    }