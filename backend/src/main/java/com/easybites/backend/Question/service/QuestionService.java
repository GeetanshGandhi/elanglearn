package com.easybites.backend.Question.service;

import com.easybites.backend.Question.model.Question;
import com.easybites.backend.Question.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionRepository questionRepository;

    public List<Question> getQuestionsByQuiz(String quiz){
        return questionRepository.findAllByQuizName(quiz);
    }

    public List<Question> getByQuizAndDifficulty(String quiz, String difficulty){
        return questionRepository.findAllByQuizNameAndDifficulty(quiz,difficulty);
    }
    public List<Question> saveAllQuestion(List<Question> questions){
        return questionRepository.saveAll(questions);
    }
}
