package com.mongodb.hw31;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;


public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        MongoClient client = new MongoClient();
        MongoDatabase database = client.getDatabase("school");
        MongoCollection<Document> collection = database.getCollection("students");

//        Bson filter = new Document("name", "Aurelia Menendez");
        Bson sort = new Document("student_id", 1);

        List<Document> all = collection.find().sort(sort).into(new ArrayList<Document>());

        for (Document student : all) {
            System.out.println("Student: " + student);
            List<Document> scores = (List) student.get("scores");

            double minScore = Double.MAX_VALUE;
            Document scoreDelete = null;

            for (Document scoreStudent : scores) {
                String type = (String) scoreStudent.get("type");
                double score = (double) scoreStudent.get("score");
                System.out.println("Type: " + type + ", score: " + score);

                if (type.equals("homework") && score < minScore) {
                    minScore = score;
                    scoreDelete = scoreStudent;
                }
            }

            if (scoreDelete != null) {
                scores.remove(scoreDelete);
            }
            System.out.println("Scores: " + scores);

            // Actualizamos el elemento en la colección

            collection.updateOne(Filters.eq("_id", student.get("_id")),
                    new Document("$set", new Document("scores", scores)));

        }
    }
}
