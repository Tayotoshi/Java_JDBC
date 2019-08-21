package database;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Post {
	public  void post () throws Exception{
		final String var1 = "Igor";
		final String var2 = "Laranjeira";
		try {
			GetConnection conexao = new GetConnection ();
			Connection con = conexao.getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO tablename (first, last) VALUES ('"+var1+"','"+var2+"')");
			posted.executeUpdate();
			System.out.println("Dados Inseridos com Sucesso !");
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}