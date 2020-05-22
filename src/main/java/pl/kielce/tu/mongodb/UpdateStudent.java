package pl.kielce.tu.mongodb;

import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;

public class UpdateStudent extends Student{

    public void updateUser() {
        collection.updateOne(eq("_id", 2),
                new Document("$set", new Document("e-mail", "janek@gmail.com"))
        );
        for (Document doc : collection.find())
            System.out.println("Zmieniono dane studenta " + doc.toJson());

    }
}
