package io.github.paulor2811.postgresqlpromptdb.client;

import java.sql.Connection;
import java.util.Scanner;

import io.github.paulor2811.postgresqlpromptdb.client.actions.DeleteUser;
import io.github.paulor2811.postgresqlpromptdb.client.actions.EditData;
import io.github.paulor2811.postgresqlpromptdb.client.actions.FetchData;
import io.github.paulor2811.postgresqlpromptdb.client.actions.RegisterUser;

public class Client {
	
	private Scanner scanner;
	private String input;
	
	public Client(Connection connection) {
		// Criação do objeto Scanner para ler a entrada do usuário
		scanner = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("\n==============================Bem vindo ao cliente de cadastro de usuários!!!==============================\n");
			System.out.println("Ações:\n1-Cadastrar usuário | 2-Editar dados | 3-Excluir cadastro | 4-Buscar usuário");
			input = scanner.nextLine(); // Ler a entrada do usuário
			
			switch (input) {
			    case "1":
			        // Código a ser executado se a expressao for igual a "1"
			    	new RegisterUser(connection);
			        break;
			    case "2":
			        // Código a ser executado se a expressao for igual a "2"
			    	new EditData(connection);
			        break;
			    case "3":
			        // Código a ser executado se a expressao for igual a "3"
			    	new DeleteUser(connection);
			        break;
			    case "4":
			        // Código a ser executado se a expressao for igual a "4"
			    	new FetchData(connection);
			        break;
			    // Adicione mais casos conforme necessário
			    default:
			        // Código a ser executado se a expressao não corresponder a nenhum caso
			    	System.out.println("Entrada inválida.");
			}
		}
	}
}
