package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // Create or update a task
    @PostMapping
    public Mono<Task> createTask(@RequestBody Task task) {
         var x = taskService.createTask(task);
         return x;
    }
}

