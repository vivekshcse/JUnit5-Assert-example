package vivekshcse.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionSingleTon {
 
	 private static Connection con = null;
	
	
		static {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
				
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		
		public static Connection getCon() {
			return con;
		}
	
}
