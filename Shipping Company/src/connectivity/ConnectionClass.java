package connectivity;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionClass {
	
	public Connection connection;
	
	public Connection getConnection() {
				
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  //Connection String
			
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost;database=Shipping Company","testUser", "ahuevo123"); 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
}
