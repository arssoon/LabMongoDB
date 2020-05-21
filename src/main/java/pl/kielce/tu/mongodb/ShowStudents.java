package pl.kielce.tu.mongodb;

import org.bson.Document;

public class ShowStudents extends Student{

    public void showUsers() {
        for (Document doc : collection.find())
            System.out.println("find() " + doc.toJson());
    }
}
