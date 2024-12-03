package com.example.demo;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FirestoreService {

    public String saveData(String collection, String documentId, Map<String, Object> data) {
        Firestore db = FirestoreClient.getFirestore();
        DocumentReference docRef = db.collection(collection).document(documentId);

        ApiFuture<WriteResult> result = docRef.set(data);
        try {
            return result.get().getUpdateTime().toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}