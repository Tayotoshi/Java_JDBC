package database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateTable{
	// Método da Classe
	
	public void createTable () throws Exception{
		try {
			GetConnection conexao = new GetConnection ();
			Connection con = conexao.getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS tablename(id int not null auto_increment, first varchar(30),last varchar (30), primary key(id))");
			create.executeUpdate();
			System.out.println("Table Created !");
		}catch(Exception e) {System.out.println(e);}
		
	}
}
