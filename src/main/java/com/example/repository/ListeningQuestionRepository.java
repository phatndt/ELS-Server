package com.example.repository;

import com.example.model.ListeningQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListeningQuestionRepository extends JpaRepository<ListeningQuestion, String> {
    @Query(value = "SELECT * FROM listeningquestion WHERE listeningid = ?1", nativeQuery = true)
    List<ListeningQuestion> getListeningQuestionByLesson(String id);
}
