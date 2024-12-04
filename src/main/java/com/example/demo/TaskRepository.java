package com.example.demo;



import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TaskRepository extends FirestoreReactiveRepository<Task> {
}

