package io.github.paulor2811.postgresqlpromptdb.client.actions;

import java.sql.Connection;
import java.util.Scanner;

import io.github.paulor2811.postgresqlpromptdb.database.postgre.managedb.Delete;

public class DeleteUser {

	private Scanner scanner;
	private int id;
	
	public DeleteUser(Connection connection) {
		
		scanner = new Scanner(System.in);
		
		System.out.print("Entre com o id de destino: ");
		id = scanner.nextInt();
		
		new Delete(connection, id);
	}	
}
