package com.easybites.backend.Submission.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

@Entity
public class Submission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int submissionId;
    private String dateOfSubmission;
    private String userEmail;
    private String quizName;
    private String difficulty;
    private int score;

    public int getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(int submissionId) {
        this.submissionId = submissionId;
    }

    public String getDateOfSubmission() {
        return dateOfSubmission;
    }

    public void setDateOfSubmission(String dateOfSubmission) {
        this.dateOfSubmission = dateOfSubmission;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "{" +
                "\"submissionId\":" + submissionId +
                ", \"dateOfSubmission\":\"" + dateOfSubmission + '\"' +
                ", \"userEmail\":\"" + userEmail + '\"' +
                ", \"quizName\":\"" + quizName + '\"' +
                ", \"difficulty\":\"" + difficulty + '\"' +
                ", \"score\":" + score +
                '}';
    }
}
