package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    // Create or update a task (returns Mono<Task> for reactive handling)
    public Mono<Task> createTask(Task task) {
        return taskRepository.save(task);
    }

}


