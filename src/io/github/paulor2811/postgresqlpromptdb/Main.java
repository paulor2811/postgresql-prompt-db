package io.github.paulor2811.postgresqlpromptdb;

import io.github.paulor2811.postgresqlpromptdb.client.Client;
import io.github.paulor2811.postgresqlpromptdb.database.postgre.ConnectionDB;

public class Main {

	public static void main(String[] args) {
		ConnectionDB connection = new ConnectionDB();
		new Client(connection.getConnection());
	}
}
