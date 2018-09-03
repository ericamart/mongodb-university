package com.mongodb.hw23;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        MongoClient client = new MongoClient();
        MongoDatabase database = client.getDatabase("students");
        MongoCollection<Document> collection = database.getCollection("grades");

        Bson filter = new Document("type", "homework");
        Bson sort = new Document("student_id", 1).append("score", 1);

        List<Document> all = collection.find(filter).sort(sort).into(new ArrayList<Document>());

        int studentIdAux = -1;
        for (Document doc : all) {
            int studentId = doc.getInteger("student_id");
            if (studentId != studentIdAux) {
                Bson filtroDelete = new  Document("_id", doc.getObjectId("_id"));
                collection.deleteOne(filtroDelete);
                studentIdAux = studentId;

            }
        }
    }
}
