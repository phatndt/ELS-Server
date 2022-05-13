package com.example.repository;

import com.example.model.Listening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ListeningRepository extends JpaRepository<Listening, String> {
}
