package com.easybites.backend.Submission.repository;

import com.easybites.backend.Submission.model.Submission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubmissionRepository extends JpaRepository<Submission, Integer> {
    List<Submission> findAllByUserEmailAndQuizName(String userEmail, String quizName);
    List<Submission> findAllByUserEmail(String userEmail);
}
