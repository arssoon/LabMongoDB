package pl.kielce.tu.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class CreateStudent extends Student {

    public void createUser() {

        Document student1 = new Document("_id", 1)
                .append("imie", "Arkadiusz")
                .append("nazwisko", "Sobol")
                .append("e-mail", "areksobol@tu.kielce.pl");
        collection.insertOne(student1);

//        Document first = student.collection.find().first();
//        System.out.println("find().first() " + first.toJson());

        Document student2 = new Document("_id", 2)
                .append("imie", "Jan")
                .append("nazwisko", "Nowak")
                .append("e-mail", "jannowak@tu.kielce.pl");
        collection.insertOne(student2);

        for (Document doc : collection.find())
            System.out.println("find() " + doc.toJson());
    }
}
