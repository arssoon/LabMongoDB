package pl.kielce.tu.mongodb;

import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;

public class DeleteStudent extends Student{
    public void deleteUser(){

        collection.deleteOne(eq("_id", 1));
        for (Document doc : collection.find())
            System.out.println("deleteOne(eq(\"_id\", 1)) " + doc.toJson());

    }
}
