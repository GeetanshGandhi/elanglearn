package com.easybites.backend.Question.controller;

import com.easybites.backend.Question.model.Question;
import com.easybites.backend.Question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @PostMapping("/getByQuiz")
    public List<Question> getQuestionsByQuizName(@RequestBody String quiz){
        return questionService.getQuestionsByQuiz(quiz);
    }

    @PostMapping("/getByQuizAndDiff")
    public List<Question> getQuestionByQuizNameAndDifficulty(@RequestBody List<String> input){
        return questionService.getByQuizAndDifficulty(input.get(0),input.get(1));
    }

    @PostMapping("/saveAll")
    public List<Question> saveAllQues(@RequestBody List<Question> input){
        return questionService.saveAllQuestion(input);
    }
}
