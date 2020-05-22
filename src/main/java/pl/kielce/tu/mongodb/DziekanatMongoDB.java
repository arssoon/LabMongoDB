package pl.kielce.tu.mongodb;
import java.util.Scanner;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class DziekanatMongoDB {

	public static void main(String[] args) {

		String user = "dziekanat";
		String password = "dziekanat";
		String host = "localhost";
		int port = 27017;
		String database = "database02";

		String clientURI = "mongodb://" + user + ":" + password + "@" + host + ":" + port + "/" + database;
		MongoClientURI uri = new MongoClientURI(clientURI);

		CreateStudent createStudent = new CreateStudent();
		DeleteStudent deleteStudent = new DeleteStudent();
		UpdateStudent updateStudent = new UpdateStudent();
		ShowStudents showStudents = new ShowStudents();

		MongoClient mongoClient = new MongoClient(uri);

		MongoDatabase db = mongoClient.getDatabase(database);

		db.getCollection("dziekanat").drop();

		Scanner scan = new Scanner(System.in);
		Integer optionMenu;

		System.out.print("\nWitaj w DZIEKANACIE. Wybierz jedną z opcji poniżej.\n");

	while(true) {

		System.out.println("--------------------------------------------------------------------");
		System.out.println("1 - Dodawanie studenta.");
		System.out.println("2 - Aktualizacja danych studenta.");
		System.out.println("3 - Usuwanie danych studenta.");
		System.out.println("4 - Wyświetl dane studenta.");
		System.out.println("5 - WYJŚCIE.");

		System.out.print("Wybierz opcję: ");
		optionMenu = scan.nextInt();

		if (optionMenu == 1) {
			//Tworzenie studenta
			createStudent.createUser();
			mongoClient.close();
		}
		else if (optionMenu == 2) {
			//Aktualizowanie danych studenta
			updateStudent.updateUser();
			mongoClient.close();
		}
		else if (optionMenu == 3) {
			// Usuwanie studenta
			deleteStudent.deleteUser();
			mongoClient.close();
		}
		else if (optionMenu == 4) {
			// Wyświetlanie danych z bazy
			showStudents.showUsers();
			mongoClient.close();
		}
		else if (optionMenu == 5) {
			mongoClient.close();
			break;
		}
	}

	}
}