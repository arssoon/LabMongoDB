package pl.kielce.tu.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Student {


        String user = "dziekanat";
        String password = "dziekanat";
        String host = "localhost";
        int port = 27017;
        String database = "database02";

        String clientURI = "mongodb://" + user + ":" + password + "@" + host + ":" + port + "/" + database;
        MongoClientURI uri = new MongoClientURI(clientURI);

        MongoClient mongoClient = new MongoClient(uri);

        MongoDatabase db = mongoClient.getDatabase(database);

        MongoCollection<Document> collection = db.getCollection("dziekanat");

}
