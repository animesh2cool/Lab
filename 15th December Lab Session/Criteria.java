import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Criteria {
public static void check(long sid, String passw) throws SQLException {
	Connection conn = ConnectionApp.con();
	Statement stmt = conn.createStatement();
	ResultSet rs1 = stmt.executeQuery("select * from Registration where sid ="+ sid +" and passw ='"+passw+"'");
	while(rs1.next()) {
		String fname = rs1.getString(2);
		String lname = rs1.getString(3);
		String sadd = rs1.getString(4);
		int phone = rs1.getInt(5);
		double per10 = rs1.getDouble(6);
		double per12 = rs1.getDouble(7);
		int yop = rs1.getInt(8);
		if(per10 > 60 && per12 > 60) {
			System.err.println("Congratulations!! You are eligible for admission");
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter which Department you want admission : ");
			String dept = sc.next();
			PreparedStatement stmt1=conn.prepareStatement("insert into Admission values(?,?,?,?,?,?,?,?,?,?)");
	    	stmt1.setLong(1, sid);
	    	stmt1.setString(2, fname);
	    	stmt1.setString(3, lname);
	    	stmt1.setString(4, sadd);
	    	stmt1.setInt(5, phone);
	    	stmt1.setDouble(6, per10);
	    	stmt1.setDouble(7, per12);
	    	stmt1.setInt(8, yop);
	    	stmt1.setString(9, passw);
	    	stmt1.setString(10, dept);
	    	stmt1.executeUpdate();
	    	System.out.println("You have been successfully enroled in " + dept);
		}
		else {
			System.err.println("Sorry!! You are not eligible for admission !");
		}
	}
}
}