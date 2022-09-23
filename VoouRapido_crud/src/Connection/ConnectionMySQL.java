package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMySQL {
	public static Connection createConnectionMySQL() throws Exception{
		//carregar a classe pelo jvm
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//criar a conexão com o banco
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/voourapido?user=root&password=Wesley@52172819");
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception{
		
		//Recuperar a conexão com o banco
	Connection con = createConnectionMySQL();	
		
	// Teste de conexão

	if(con != null) {
		System.out.println(con + "\n **Conexão bem sucedidada**\n");
		con.close();
	}
		

	}

	 
}
