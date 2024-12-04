package com.example.demo;

import com.google.cloud.firestore.annotation.DocumentId;
import com.google.cloud.spring.data.firestore.Document;
import org.springframework.data.annotation.Id;

@Document(collectionName = "tasks")
public class Task {

    @DocumentId
    private String id;
    private String title;
    private String description;

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Constructor
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Task() {
    }
}

