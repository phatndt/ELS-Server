package com.example.repository;

import com.example.model.Listening;
import com.example.model.ListeningQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListeningQuestionRepository extends JpaRepository<ListeningQuestion, String> {
}
