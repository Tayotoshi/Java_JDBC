package database;
import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
	
	// Método da classe
	
	public Connection getConnection () throws Exception{
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/cadastro";
			String username ="root";
			String password = "";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
			return conn;
			
		} catch (Exception e) {
			System.out.println(e);
			}
		
		return null;
	}
}