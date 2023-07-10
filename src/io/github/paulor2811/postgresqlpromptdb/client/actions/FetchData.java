package io.github.paulor2811.postgresqlpromptdb.client.actions;

import java.sql.Connection;
import java.util.Scanner;

import io.github.paulor2811.postgresqlpromptdb.database.postgre.managedb.Fetch;

public class FetchData {

	private Scanner scanner;
	private String username;
	
	public FetchData(Connection connection) {
		scanner = new Scanner(System.in);
		
		System.out.print("Entre com o username(all = todos): ");
		username = scanner.nextLine();
		
		new Fetch(connection, username);
	}	
}
