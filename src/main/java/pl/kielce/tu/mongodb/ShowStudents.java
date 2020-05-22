package pl.kielce.tu.mongodb;

import org.bson.Document;

public class ShowStudents extends Student{

    public void showUsers() {
        int i = 1;
        for (Document doc : collection.find())
            System.out.println("Student - " + (i++) + " - " + doc.toJson());
    }
}
