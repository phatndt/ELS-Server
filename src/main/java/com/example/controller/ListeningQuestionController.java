package com.example.controller;

import com.example.model.ListeningQuestion;
import com.example.repository.ListeningQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
