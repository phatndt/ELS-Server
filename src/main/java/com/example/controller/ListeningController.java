package com.example.controller;

import com.example.model.Listening;
import com.example.model.ListeningQuestion;
import com.example.repository.ListeningQuestionRepository;
import com.example.repository.ListeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ListeningController {
    @Autowired
    private ListeningRepository listeningRepository;
//    @Autowired
//    private ListeningQuestionRepository listeningQuestionRepository;

    @GetMapping("/listening")
    public List<Listening> getAllListening() {
        return listeningRepository.findAll();
    }

//    @GetMapping("/listeningQuestion")
//    public List<ListeningQuestion> getAllListeningQuestion() {
//        return listeningQuestionRepository.findAll();
//    }
}
