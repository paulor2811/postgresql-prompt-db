package io.github.paulor2811.postgresqlpromptdb.client.actions;

import java.sql.Connection;
import java.util.Scanner;

import io.github.paulor2811.postgresqlpromptdb.database.postgre.managedb.Update;

public class EditData {

	private Scanner scanner;
	private String username, email, senha;
	private int id;
	
	public EditData(Connection connection) {
		scanner = new Scanner(System.in);
		
		
		/*
		 * Informações da tabela user_auth
		 */
		System.out.print("Entre com o novo username: ");
		username = scanner.nextLine();
		System.out.print("Entre com o novo email: ");
		email = scanner.nextLine();
		System.out.print("Entre com a nova senha: ");
		senha = scanner.nextLine();
		System.out.print("Entre com o id de destino: ");
		id = scanner.nextInt();
		
		/*
		 * Informações da tabela user_info
		 */
		
		//...
		
		new Update(connection, username, email, senha, id);
	}
}
