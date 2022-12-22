import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ToRegister {
	static Scanner sc = new Scanner(System.in);
	public static void generate(long sid, String passw) throws SQLException {
		System.out.println("Please Enter your First name : ");
		String fname = sc.next();
		System.out.println("Please Enter your Last name : ");
		String lname = sc.next();
		System.out.println("Please Enter your address : ");
		String sadd = sc.next();
		System.out.println("Please Enter your phone number : ");
		int phone = sc.nextInt();
		System.out.println("Please Enter your 10th overall percentage : ");
		double per10 = sc.nextDouble();
		System.out.println("Please Enter your 12th overall percentage : ");
		double per12 = sc.nextDouble();
		System.out.println("Please Enter your Passing year(12th) : ");
		int yop = sc.nextInt();
		
		Connection conn = ConnectionApp.con();
		PreparedStatement stmt1=conn.prepareStatement("insert into Registration values(?,?,?,?,?,?,?,?,?)");
    	stmt1.setLong(1, sid);
    	stmt1.setString(2, fname);
    	stmt1.setString(3, lname);
    	stmt1.setString(4, sadd);
    	stmt1.setInt(5, phone);
    	stmt1.setDouble(6, per10);
    	stmt1.setDouble(7, per12);
    	stmt1.setInt(8, yop);
    	stmt1.setString(9, passw);
    	stmt1.executeUpdate();
    	System.err.println("Registration Successful");
	}
}