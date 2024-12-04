package com.example.demo;



import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;

public interface TaskRepository extends FirestoreReactiveRepository<Task> {
}

