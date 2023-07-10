package io.github.paulor2811.postgresqlpromptdb.database.postgre.managedb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {
	
	String tbl_user_auth = "SELECT * FROM user_auth WHERE username = ?"; // Query SQL para buscar um registro na tabela
	String tbl_user_auth_all = "SELECT * FROM user_auth";
    
    public Fetch(Connection connection, String username) {
    	if(username.equals("all")) {
    		AllUsers(connection);
    		return;
    	}
        try {
            // Criação do objeto PreparedStatement
            PreparedStatement statement = connection.prepareStatement(tbl_user_auth);
            
            // Definir o valor do parâmetro
            statement.setString(1, username);
            
            // Executar a consulta
            ResultSet resultSet = statement.executeQuery();
            
            // Processar os resultados
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String foundUsername = resultSet.getString("username");
                String email = resultSet.getString("email");
                String senha = resultSet.getString("senha");
                System.out.println("ID: " + id + ", Username: " + foundUsername + ", Email: " + email + ", Senha: " + senha);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void AllUsers(Connection connection) {
    	try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(tbl_user_auth_all);

            while (resultSet.next()) {
                // Processar os dados de cada linha
            	int id = resultSet.getInt("id");
                String foundUsername = resultSet.getString("username");
                String email = resultSet.getString("email");
                String senha = resultSet.getString("senha");
                System.out.println("ID: " + id + ", Username: " + foundUsername + ", Email: " + email + ", Senha: " + senha);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
