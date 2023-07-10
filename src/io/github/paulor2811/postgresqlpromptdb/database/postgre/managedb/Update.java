package io.github.paulor2811.postgresqlpromptdb.database.postgre.managedb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	
	String tbl_user_auth = "UPDATE user_auth SET username = ?, email = ?, senha = ? WHERE id = ?"; // Query SQL para atualizar um registro na tabela
	
	public Update(Connection connection, String username, String email, String senha, int id) {
		try {
			// Criação do objeto PreparedStatement
	        PreparedStatement statement = connection.prepareStatement(tbl_user_auth);
	        
	        // Definir os valores dos parâmetros
	        statement.setString(1, username);
	        statement.setString(2, email);
	        statement.setString(3, senha);
	        statement.setInt(4, id); // ID do registro a ser atualizado
	        
	        // Executar a atualização
	        int rowsUpdated = statement.executeUpdate();
	        System.out.println("Registros atualizados: " + rowsUpdated);
	        
		} catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
}
