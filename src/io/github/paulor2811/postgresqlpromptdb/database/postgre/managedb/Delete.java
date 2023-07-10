package io.github.paulor2811.postgresqlpromptdb.database.postgre.managedb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	String tbl_user_auth = "DELETE FROM user_auth WHERE id = ?"; // Query SQL para excluir um registro da tabela
    
    public Delete(Connection connection, int id) {
        try {
            // Criação do objeto PreparedStatement
            PreparedStatement statement = connection.prepareStatement(tbl_user_auth);
            
            // Definir o valor do parâmetro
            statement.setInt(1, id); // ID do registro a ser excluído
            
            // Executar a exclusão
            int rowsDeleted = statement.executeUpdate();
            System.out.println("Registros excluídos: " + rowsDeleted);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
