package com.job_app.repostory;

import com.job_app.collection.JobPosts;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SearchImplemantation implements serchingrepostory{

    @Autowired
    MongoClient mongoClient;

    @Autowired
    MongoConverter converter;

    @Override
    public List<JobPosts> findAllPostByText(String text) {
        ArrayList<JobPosts> posts=new ArrayList<>();


        MongoDatabase database = mongoClient.getDatabase("chamod");
        MongoCollection<Document> collection = database.getCollection("job_posts");
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
                        new Document("text",
                                new Document("query", text).append("path", Arrays.asList("skill_set", "job_role", "description")))),
                new Document("$sort", new Document("years_of_experience", 1L)), new Document("$limit", 3L)));

        result.forEach(document -> posts.add(converter.read(JobPosts.class,document)));
        return  posts;
    }
}
