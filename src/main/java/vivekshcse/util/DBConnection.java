package vivekshcse.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con=null;
		
		
			Class.forName("com.mysql.jdbc.Driver");
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");	
			return con;
	}
	
}
