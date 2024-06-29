package com.easybites.backend.Question.repository;

import com.easybites.backend.Question.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    List<Question> findAllByQuizName(String quizName);
    List<Question> findAllByQuizNameAndDifficulty(String quizName, String difficulty);
}
