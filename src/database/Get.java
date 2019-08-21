package database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Get{
	public ArrayList<String> get() throws Exception {
		try {
			GetConnection conexao = new GetConnection ();
			Connection con = conexao.getConnection();
			//PreparedStatement statement = con.prepareStatement("select g.nome,c.nome from gafanhotos as g join gafanhoto_assiste_curso as a on g.id = a.idgafanhoto join cursos as c on a.idcurso = c.idcurso;");
			PreparedStatement statement = con.prepareStatement("select * from gafanhotos as g;");
			ResultSet result = statement.executeQuery();
			
			ArrayList<String> array = new ArrayList<String>();
			while(result.next()) {
				System.out.print(result.getString("g.nome"));
				System.out.print(" | ");

				array.add(result.getString("g.nome"));
				array.add(result.getString("g.id"));
				array.add(result.getString("g.profissao"));
				array.add(result.getString("g.nascimento"));
				array.add(result.getString("g.sexo"));

			}
			System.out.println("Dados puxados e salvos na Array!");
			System.out.println(array);
			return array;
		}catch(Exception e) {
			System.out.println(e);
			}
		return null;
		} 
}