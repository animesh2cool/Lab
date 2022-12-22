import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
	
	public class ConnectionApp {
	
	 static {
		 try {
		 	Class.forName("com.mysql.cj.jdbc.Driver");//registering my sql driver
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 	}
		 }
	 public static Connection con()throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip", "root","root");      // establish connection
	 }
}	