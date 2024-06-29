package com.easybites.backend.Submission.service;

import com.easybites.backend.Submission.model.Submission;
import com.easybites.backend.Submission.repository.SubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class SubmissionService {
    @Autowired
    SubmissionRepository submissionRepository;

    public String saveSubmission(Submission submission){
        return submissionRepository.save(submission).toString();
    }
    public int getProgress(String userEmail, String quizName){
        List<Submission> personal = submissionRepository.findAllByUserEmailAndQuizName(userEmail,quizName);
        boolean easy = false, med = false, hard = false;
        for(Submission s: personal){
            if(Objects.equals(s.getDifficulty(),"Easy"))  easy = true;
            if(Objects.equals(s.getDifficulty(),"Medium"))  med = true;
            if(Objects.equals(s.getDifficulty(),"Hard"))  hard = true;
        }
        if(hard) return 100;
        if(med) return 67;
        if(easy) return 33;
        return 0;
    }

    public List<Submission> getSubByEmail(String email){
        return submissionRepository.findAllByUserEmail(email);
    }
}
