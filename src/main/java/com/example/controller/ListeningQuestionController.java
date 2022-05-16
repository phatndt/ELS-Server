package com.example.controller;

import com.example.exception.ResourceNotFoundException;
import com.example.model.ListeningQuestion;
import com.example.repository.ListeningQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ListeningQuestionController {
    @Autowired
    private ListeningQuestionRepository listeningQuestionRepository;

    @GetMapping("/listeningQuestion")
    public List<ListeningQuestion> getAllListeningQuestion() {
        return listeningQuestionRepository.findAll();
    }

    @GetMapping("/listeningQuestion/{id}")
    @SuppressWarnings (value="unchecked")
    public List<ListeningQuestion> getListeningQuestionByListeningLesson(@PathVariable String id) {
        return (List<ListeningQuestion>) listeningQuestionRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Resource not found"));
    }
}
