package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/firestore")
public class FirestoreController {

    private final FirestoreService firestoreService;

    public FirestoreController(FirestoreService firestoreService) {
        this.firestoreService = firestoreService;
    }

    @PostMapping("/save")
    public String saveData(@RequestParam String collection, @RequestParam String documentId, @RequestBody Map<String, Object> data) {
        return firestoreService.saveData(collection, documentId, data);
    }
}
